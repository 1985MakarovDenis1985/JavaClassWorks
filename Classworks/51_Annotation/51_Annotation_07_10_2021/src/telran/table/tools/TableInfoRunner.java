package telran.table.tools;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import telran.table.annotation.Id;
import telran.table.annotation.Index;
import telran.table.annotation.Table;

public class TableInfoRunner {

	public static void runInfo(Class<?> clazz) {
		if (!clazz.isAnnotationPresent(Table.class)) {
			return;
		}
		Table tableAnn = clazz.getAnnotation(Table.class);
		String tableName = "".equals(tableAnn.value()) ? clazz.getSimpleName() : tableAnn.value();
		String idFieldName = null;
		List<String> uniqueIndexeNames = new ArrayList<>();
		List<String> nonUniqueIndexeNames = new ArrayList<>();
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			// handle @Id
			if (field.isAnnotationPresent(Id.class)) {
				if (idFieldName != null) {
					throw new RuntimeException("Id duplicated");
				}
				idFieldName = field.getName();
			}
			// handle @Index
			Index indexAnn = field.getAnnotation(Index.class);
			if (indexAnn != null) {
				if (indexAnn.unique()) {
					uniqueIndexeNames.add(field.getName());
				} else {
					nonUniqueIndexeNames.add(field.getName());
				}
			}
		}
		if (idFieldName == null) {
			throw new RuntimeException("No Id is defined");
		}
		displayInfo(tableName, idFieldName, uniqueIndexeNames, nonUniqueIndexeNames);
	}

	private static void displayInfo(String tableName, String idFieldName, List<String> uniqueIndexeNames,
			List<String> nonUniqueIndexeNames) {
		System.out.println("Table: " + tableName);
		System.out.println("Id: " + idFieldName);
		System.out.println("\tUnique indexes");
		uniqueIndexeNames.forEach(System.out::println);
		System.out.println("\tNonunique indexes");
		nonUniqueIndexeNames.forEach(System.out::println);

	}

}

package telran.Annotation.tools;

import telran.Annotation.Id;
import telran.Annotation.Index;
import telran.Annotation.Table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class TableInfoRunner {
    public static void runInfo(Class<?> clazz) {
        if (!clazz.isAnnotationPresent(Table.class)) return;
        Table tableAnn = clazz.getAnnotation(Table.class);
        String tableName = "".equals(tableAnn.value()) ? clazz.getSimpleName() : tableAnn.value();

        String idFieldName = null;
        List<String> uniqueIndexName = new ArrayList<>();
        List<String> nonUniqueIndexName = new ArrayList<>();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            // handle @Id
            if (field.isAnnotationPresent(Id.class)) {
                if (idFieldName != null) {
                    throw new RuntimeException("Id duplicate");
                }
                idFieldName = field.getName();
            }
            // handle @Index
            Index indexAnn = field.getAnnotation(Index.class);
            if (indexAnn != null) {
                if (indexAnn.unique()) {
                    uniqueIndexName.add(field.getName());
                } else {
                    nonUniqueIndexName.add(field.getName());
                }
            }
        }
        if (idFieldName == null) {
            throw new RuntimeException("No Id is defined");
        }

        displayInfo(tableName, idFieldName, uniqueIndexName, nonUniqueIndexName);
    }

    private static void displayInfo(String tableName, String idFieldName, List<String> uniqueIndexName, List<String> nonUniqueIndexName) {
        System.out.println("Table: " + tableName);
        System.out.println("Id: " + idFieldName);
        System.out.println("\tUnique indexes");
        System.out.println("Table: " + tableName);
    }
}

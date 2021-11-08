package telran.list.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsAppl {

	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		list.add("Java");
//		list.add("SQL");
//		list.add("MongoDB");
//		list.add("Spring");
//		list.add("Hibernate");
//		list.add("Kafka");
//		list.add("Docker");
//		list.add("HTML");
//		list.add("CSS");
//		list.add("Bootstrap");
//		list.add("Javascript");
//		list.add("jQuery");
//		list.add("React");
//		list.add("Redux");
//		list.add("Typescript");
		List<String> list = new LinkedList<>(Arrays.asList("Java", "SQL", "MongoDB", "Spring", "Hibernate"));
		printList(list);
		list.add("Kafka");
		Collections.sort(list);
		printList(list);
		int index = Collections.binarySearch(list, "React");
		System.out.println(index);
		Collections.sort(list, (a,b) -> Integer.compare(a.length(), b.length()));
		printList(list);
	}

	private static void printList(List<String> list) {
		list.forEach(s -> System.out.println(s));
		System.out.println("=====================");
	}

}

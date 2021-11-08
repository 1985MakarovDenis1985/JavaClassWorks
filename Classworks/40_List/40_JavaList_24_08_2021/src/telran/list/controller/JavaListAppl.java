package telran.list.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JavaListAppl {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("Java");
		list.add("SQL");
		list.add("MongoDB");
		list.add("Spring");
		list.add("Hibernate");
		list.add("Kafka");
		list.add("Docker");
		list.add("HTML");
		list.add("CSS");
		list.add("Bootstrap");
		list.add("Javascript");
		list.add("jQuery");
		list.add("React");
		list.add("Redux");
		list.add("Typescript");
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("===================");
		list.forEach(s -> System.out.println(s));
		System.out.println("===================");
		list.removeIf(s -> s.startsWith("Java"));
//		Correct
//		Iterator<String> iterator = list.iterator();
//		while(iterator.hasNext()) {
//			String str = iterator.next();
//			if(str.startsWith("Java")) {
//				iterator.remove();
//			}
//		}
		
//		Wrong way
//		for (String str : list) {
//			if(str.startsWith("Java")) {
//				list.remove(str);
//			}
//		}
		list.forEach(s -> System.out.println(s));
		System.out.println("===================");
	}

}

package telran.list.controller;

import telran.list.interfaces.IList;
import telran.list.model.MyLinkedList;

public class MyListAppl {

	public static void main(String[] args) {
		IList<String> myList = new MyLinkedList<>();
		System.out.println(myList.isEmpty());
		myList.add("Boston");
		myList.add("Atlanta");
		myList.add("Chicago");
		myList.add("New York");
		myList.add(null);
		myList.add("Detroit");
		System.out.println(myList.size());
		System.out.println(myList.isEmpty());
		System.out.println(myList.get(1));
		System.out.println(myList.get(3));
		
		System.out.println(myList.indexOf("Atlanta"));
		System.out.println(myList.indexOf("Detroit"));
		System.out.println(myList.indexOf(null));
		System.out.println(myList.contains("Chicago"));
		System.out.println(myList.contains(null));
		myList.remove(4);
		System.out.println(myList.contains(null));
//		myList.add(myList.size(), "York");
//		System.out.println("=========================");
//		Iterator<String> iterator = myList.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		System.out.println("=========================");
//		iterator = myList.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		for (String str : myList) {
//			System.out.println(str);
//		}
	}

}

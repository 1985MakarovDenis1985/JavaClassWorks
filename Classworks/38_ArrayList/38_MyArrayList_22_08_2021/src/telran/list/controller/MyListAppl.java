package telran.list.controller;

import telran.list.interfaces.IList;
import telran.list.model.MyArrayList;

public class MyListAppl {

	public static void main(String[] args) {
		IList<String> myList = new MyArrayList<>(3);
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
	}

}

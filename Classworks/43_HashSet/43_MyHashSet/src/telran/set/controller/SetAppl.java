package telran.set.controller;

import telran.set.interfaces.ISet;
import telran.set.model.MyHashSet;

public class SetAppl {

	public static void main(String[] args) {
		ISet<Integer> hs = new MyHashSet<>();
		hs.add(2);
		hs.add(3);
		hs.add(5);
		hs.add(7);
		hs.add(11);
		hs.add(13);
		hs.add(17);
		System.out.println(hs.size());
		System.out.println(hs.contains(11));
		System.out.println(hs.contains(19));
		System.out.println(hs.add(5));
		System.out.println(hs.size());
		System.out.println(hs.remove(5));
		System.out.println(hs.contains(5));
		System.out.println(hs.size());
		System.out.println("=================");
		for (Integer num : hs) {
			System.out.println(num);
		}
	}

}

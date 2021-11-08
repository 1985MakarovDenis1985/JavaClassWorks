package telran.set.person.controller;

import java.util.HashSet;
import java.util.Set;

import telran.set.person.model.Person;

public class HashSetTroubleAppl {

	public static void main(String[] args) {
		Person p1 = new Person("Peter", "Jackson");
		Person p2 = new Person("Mary", "Smith");
		Set<Person> set = new HashSet<>();
		set.add(p1);
		set.add(p2);
		System.out.println(set.contains(p2));
		printSet(set);
		p2.setLastName("Jackson");
		System.out.println(set.contains(p2));
		printSet(set);
	}

	private static void printSet(Set<Person> set) {
		set.forEach(p -> System.out.println(p));
		System.out.println("======================");
		
	}

}

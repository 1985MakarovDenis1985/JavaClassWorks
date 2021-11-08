package telran.functional.controller;

import java.util.Arrays;
import java.util.List;

import telran.person.mdel.Person;

public class MethodReferenceAppl {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Alex", 25), new Person("John", 28),
				new Person("Mary", 17),
				new Person("Peter", 25));
		persons.forEach(p -> System.out.println(p));
		System.out.println("==============");
		persons.sort(MethodReferenceAppl::comparePerson);
		persons.forEach(System.out::println);

	}
	
	public static int comparePerson(Person p1, Person p2) {
		int res = Integer.compare(p1.getAge(), p2.getAge());
		if(res != 0) {
			return res;
		}
		return p1.getName().compareTo(p2.getName());
	}

}

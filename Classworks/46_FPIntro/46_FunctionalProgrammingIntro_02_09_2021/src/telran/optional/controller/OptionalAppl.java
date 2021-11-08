package telran.optional.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import telran.person.mdel.Person;

public class OptionalAppl {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Alex", 25), 
				new Person("John", 28),
				new Person("Mary", 17),
				new Person("Peter", 25));
		Optional<Person> res = findPersonByAge(persons, 20);	
//		res.ifPresent(p -> System.out.println(p.getName()));
//		Person person = res.orElse(new Person("Anonimous", -1));
		Person person = res.orElseThrow(IllegalArgumentException::new);
		System.out.println(person.getName());
		

	}

	private static Optional<Person> findPersonByAge(List<Person> persons, int age) {
		Person res = null;
		for (Person person : persons) {
			if(person.getAge() == age) {
				res = person;
				break;
			}
		}
		return Optional.ofNullable(res);
	}

}

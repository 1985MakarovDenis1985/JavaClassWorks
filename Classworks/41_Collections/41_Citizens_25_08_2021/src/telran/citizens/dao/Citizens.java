package telran.citizens.dao;

import java.util.Comparator;
import java.util.List;

import telran.citizens.interfaces.ICitizens;
import telran.citizens.model.Person;

public class Citizens implements ICitizens {
	private List<Person> idList;
	private List<Person> lastNameList;
	private List<Person> ageList;
	private static Comparator<Person> lastNameComparator;
	private static Comparator<Person> ageComparator;

	public Citizens() {
		//TODO
	}

	public Citizens(List<Person> citizens) {
		//TODO
	}

	@Override
	public boolean add(Person person) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Person find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Person> find(int minAge, int maxAge) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Person> find(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Person> getAllPersonSortedById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Person> getAllPersonSortedByAge() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Person> getAllPersonSortedByLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}

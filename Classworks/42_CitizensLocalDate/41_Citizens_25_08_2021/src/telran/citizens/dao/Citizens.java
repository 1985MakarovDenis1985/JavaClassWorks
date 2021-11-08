package telran.citizens.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
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
	
	static {
		lastNameComparator = (o1, o2) -> {
			int res = o1.getLastName().compareTo(o2.getLastName());
			return res != 0 ? res : Integer.compare(o1.getId(), o2.getId());
		};
		ageComparator = (o1, o2) -> {
			int res = Integer.compare(o1.getAge(), o2.getAge());
			return res != 0 ? res : Integer.compare(o1.getId(), o2.getId());
		};
	}

	public Citizens() {
		idList = new ArrayList<>();
		lastNameList = new ArrayList<>();
		ageList = new ArrayList<>();
	}

	public Citizens(List<Person> citizens) {
		List<Person> persons = new ArrayList<>();
		for (Person person : citizens) {
			if (person != null && !persons.contains(person)) {
				persons.add(person);
			}
		}
		idList = new ArrayList<>(persons);
		Collections.sort(idList);
		lastNameList = new ArrayList<>(persons);
		Collections.sort(lastNameList, lastNameComparator);
		ageList = new ArrayList<>(persons);
		Collections.sort(ageList, ageComparator);
	}

	@Override
	public boolean add(Person person) {
		if (person == null) {
			return false;
		}
		int index = Collections.binarySearch(idList, person);
		if (index >= 0) {
			return false;
		}
		index = -index - 1;
		idList.add(index, person);
		index = Collections.binarySearch(ageList, person, ageComparator);
		index = index < 0 ? -index - 1 : index;
		ageList.add(index, person);
		index = Collections.binarySearch(lastNameList, person, lastNameComparator);
		index = index < 0 ? -index - 1 : index;
		lastNameList.add(index, person);
		return true;
	}

	@Override
	public boolean remove(int id) {
		Person victim = find(id);
		if (victim == null) {
			return false;
		}
		idList.remove(victim);
		ageList.remove(victim);
		lastNameList.remove(victim);
		return true;
	}

	@Override
	public Person find(int id) {
		Person pattern = new Person(id, null, null, null);
		int index = Collections.binarySearch(idList, pattern);
		return index < 0 ? null : idList.get(index);
	}

	@Override
	public Iterable<Person> find(int minAge, int maxAge) {
		LocalDate now = LocalDate.now();
		Person pattern = new Person(idList.get(0).getId() - 1, null, null, now.minusYears(minAge));
		int index = Collections.binarySearch(ageList, pattern, ageComparator);
		int left = index < 0 ? -index - 1 : index;
		pattern = new Person(idList.get(idList.size() - 1).getId() + 1, null, null, now.minusYears(maxAge));
		index = Collections.binarySearch(ageList, pattern, ageComparator);
		int right = index < 0 ? -index - 1 : index;
		return ageList.subList(left, right);
	}

	@Override
	public Iterable<Person> find(String lastName) {
		Person pattern = new Person(idList.get(0).getId() - 1, null, lastName, null);
		int index = Collections.binarySearch(lastNameList, pattern, lastNameComparator);
		int left = index < 0 ? -index - 1 : index;
		pattern = new Person(idList.get(idList.size() - 1).getId() + 1, null, lastName, null);
		index = Collections.binarySearch(lastNameList, pattern, lastNameComparator);
		int right = index < 0 ? -index - 1 : index;
		return lastNameList.subList(left, right);
	}

	@Override
	public Iterable<Person> getAllPersonSortedById() {
		return idList;
	}

	@Override
	public Iterable<Person> getAllPersonSortedByAge() {
		return ageList;
	}

	@Override
	public Iterable<Person> getAllPersonSortedByLastName() {
		return lastNameList;
	}

	@Override
	public int size() {
		return idList.size();
	}

}

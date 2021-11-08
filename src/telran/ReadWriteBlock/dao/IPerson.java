package telran.ReadWriteBlock.dao;

import telran.ReadWriteBlock.model.Person;

import java.util.List;

public interface IPerson {
    boolean addPerson(Person person);
    Person getPerson(int id);
    List<Person> getAllPersons();
}

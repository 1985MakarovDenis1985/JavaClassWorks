package telran.ReadWriteBlock.controller;

import telran.ReadWriteBlock.dao.IPerson;
import telran.ReadWriteBlock.dao.PersonMap;
import telran.ReadWriteBlock.model.Person;

public class PersonApp {
    public static void main(String[] args) {
        IPerson persons = new PersonMap();
        persons.addPerson(new Person(1, "John"));
        persons.addPerson(new Person(2, "Peter"));
        persons.getAllPersons().stream().forEach(System.out::println);
    }
}

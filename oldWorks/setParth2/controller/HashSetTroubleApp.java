package setParth2.controller;

import setParth2.model.Person;

import java.util.HashSet;
import java.util.Set;

public class HashSetTroubleApp {
    public static void main(String[] args) {
        Person p1 = new Person("Peter", "Jackson");
        Person p2 = new Person("Mary", "Smith");
        Set<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        System.out.println(set.contains(p2));// true
        printSet(set);
        p2.setLastName("Jackson");
        System.out.println(set.contains(p2)); // false // так как hasCode переопределен в Person по двум полям
        printSet(set);



    }



    private static void printSet(Set<Person> set) {
        set.forEach(p -> System.out.println(p));
        System.out.println("-----------------");

    }
}

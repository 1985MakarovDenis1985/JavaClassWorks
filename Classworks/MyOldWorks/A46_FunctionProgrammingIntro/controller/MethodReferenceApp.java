package A46_FunctionProgrammingIntro.controller;

import A46_FunctionProgrammingIntro.model.Person;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceApp {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Peter", 25),
                new Person("John", 28),
                new Person("Mary", 17),
                new Person("Alex", 25)
        );

//        persons.forEach(System.out::println);
//        persons.sort((a,b) -> comparePerson(a, b));
        persons.sort(MethodReferenceApp::comparePerson); // function programming

        persons.forEach(System.out::println);
    }

    public static int comparePerson(Person a, Person b){
        int res = Integer.compare(a.getAge(), b.getAge()) ;
        if (res != 0) return res;
        return a.getName().compareTo(b.getName());
    }
}

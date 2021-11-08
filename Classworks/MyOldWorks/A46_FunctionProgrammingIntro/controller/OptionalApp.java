package A46_FunctionProgrammingIntro.controller;

import A46_FunctionProgrammingIntro.model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Peter", 25),
                new Person("John", 28),
                new Person("Mary", 17)
        );

        Optional<Person> res = findPersonByAge(persons, 20);
//        res.ifPresent(p -> System.out.println(p.getName()));
//        Person person = res.orElse(new Person("Anonimous", -1)); // если null возвращаем дефолтный объект
//        Person person = res.orElseThrow(()->new IllegalArgumentException()); // вернуть собственную ошибку
        Person person = res.orElseThrow(IllegalAccessError::new); // вернуть собственную ошибку

        System.out.println(person.getName());
    }
    // consumer - принимает и ничего не возвращает
    // supplier - ничего не принимает и возвращает

    private static Optional<Person> findPersonByAge(List<Person> persons, int age) {
        Person res = null;
        for (Person p : persons) {
            if (p.getAge() == age) {
                res = p;
                break;
            };
        }
        return Optional.ofNullable(res);
    }
}

package hashMap_Stream.controller;

import hashMap_Stream.model.Programmer;

import java.util.*;
import java.util.stream.Collectors;

public class ProgApp {

    public static void main(String[] args) {
        List<Programmer> programmers = getProgrammers();
//        printMostSkilledProgrammers(programmers);
        printMostPopularTechnologies(programmers);
    }

    private static void printMostPopularTechnologies(List<Programmer> programmers) {
//        List<String> technologies = programmers.stream() // в Сет только уникальные
//                .map(Programmer::getTechnologies)
//                .flatMap(Arrays::stream)
//                .distinct()
//                .collect(Collectors.toList());
//        technologies.forEach(System.out::println);

        Map<String, Long> techFrequency = programmers.stream()// все счетчики возвращают Long
                .map(p -> p.getTechnologies())
                .flatMap(t -> Arrays.stream(t))
                .collect(Collectors.groupingBy(t -> t, Collectors.counting())); // Collectors.counting() - сколько раз встретился ключ
//            techFrequency.entrySet().forEach(System.out::println);

        Long maxTech = techFrequency.values().stream()
                .max((n1, n2) -> Long.compare(n1, n2))
                .orElse(null);
        if (maxTech != null){
            System.out.println("Max tech = " + maxTech);
            techFrequency.entrySet().stream() // entrySet() -> элимент с ключ : значение
                    .filter(e -> e.getValue() == maxTech)
                    .map(e -> e.getKey())
                    .forEach(System.out::println);
        }

    }


    private static void printMostSkilledProgrammers(List<Programmer> programmers) {
//        Map<Integer, List<Programmer>> skilledProgrammers = new HashMap<>();
//        for (Programmer p : programmers) {
//            int size = p.getTechnologies().length;
//            if (!skilledProgrammers.containsKey(size)){
//                skilledProgrammers.put(size, new ArrayList<>());
//            }
//            skilledProgrammers.get(size).add(p);
//        }
//        skilledProgrammers.entrySet().forEach(System.out::println);

        // create Map keys - value

        Map<Integer, List<Programmer>> skilledProgrammers = programmers.stream()
                .collect(Collectors.groupingBy(p -> p.getTechnologies().length));


        Integer maxTech = skilledProgrammers.keySet()
                .stream()
                .max(Integer::compareTo) // return Optional - terminal
                .orElse(null);
        if (maxTech != null) {
            skilledProgrammers.get(maxTech).forEach(System.out::println);
        }
    }

    private static List<Programmer> getProgrammers() {
        return Arrays.asList(
                new Programmer("Peter", "C++", "Python", "Java", "Go"),
                new Programmer("Moshe", "Python", "Java"),
                new Programmer("Sara", "Java", "Scala", "Kotlin", "JS"),
                new Programmer("Jacob", "Python", "Go"),
                new Programmer("Petrovich", "Fortran", "Algol", "Kobol")
        );
    }
}

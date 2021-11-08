package A47_Streams.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SteamApp {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 9, 2, 8, 3, 7, 4, 5);
        Stream<Integer> stream = numbers.stream();
        numbers.stream()
                .filter(x -> x > 3)
                .sorted((a,b) -> b-a)
                .forEach(System.out::println);

        System.out.println("====================");

        Integer[] arr = {1, 9, 2, 8, 3, 7, 4, 5};
        List<Integer> res = new ArrayList<>();
        Arrays.stream(arr)
                .filter(x -> x < 7)
                .sorted()
                .forEach(res::add);
        res.forEach(System.out::println);

        System.out.println("====================");

//        List<Integer> numbers = Arrays.asList(1, 9, 2, 8, 3, 7, 4, 5);
        stream = numbers.stream()
                .peek(x -> System.out.println("peek before : " + x)) // метод позволяющий работать в промежутке (для дебага)
                .filter(x -> x % 2 == 0)
                .sorted()
                .peek(x -> System.out.println("peek after : " + x));// метод позволяющий работать в промежутке (для дебага)
//                .forEach(System.out::println);

        System.out.println("====================");

//        int sum = stream.reduce(0, (acc, item) -> acc + item);
//        System.out.println(sum);

//        // -------------------------------- //
        System.out.println("====================");

        StringBuilder str = stream
                .map(x -> x.toString())
                .map(StringBuilder::new)
                .reduce(new StringBuilder("Concat : "), (a, b) -> a.append("-").append(b));
        System.out.println(str);

        System.out.println("====================");
        int num = numbers.stream()
                .filter(x -> x % 4 == 0)
//                .map(n -> n.toString())
                .findFirst()
//                .orElse("Epsent");
                .orElse(-1);
                System.out.println(num);


    }
}
// терминальные операции : forEach, reduce, collect
// пока не добавить терминальную операцию - работать весь стрим не будет

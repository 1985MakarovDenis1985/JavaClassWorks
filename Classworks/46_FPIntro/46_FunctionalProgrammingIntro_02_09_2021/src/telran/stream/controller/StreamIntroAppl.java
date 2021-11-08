package telran.stream.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntroAppl {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 9, 2, 8, 3, 7, 4, 6, 5);
		Stream<Integer> stream = numbers.stream()
				.filter(x -> x > 3)
				.sorted((x,y) -> -Integer.compare(x, y));
		stream.forEach(System.out::println);
		System.out.println("=================");
		Integer[] arr = {1, 9, 2, 8, 3, 7, 4, 6, 5};
		List<Integer> res = new ArrayList<>();
		Arrays.stream(arr)
			.filter(x -> x < 7)
			.sorted()
			.forEach(res::add);
		res.forEach(System.out::println);
		System.out.println("=================");
		stream = numbers.stream()
				.peek(x -> System.out.println("peek before filter: " + x))
				.filter(x -> x % 2 == 0)
				.peek(x -> System.out.println("peek after filter: " + x))
				.sorted()
				.peek(x -> System.out.println("peek after sort: " + x));
//		int sum = stream.reduce(0, (accum, item) -> accum + item);
//		System.out.println("Res = " + sum);
		StringBuilder str = stream
						.map(x -> x.toString())
						.map(s -> new StringBuilder(s))
						.reduce(new StringBuilder("Concat numbers: "), (a,b) -> a.append("-").append(b));
		System.out.println(str);
		System.out.println("=================");
		String num = numbers.stream()
						.filter(x -> x % 40 == 0)
						.map(n -> n.toString())
						.findFirst()
						.orElse("Nifiga net");
		System.out.println(num);

	}

}

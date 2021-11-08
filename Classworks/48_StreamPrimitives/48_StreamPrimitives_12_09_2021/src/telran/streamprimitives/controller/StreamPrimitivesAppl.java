package telran.streamprimitives.controller;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamPrimitivesAppl {

	private static final int N_NUMBERS = 10;
	private static final int MIN = 1;
	private static final int MAX = 10;
	private static Random random = new Random();

	public static void main(String[] args) {
		List<Integer> numbers = getRandomNumbers(N_NUMBERS, MIN, MAX);
		numbers.forEach(System.out::println);
		IntSummaryStatistics stats = numbers.stream()
										.mapToInt(n -> n.intValue())
										.summaryStatistics();
		System.out.println("Max = " + stats.getMax());
		System.out.println("Min = " + stats.getMin());
		System.out.println("Sum = " + stats.getSum());
		System.out.println("Avg = " + stats.getAverage());
		System.out.println("Loto");
		random.ints(1, 50)
			.distinct()
			.limit(6)
			.forEach(System.out::println);
		System.out.println("Print shuffle");
		int[] arr = {10,20,30,40,50};
		random.ints(0, arr.length)
			.distinct()
			.limit(arr.length)
			.forEach(i -> System.out.println(arr[i]));
	}

	private static List<Integer> getRandomNumbers(int amount, int min, int max) {
		return random.ints(min, max)
					.limit(amount)
//					.mapToObj(Integer::valueOf)
					.boxed()
					.collect(Collectors.toList());
	}

}

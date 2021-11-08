package telran.programmer.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import telran.programmer.model.Programmer;

public class ProgrammerAppl {

	public static void main(String[] args) {
		List<Programmer> programmers = getProgrammers();
		System.out.println("===== Most Skilled Programmers =====");
		printMostSkilledProgrammers(programmers);
		System.out.println("===== Most Popular Technologies =====");
		printMostPopularTechnologies(programmers);

	}

	private static void printMostPopularTechnologies(List<Programmer> programmers) {
		System.out.println("=============== Iterable =========================");
		Iterable<String> technologies = programmers.stream()
				.map(Programmer::getTechnologies)
				.flatMap(Arrays::stream)
//				.distinct()
				.collect(Collectors.toList());
		StreamSupport.stream(technologies.spliterator(), false)
					.distinct()
					.forEach(System.out::println);
		System.out.println("========================================");
		Map<String, Long> techFrequency = programmers.stream()
				.map(p -> p.getTechnologies())
				.flatMap(t -> Arrays.stream(t))
				.collect(Collectors.groupingBy(t -> t, Collectors.counting()));
//		techFrequency.entrySet().forEach(System.out::println);
		Long maxTech = techFrequency.values().stream()
						.max((n1,n2) -> Long.compare(n1, n2))
						.orElse(null);
		if(maxTech != null) {
			System.out.println("Max tech = " + maxTech);
			techFrequency.entrySet().stream()
				.filter(e -> e.getValue() == maxTech)
//				.peek(System.out::println)
//				.map(e -> e.getKey())
				.forEach(e -> System.out.println(e.getKey()));
		}
		
	}

	private static void printMostSkilledProgrammers(List<Programmer> programmers) {
//		Map<Integer, List<Programmer>> skilledProgrammers = new HashMap<>();
//		for (Programmer p : programmers) {
//			int size = p.getTechnologies().length;
//			if(!skilledProgrammers.containsKey(size)) {
//				skilledProgrammers.put(size, new ArrayList<>());
//			}
//			skilledProgrammers.get(size).add(p);
//		}
		Map<Integer, List<Programmer>> skilledProgrammers = 
					programmers.stream()
					.collect(Collectors.groupingBy(p -> p.getTechnologies().length));
//		skilledProgrammers.entrySet().forEach(System.out::println);
		Integer maxTech = skilledProgrammers.keySet()
							.stream()
							.max(Integer::compareTo)
							.orElse(null);
		if(maxTech != null) {
			skilledProgrammers.get(maxTech).forEach(System.out::println);
		}
		
	}

	private static List<Programmer> getProgrammers() {
		return Arrays.asList(
					new Programmer("Peter", "C++", "Python", "Java", "Go"),
					new Programmer("Mosche", "Java", "Python"),
					new Programmer("Sarah", "Java", "Scala", "Kotlin", "Javascript"),
					new Programmer("Jacob", "Python", "Go"),
					new Programmer("Petrovich", "Fortran", "Algol", "Kobol")
				);
	}

}

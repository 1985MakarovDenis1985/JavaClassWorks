package telran.list.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListLoopPerfomanceTest {

	private static final int N_NUMBERS = 100_000;
	private static final int MAX = 100;

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		fillList(list);
		testLoop1(list);
		testLoop2(list);
		testLoop3(list);

	}

	private static void testLoop3(List<Integer> list) {
		int sum = 0;
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		long t2 = System.currentTimeMillis();
		System.out.println("Test 3 = " + (t2 - t1) + ", sum = " + sum);
	}

	private static void testLoop2(List<Integer> list) {
		int sum = 0;
		Iterator<Integer> iterator = list.iterator();
		long t1 = System.currentTimeMillis();
		while (iterator.hasNext()) {
			sum += iterator.next();
		}
		long t2 = System.currentTimeMillis();
		System.out.println("Test 2 = " + (t2 - t1) + ", sum = " + sum);
	}

	private static void testLoop1(List<Integer> list) {
		int sum = 0;
		long t1 = System.currentTimeMillis();
		for (Integer num : list) {
			sum += num;
		}
		long t2 = System.currentTimeMillis();
		System.out.println("Test 1 = " + (t2 - t1) + ", sum = " + sum);
	}

	private static void fillList(List<Integer> list) {
		Random random = new Random();
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < N_NUMBERS; i++) {
			int num = random.nextInt(MAX);
			list.add(num);
		}
		long t2 = System.currentTimeMillis();
		System.out.println("Test fill list = " + (t2 - t1));
	}

}

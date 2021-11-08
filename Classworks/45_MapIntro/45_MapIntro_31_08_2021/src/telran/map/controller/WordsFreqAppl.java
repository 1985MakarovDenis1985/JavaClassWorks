package telran.map.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordsFreqAppl {

	public static void main(String[] args) {
		String[] words = { "abc", "ab", "limn", "limn", "ab", "limn", "a" };
		displayWordsFrequency(words);

	}

	private static void displayWordsFrequency(String[] words) {
		Map<String, Integer> res = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
//			if (res.containsKey(words[i])) {
//				res.put(words[i], res.get(words[i]) + 1);
//			} else {
//				res.put(words[i], 1);
//			}
			
//			if(res.putIfAbsent(words[i], 1) != null) {
//				res.put(words[i], res.get(words[i]) + 1);
//			}
			
//			res.computeIfPresent(words[i], (k, v) -> v + 1);
//			res.computeIfAbsent(words[i], k -> 1);
			
			res.merge(words[i], 1, (oldValue, value) -> oldValue + value);
			
		}
		Set<Map.Entry<String, Integer>> entries = res.entrySet();
		System.out.println("=== Unsorted ===");
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		System.out.println("=== Sorted ===");
		// TODO
		List<Map.Entry<String, Integer>> list = new ArrayList<>(entries);
		// Collections.sort(list, (e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()));
		list.sort((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()));
		for (Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}

	}

}

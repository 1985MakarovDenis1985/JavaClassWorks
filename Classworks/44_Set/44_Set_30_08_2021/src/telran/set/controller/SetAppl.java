package telran.set.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetAppl {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("c", "ab", "abc", "b", "ab", "bd", "b"));
		printCollection(list, "Print List:");
		Set<String> set = new HashSet<>();
		set.addAll(list);
		set.add(null);
		set.remove(null);
		printCollection(set, "Print HashSet:");
		TreeSet<String> treeset = new TreeSet<>((s1,s2) -> {
		  int res = Integer.compare(s1.length(), s2.length());
		  return res != 0 ? res : s1.compareTo(s2);
		});
		treeset.addAll(list);
		printCollection(treeset, "Print TreeSet:");
		System.out.println(treeset.floor("ba"));
		Set<String> subset = treeset.subSet("c", false , "abc", true);
		printCollection(subset, "Print Subset of treeset:");
	}

	private static void printCollection(Iterable<String> collection, String title) {
		System.out.println(title);
		for (String str : collection) {
			System.out.print(str + " ");
		}
		System.out.println("\n===========");

	}

}

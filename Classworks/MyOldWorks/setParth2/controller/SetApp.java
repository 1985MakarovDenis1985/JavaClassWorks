package setParth2.controller;

import java.util.*;

public class SetApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("c", "ab", "abc", "b", "ab", "bd", "b"));
        // --- HashSet ---> чаще используеться чем treeSet -> так как быстрей работает
        // --- TreeSet ---> чаще используеться если нужны диапазоны


//        printCollection(list, "Print list: ");
        Set<String> set = new HashSet<>(list); // передали list
//        Set<String> set = new HashSet<>(2, 20); // передали load factor
//        set.addAll(list); // можно так
//        printCollection(set, "Print set: ");

        // --- Tree Set --- //
        TreeSet<String> treeSet = new TreeSet<>(list);
//        printCollection(treeSet, "Print TreeSet : ");
//        System.out.println(treeSet.last());

// -----------  ab | abc | b | bd | c | ----------- //

//        System.out.println(treeSet.ceiling("b")); // b
//        System.out.println(treeSet.ceiling("ba")); // bd так как ba отсутствует
//        System.out.println(treeSet.floor("ba")); // b
//        System.out.println(treeSet.lower("ba")); // b
//        System.out.println(treeSet.higher("ba")); // bd

//        Set<String> subset = treeSet.headSet("bd"); // ab | abc | b
//        subset = treeSet.tailSet("bd"); // bd | c
//        subset = treeSet.subSet("abc", "c"); // abc | b | bd
//        subset = treeSet.subSet("abc", false, "c", true); // b | bd | c
//        printCollection(subset, "Print subset of treeSet");


        TreeSet<String> treeSet1 = new TreeSet<>((s1, s2) -> {
           int res =  Integer.compare(s1.length(), s2.length());
            return res !=0 ? res : s1.compareTo(s2);
        });
        treeSet1.addAll(list);
        printCollection(treeSet1, "Print subset of treeSet"); // b | c | ab | bd | abc |  -> сделали от меньшего слова к большему в компараторе


    }
    private static void printCollection(Iterable<String> collection, String title) {
        System.out.println(title);
        for (String str : collection) {
            System.out.print(str + " | ");
        }
        System.out.println();
    }
}

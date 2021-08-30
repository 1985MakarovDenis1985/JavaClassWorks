package setParth2;

import java.util.*;

public class SetApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("c", "ab", "abc", "b", "ab", "bd", "b"));
        printCollection(list, "Print list: ");
        Set<String> set = new HashSet<>(list); // передали list
//        Set<String> set = new HashSet<>(2, 20); // передали load factor
//        set.addAll(list); // можно так
        printCollection(set, "Print set: ");
    }

    private static void printCollection(Iterable<String> collection, String title) {
        System.out.println(title);
        for(String str: collection){
            System.out.print(str + " | ");
        }
        System.out.println();
    }
}

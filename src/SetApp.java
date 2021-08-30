// treeSet - через compare compareTo (Comparable, Comparator)
// HashSet - через equals
// Коллизия - когда хешкоды одинаковые а equals = false
// load фактор

import interfaces.ISet;
import model.MyHashSet;

public class SetApp {

    public static void main(String[] args) {
        ISet<Integer> hs = new MyHashSet<>(8, 1);
        hs.add(2);
        hs.add(3);
        hs.add(5);
        hs.add(4);
        hs.add(11);
        hs.add(13);
        hs.add(17);
//        System.out.println(hs.size());
//        System.out.println(hs.contains(19));
//        System.out.println(hs.contains(11));
//        hs.add(5);
//        System.out.println(hs.size());
//        hs.remove(5);
//        System.out.println(hs.size());

        for (Integer num: hs){
            System.out.println(num);
        }

    }
}

package army;

import java.util.Arrays;

public class SoldierApp {
    public static void main(String[] args) {
        Soldier[] soldiers = {
                new Soldier("John", 182, 82.3, 91),
                new Soldier("Peter", 175, 77.1, 96),
                new Soldier("Tigran", 162, 55.3, 96),
                new Soldier("Mary", 159, 49.1, 91),
                new Soldier("Mosche", 177, 85, 75),
                new Soldier("Sarah", 164, 55, 91)
        };

        // compare
        System.out.println("=== start arr of soldier ===");
        ArrayTools.printArray(soldiers);
        System.out.println("=== soldier by compare ===");
        ArrayTools.bubbleSortCompare(soldiers);
        ArrayTools.printArray(soldiers);

        // comparator
        System.out.println("=== profile ===");
        ArrayTools.bubbleSortCompare(soldiers, (s1, s2) -> s1.getProfile() - s2.getProfile());
        ArrayTools.printArray(soldiers);
        System.out.println("=== name ===");
        ArrayTools.bubbleSortCompare(soldiers, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        ArrayTools.printArray(soldiers);

        System.out.println("=== name length===");
        ArrayTools.bubbleSortCompare(soldiers, (s1, s2) -> s1.getName().length() - s2.getName().length());

        // Arrays.sort
        System.out.println("=== profile ===");
        // готовый метод
        Arrays.sort(soldiers, (s1, s2) -> s1.getProfile() - s2.getProfile());
        ArrayTools.printArray(soldiers);

        System.out.println("=== weight ==="); // double
//        Arrays.sort(soldiers, (s1,s2) -> {
//            if (s1.getWeight() > s2.getWeight()){
//                return 1;
//            }
//            if (s1.getWeight() < s2.getWeight()){
//                return -1;
//            }
//            return 0;
//        });
        // готовый метод
        Arrays.sort(soldiers, (s1, s2) -> Double.compare(s1.getWeight(), s2.getWeight()));
        ArrayTools.printArray(soldiers);

        System.out.println("=== weight next name==="); // double

        // если что то одинаковое то по другому признаку
        Arrays.sort(soldiers, (s1, s2) -> {
            int res = Integer.compare(s1.getProfile(), s2.getProfile()); // возвращает 1, 0, -1
            if (res != 0 ){
                return res;
            }
            return s1.getName().compareTo(s2.getName());
//          return -s1.getName().compareTo(s2.getName()); => в обратную сторону
        });
        ArrayTools.printArray(soldiers);
    }
}

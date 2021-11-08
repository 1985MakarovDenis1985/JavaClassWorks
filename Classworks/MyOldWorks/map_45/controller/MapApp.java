package map_45.controller;

import java.util.*;

public class MapApp {
    // не итерируется

    public static void main(String[] args) {
//        Map<String, Integer> usa = new HashMap<>();
//        usa.put("Denver", 600_000);
//        usa.put("Boston", 670_000);
//        usa.put("Chicago", 2_700_000);
//        usa.put("Atlanta", 470_000);
//        usa.put("New York", 8_500_000);
//        usa.put("Dallas", 1_300_000);
////        System.out.println(usa.isEmpty()); // false
////        System.out.println(usa.size()); size
//        Integer num = usa.get("Chicago");
////        System.out.println(num); // 2_700_000
////        System.out.println(usa.containsKey("Boston")); // true
////        System.out.println(usa.containsKey("Detroit")); // false
////        System.out.println(usa.containsValue(600_000)); // true
////        num = usa.put("Chicago", 2_700_001); // вернул старое значение но в коллекции изменил
////        System.out.println(num);
////        System.out.println(usa.get("Chicago")); // 2_700_001
//
//        // --- iterator --- //
////        Collection<Integer> values = usa.values();
////        int total = 0;
////        for(Integer in: values){
////            total+=in;
////        }
////        System.out.println("total: "+total);
//
//        // --- method 1 --- //
////        Set<String> keys = usa.keySet();
////        for(String key: keys){
////            System.out.println(key + " : "+ usa.get(key));
////        }
//
//        // --- method 2 --- //
//        Set<Map.Entry<String, Integer>> entries = usa.entrySet();
//        for (Map.Entry<String, Integer> entry : entries) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

//-------------------------------//

        Map<String, Integer> usa = new TreeMap<>();
        usa.put("Denver", 600_000);
        usa.put("Boston", 670_000);
        usa.put("Chicago", 2_700_000);
        usa.put("Atlanta", 470_000);
        usa.put("New York", 8_500_000);
        usa.put("Dallas", 1_300_000);
//        System.out.println(usa.isEmpty()); // false
//        System.out.println(usa.size()); size
        Integer num = usa.get("Chicago");
//        System.out.println(num); // 2_700_000
//        System.out.println(usa.containsKey("Boston")); // true
//        System.out.println(usa.containsKey("Detroit")); // false
//        System.out.println(usa.containsValue(600_000)); // true
//        num = usa.put("Chicago", 2_700_001); // вернул старое значение но в коллекции изменил
//        System.out.println(num);
//        System.out.println(usa.get("Chicago")); // 2_700_001

        // --- iterator --- //
//        Collection<Integer> values = usa.values();
//        int total = 0;
//        for(Integer in: values){
//            total+=in;
//        }
//        System.out.println("total: "+total);

        // --- method 1 у treeMap сложность полилинейная --- //
//        Set<String> keys = usa.keySet();
//        for(String key: keys){
//            System.out.println(key + " : "+ usa.get(key));
//        }

        // --- method 2 --- //
        Set<Map.Entry<String, Integer>> entries = usa.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

package myLinkedList.model;

import java.util.Iterator;

public class MyKinkedListApp {
    public static void main(String[] args) {
        ILinkedList<String> myList = new MyLinkedList<>();
//        System.out.println(myList.isEmpty());

        myList.add("Boston");
        myList.add("Atlanta");
        myList.add("NewYork");
        myList.add("Chicago");
        myList.add("Washington");
//        myList.add(null);
        myList.add("Detroit");

        //        myList.set(1, "Montana");
//        System.out.println(myList.get(1));
        myList.add(0, "--- first ---");
        myList.add(4, "--- middle ---");
        myList.add(8, "--- last ---");
        myList.add(8, "--- Prev ---");

        System.out.println("===== Iterator =====");
        Iterator<String> iterator = myList.iterator(); // одноразовый -> всегда нужно заново создавать что бы итерировать
        while (iterator.hasNext()) {
            String el = iterator.next();
            System.out.println(el);
//            if (el == null) {
//                el = iterator.next();
//            }
//            if (el.equals("Washington")){
//                iterator.remove();
//            }
        }

//        for (String s : myList) {
//            System.out.println(s);
//        }


//        System.out.println(myList.size());
//        System.out.println(myList.isEmpty());
//        System.out.println(myList.get(1));
//        System.out.println(myList.get(3));
//        System.out.println(myList.indexOf("Chicago"));
//        System.out.println(myList.indexOf(null));
//        System.out.println(myList.contains(null));
//        myList.remove(5);
//        System.out.println(myList.contains(null));
//        System.out.println(myList.get(5));

//        System.out.println(myList.contains("Detroit"));
//        System.out.println(myList.contains(null));
//        System.out.println(myList.lastIndexOf("Detroit"));

//        myList.add(myList.size(), "Montana");

//        myList.set(1, "Montana");
//        myList.add(2, "Las");
//        myList.add(2, "Vegas");

//        myList.add(3, "Las Vegas");
//        myList.remove(0);

//        Iterator<String> iterator = myList.iterator(); // одноразовый -> всегда нужно заново создавать что бы итерировать
//        while (iterator.hasNext()){
//            String el = iterator.next();
//            if (el == null){
//                el = iterator.next();
//            }
////            if (el.equals("Washington")){
////                iterator.remove();
////            }
//        }

//        for (String str : myList) {
//            System.out.println(str);
//        }
    }
}

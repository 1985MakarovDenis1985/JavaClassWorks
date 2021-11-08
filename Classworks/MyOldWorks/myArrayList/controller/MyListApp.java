package myArrayList.controller;

import myArrayList.interfaces.IList;
import myArrayList.model.MyArrList;

import java.util.Iterator;

public class MyListApp {
    public static void main(String[] args) {
        IList<String> myList = new MyArrList<>(3);
//        System.out.println(myList.isEmpty());

        myList.add("Boston");
        myList.add("Atlanta");
        myList.add("New York");
        myList.add("Chicago");
        myList.add("Washington");
        myList.add(null);
        myList.add("Detroit");

//        System.out.println(myList.size());
//        System.out.println(myList.isEmpty());
//        System.out.println(myList.get(1));
//        System.out.println(myList.get(3));
//        System.out.println(myList.indexOf("Chicago"));
//        System.out.println(myList.indexOf(null));
//        System.out.println(myList.contains("Detroit"));
//        System.out.println(myList.contains(null));
//        System.out.println(myList.lastIndexOf("Detroit"));

        myList.add(myList.size(), "Montana");

//        myList.set(1, "Montana");
//        myList.add(2, "Las");
//        myList.add(2, "Vegas");

        myList.add(3, "Las Vegas");
//        myList.remove(0);

        Iterator<String> iterator = myList.iterator(); // одноразовый -> всегда нужно заново создавать что бы итерировать
        while (iterator.hasNext()){
            String el = iterator.next();
            if (el == null){
                el = iterator.next();
            }
//            if (el.equals("Washington")){
//                iterator.remove();
//            }
        }

        for (String str : myList) {
            System.out.println(str);
        }
    }
}

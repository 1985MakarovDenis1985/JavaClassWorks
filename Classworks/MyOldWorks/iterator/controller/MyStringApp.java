package iterator.controller;

import iterator.model.MyString;

import java.util.Iterator;

public class MyStringApp {
    public static void main(String[] args) {
        MyString myStr = new MyString("Two beer, or not two beer? Sheaksbeer");
//        System.out.println(myStr);
        myStr.addChar('.');
//        System.out.println(myStr);
        myStr.removeChar(',');
//        System.out.println(myStr);
//        StringBuilder builder = myStr.getStr(); // -> достали StringBuilder из String
//        for (int i = 0; i < builder.length(); i++) {
//            System.out.print(Character.toUpperCase(builder.charAt(i)));
//        }
//        System.out.println();
//        builder.setLength(3); // сократили до 3 букв
//        System.out.println(builder);

//        For Each ----------------- в for each удалять ничего нельзя (меняется size)!!! --------------------
        for (Character c : myStr) {
            System.out.print(Character.toUpperCase(c));
        }

        Iterator<Character> iterator = myStr.iterator();
        while (iterator.hasNext()){
            char c = iterator.next();
            // 2 solution
            if ("aeiou".contains(c+"")){
                iterator.remove();
            }
            // 1 solution
//            if (c == 'e'){
//                iterator.remove();
//            }
        }
        System.out.println();

        System.out.println(myStr);

//        for (Character c : myStr) {
//            if (c == 'e'){
//                myStr.removeChar(c);
//            }
//        }
//        System.out.println(myStr);



        // далее через iterator;
//        Iterator<Character> iterator = myStr.iterator();
//        while (iterator.hasNext()) {
//            char c = iterator.next();
////            System.out.print(Character.toUpperCase(c));
//        }

    }
}

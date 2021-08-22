package controller;

import java.util.Locale;

public class stringApp {


    public static void main(String[] args) {
        String str = "Hello";
        char[] chars = {' ', 'w', 'o', 'r', 'l', 'd'};
        String str1 = new String(chars);
        str = str + str1; // srt = str.concat(str1)
//        System.out.println(str);

//        System.out.println(str.length());
//        char c = str.charAt(2); // l буква по индексу
//        for (int i = 0; i < str.length(); i++) {
//            System.out.print(str.charAt(i)); // переберает символы
//        }

        String str3 = " WoRLd";
//        System.out.println(str1.equals(str3)); // false
//        System.out.println(str1.equalsIgnoreCase(str3)); // true
//        System.out.println(str1.toUpperCase()); // всегда возвращает новый объект
//        System.out.println(str1.toLowerCase());
//        int index = str.indexOf('l');
//        int index = str.indexOf("lo");
//        int index = str.indexOf('l', 5); // искать с пятой позиции
//        index = str.lastIndexOf('l');
//        System.out.println(index);
//        System.out.println(str.substring(6)); // возвр все после 5 индекса
//        System.out.println(str.substring(6, 8)); // возвр все после 5 индекса до 7(включая)  // левый край вкл - правый нет
//        System.out.println(str.replace('l', 'L')); // замена всех 'l'
//        System.out.println(str.replace("el", "ZZZ"));



    }
}

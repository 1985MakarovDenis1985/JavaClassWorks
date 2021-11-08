package enums;

import en.MathConst;
import enums.model.Month;

public class controller {
    public static void main(String[] args) {
//        Seasons season = Seasons.AUTUMN;
////        System.out.println(season);
//        season = Seasons.WINTER;
////        System.out.println(season);
//        Seasons[] seasons1 = Seasons.values();
////        for (int i = 0; i < seasons1.length; i++) {
////            System.out.println(seasons1[i]);
////        }
//
//        int index = season.ordinal();
////        System.out.println(index);
//
//        index = Seasons.SPRING.ordinal(); // найти индех эл в массиве
////        System.out.println(index);
//
////        String name = season.toString();
////        System.out.println(name);
//
//        String name = season.name();
////        System.out.println(name);
//
//        season = Seasons.valueOf("AUTUMN"); // из стринга получаем enum
//        System.out.println(season);
//        Month month = Month.FEB;
//        System.out.println(month.plusMonth(12));
        Month month = Month.MAY;
//        System.out.println(month.plusMonth(1));

        System.out.println(Month.getName(25));

        System.out.println(MathConst.PI.getValue());


    }
}

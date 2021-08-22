package telran.generics.controller;

import telran.generics.model.Printer2;


public class Print1App {
    public static void main(String[] args) {
        // В дженериков нельзя использовать примитивы
        Printer2<String> prn = new Printer2<>("Hello");
        System.out.println(prn);
        String str = prn.getValue();
        System.out.println(str);


        Printer2<StringBuilder> prn2 = new Printer2 <>(new StringBuilder("world"));
//        Integer num = prn2.getValue();
//        System.out.println(num);




//        Printer1 prn = new Printer1("Hello");
//        System.out.println(prn);
//        String str = (String) prn.getValue();
//        System.out.println(str);
//        Integer num = (Integer) prn.getValue();
//        System.out.println(num);
    }
}

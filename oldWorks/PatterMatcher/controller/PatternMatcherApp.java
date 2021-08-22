package PatterMatcher.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherApp {
    public static void main(String[] args) {
        String str = "DON`t trouble Trouble until trouble troubles until you";
        String regex = "(t|T)rouble\\w*"; // любой символ любое кол перед и  после
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
//        System.out.println(matcher.matches());
//        boolean res = matcher.find();
//        System.out.println("find: " + res);
//        System.out.println("group: " + matcher.group());
//        System.out.println("start: " + matcher.start());
//        System.out.println("end: " + matcher.end());

        //=================================================================
        // => продолжил искать с позиции на которой закончили искать первый
        //=================================================================

//        res = matcher.find();
//        System.out.println("find: " + res);/
//        matcher.reset(); // начиет обрабатывать сначала
//        while (matcher.find()) {
//            System.out.println("group: " + matcher.group());
//            System.out.println("start: " + matcher.start());
//            System.out.println("end: " + matcher.end());
//        }

        String str1 = "All my troubles seemed so far away";
        matcher.reset(str1); // так лучше чем создавать новый объект (сбросили и начали искать уже здесь же новый regex)
        while (matcher.find()) {
            System.out.println("group: " + matcher.group());
            System.out.println("start: " + matcher.start());
            System.out.println("end: " + matcher.end());
        }

    }
}

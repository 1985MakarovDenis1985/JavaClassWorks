package Exceptions.controller;

import Exceptions.RangeCheck;
import Exceptions.RangeLessException;
import Exceptions.RangeMoreException;

import java.util.Random;

public class RangeCheckApp {
    private static final int MIN_RANGE = 18;
    private static final int MAX_RANGE = 45;
    private static final int N_NUMBERS = 100;
    private static final int DIV_MIN = 2;
    private static final int MIN = MIN_RANGE - DIV_MIN;
    private static final int DIV_MAX = 5;
    private static final int MAX = MAX_RANGE + DIV_MAX;

    public static void main(String[] args) {
        RangeCheck rc = new RangeCheck(MIN_RANGE, MAX_RANGE);
        Random random = new Random();
        int countLess = 0;
        int countMore = 0;

        for (int i = 0; i < N_NUMBERS; i++) {
            int age = MIN + random.nextInt(MAX - MIN + 1);
            try {
                rc.check(age);
            } catch (RangeLessException e){
                e.printException();
//                e.printStackTrace();
                countLess++;
            } catch (RangeMoreException e) {
                e.printException();
//                e.printStackTrace();
                countMore++;
            }
        }
        System.out.println("count of less : " + countLess);
        System.out.println("count of more : " + countMore);


    }
}

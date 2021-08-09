package comporator.arraysTools.controller;

import army.ArrayTools;

public class ArrApp {
    public static void main(String[] args) {
        Integer[] arrNum = {9,7,4,7,2,5,9,1,0};
//        ArrayTools.printArray(arrNum);
        String[] arrString = {"one", "two", "tree"};
        String res = ArrayTools.findByPredicate(arrString, s -> s.length() == 4);
        Integer num = ArrayTools.findByPredicate(arrNum, s -> s < 5);

        System.out.println(res);
        System.out.println(num);


//        ArrayTools.printArray(arrString);
//        ArrayTools.bubbleSortNum(arrNum);
//        ArrayTools.printArray(arrNum);
//
//        ArrayTools.bubbleSortCompare(arrString);
//        ArrayTools.printArray(arrString);

    }
}

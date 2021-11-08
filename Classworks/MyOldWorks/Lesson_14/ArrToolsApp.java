package Lesson_14;
import Lesson_14.arrToolse.ArrTool;

public class ArrToolsApp {
    public static void main(String[] args) {
        int[] arr = {7, 3, 5, 1, 8, 4};
        ArrTool.showArr(arr);
        ArrTool.selectionSort(arr);
        ArrTool.showArr(arr);
        System.out.println(ArrTool.binarySearch(arr, 12));
    }

}

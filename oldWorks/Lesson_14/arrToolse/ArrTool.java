package Lesson_14.arrToolse;

public class ArrTool {



    public static int binarySearch(int[] arr, int value) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == value) {
                return mid;
            }
            if (arr[mid] < value) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -l - 1;
    }
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int minIdx = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minIdx) {
                    pos = j;
                    minIdx = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = minIdx;
        }
    }
    public static void showArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}

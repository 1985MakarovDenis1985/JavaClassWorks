package Lesson_13;

public class Lesson_13 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArr(arr, 10, 90);
        printArr(arr);
//        bubbleSort(arr);
//        printArr(arr);
//        int f = binarySearch(arr, arr[9]);
//        System.out.println("index = " + f);
        bubbleSort2(arr);
        printArr(arr);
        System.out.println(binarySearch(arr, 15));


    }

    public static int binarySearch(int[] arr, int value){
        int l = 0;
        int r = arr.length-1;

        while (l <= r){
            int mid = (l + r) / 2;
            if (arr[mid] == value){
                return mid;
            }
            if (arr[mid] < value){
                l = mid + 1;
            } else {
                r = mid -1;
            }
        }
        return -1;
    }

    // ------------------------------------------
    public static boolean bubbling(int[] arr){
        boolean flag = false;
        for (int j = 0; j < arr.length -1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                flag = true;
            }
        }
        return flag;
    }

    public static void bubbleSort2(int[] arr){
        while (bubbling(arr));
    }
    // ------------------------------------------


    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length -1 -i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
    public static void fillArr(int[] arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (min + Math.random() * (max - min + 1));
        }
        System.out.println();
    }
}

// hw: selection sort

// поиск инверсией
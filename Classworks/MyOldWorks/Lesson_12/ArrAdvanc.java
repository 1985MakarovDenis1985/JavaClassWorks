package Lesson_12;

//(min + Math.random() * (max - min + 1)) = > стандартная генерация чисел
public class ArrAdvanc {

    public static void main(String[] args) {
        int[] arr = new int[10];
//        printArr(arr);
        fillArr(arr, 10, 99);
        printArr(arr);
//        int a = sum(arr);
//        double b = sumAver(arr);
//        System.out.println(a);
//        System.out.println(b);
//        max(arr);
//        System.out.println();
        int a = search(arr, arr[3]);
        System.out.println(a);


    }

    public static void fillArr(int[] arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (min + Math.random() * (max - min + 1));
        }
        System.out.println();
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double sumAver(int[] arr) {
        return 1.0 * sum(arr) / arr.length;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void max(int[] arr) {
        int temp = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (temp < arr[i]) {
                temp = arr[i];
            }
        }
        System.out.println(temp);
    }

    public static int search(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                return value;
            }
        }
        return -1;
    }


    public static int indexOfMin(int[] arr){
        //TODO
        return -1;
    }
    public static int min(int[] arr){
        //TODO
        return -1;
    }
}

package classWork;

import java.sql.Array;

public class ClassWork {

    public static void main(String[] args) {
//        int[] arr = new int[5];
//        arr[2] = 100500;
//        arr[1] = arr[2] + 100;
////        System.out.println(arr.length);
//        int[] primes = new int[5];
//        primes[0]= 2;
//        primes[1]= 2;
//        primes[2]= 5;
//        int[] primes2 = {2, 3, 5, 7, 11};
//        printArr(primes2);

//        int x = 10;
//        System.out.println("x before = " + x);
//        pow2VAr(x);
//        System.out.println("x after = " + x);
        // ------
//        int[] arr = {1,2,3};
//        System.out.println("arr[1] before = " + arr[1]);
//        pow2VAr(arr);
//        System.out.println("arr[1] after = " + arr[1]);

        int[] arr = new int[10];
        printArr(arr);
        fillArr(arr);
        printArr(arr);

    }

    public static void fillArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
           arr[i] = i * i;
            System.out.print(arr[i] + "\t");
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }


//    private static void pow2VAr(int[] arr){
//        arr[1] = arr[1] * arr[1];
//        System.out.println("arr[1] into = " + arr[1]);
//    }

//    public static void printArr(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("i: " + arr[i]);
//        }
//    }

// ----- LESSON 11 ----- Arrays ----- //


// каждый переход мы получаем разницу между числами четными и нечетными, в итоге если эта разница равна = 0 в конце цикла мы получаем true если же любая другая цифра то false
// 322321
// 1-0 = 1; 2-1 = 1;  3-1 = 2;   2-2 = 0;  2-0 = 2; 3-2 = 1
// 132033
// 3-0 = 3; 3-3 = 0; 0 - 0 = 0; 2-0 = 2;  3-2 = 1;  1-1 = 0

    //// ------ LESSON 10 ------- ////
//    public static boolean luckyNumber3(int number) {
//        // TODO Homework explain of idea
//        int sum = 0;
//        while (number != 0) {
//            System.out.println("sum before: " + sum);
//            sum = number % 10 - sum;
//            System.out.println("sum after: " + sum);
//
//            number /= 10;
//        }
//        return sum == 0;
//    }
//
//    public static void figure4(int n) {
//        int a = n;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (j >= i && j < a || i == 1 || i == n || j == 1 || j == n || i == j || j == a) {
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            a--;
//            System.out.println();
//        }
////        for (int i = 1; i <= n; i++) {
////            for (int j = 1; j <= n; j++) {
////                if (i == 1 || i == n || j == 1 || j == n || i == j || j == a) {
////                    System.out.print("* ");
////                } else if (j >= n/2) {
////                    System.out.print("* ");
////                } else {
////                    System.out.print("  ");
////                }
////                b--;
////            }
////            a--;
////            System.out.println();
////        }
//    }

//    public static void figure3(int n) {
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (j <= i || i == 1 || j == n ) {
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//    }

//    public static void figure2(int n) {
//        int a = n;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (i == 1 || i == n || j == 1 || j == n || i == j || j == a) {
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            a--;
//            System.out.println();
//        }
//    }

//    public static void figure1(int n) {
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (i == 1 || i == n || j == 1 || j == n || i == j) {
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//    }

//    public static void figure3(int n) {
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (i == 1 || i == n || j == 1 || j == n) {
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//
//        }
//    }

//    public static void figure(int rows, int col) {
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= col; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//    }
//
//    public static void pithagoras(){
//        for (int i = 1; i <= 10; i++){
//            for (int j = 1; j <= 10; j++){
//                System.out.print(i*j + "\t");
//            }
//            System.out.println();
//        }
//    }


// --------  one fun ---------> //
//    public static boolean LuckyNumTradition(int num) {
//        int totalDigits = countDigits(num);
////        int count = countDigits(num)/2;
//        int pow10 = powPositive(10, totalDigits / 2);
//        int left = totalDigits%2 == 0 ? sumDigits(num / pow10) : sumDigits(num / pow10 / 10);
//        int right = sumDigits( num % pow10);
//        return left == right;
//
//    }
//    public static int countDigits(int num) {
//        int res = 0;
//        do {
//            res++;
//            num /= 10;
//        } while (num != 0);
//        return res;
//    }
//    public static int powPositive(int x, int n) {
//        int res = 1;
//        while (n > 0) {
//            res = res * x;
//            n--;
//        }
//        return res;
//    }
//    public static int sumDigits(int num) {
//        int res = 0;
//        while (num != 0) {
//            res += num % 10;
//            num /= 10;
//        }
//        return res;
//    }
// --------  one fun ---------< //


    //// ------ LESSON 9 ------- ////

    //------- for loop ------- stars function --------
//    public static int forLoopThird(int num) {
//        int res;
//        for (res =0 ; num != 0; num/=10) {
//            res+= num % 10;
//        }
//        return res;
//    }

//    public static void forLoopSecond(int n, int row) {
//        for (int x = 1; x<=n; x++) {
//            System.out.print("*");
//            if (x%row == 0){
//                System.out.println();
//            }
//        }
//        System.out.println();
//    }

//    public static void forLoop() {
//        for (int counter = 10; counter > 0; counter--) {
//            System.out.println("counter: " + counter);
//        }
//        System.out.println("GO!");
//    }


    //------- second -------

//    public static int countDigits(int num) {
//        int res = 0;
//        do {
//            res++;
//            num /= 10;
//        } while (num !=0);
//        return res;
//    }

//----
//    public static int countDigits(int num) {
//        int res = 0;
//        if (num == 0){
//            return 1;
//        } else {
//            while (num != 0) {
//                res++;
//                num /= 10;
//            }
//        }
//        return res;
//    }


    //------- first -------
//    public static int sumDigits(int num) {
//        int res = 0;
//        while (num !=0){
//            res += num % 10;
//            num /= 10;
//        }
//        return res;
//    }


    //// ------ LESSON 8 ------- ////

    //------------- возведение в степень------------------//
//    public static double powNegative(double x, int n) {
//        return n >= 0 ? powPositive(x, n) : 1 / powPositive(x, -n);
//    }


    //-------------------------------//
//    public static void stars(int n, int row) {
//        int x = 1;
//        while (n > 0) {
//            if (n % row != 0) {
//                System.out.print("*");
//            } else {
//                System.out.println("*");
//            }
//            n--;
//        }
//
//    }

//-------------------------------//
//    public static void stars(int n) {
//        boolean check = n%5 != 0;
//        int finger = 1;
//        while (n > 0) {
//            if (finger < 5 ){
//                System.out.print("*");
//                finger++;
//            }else{
//                System.out.println("*");
//                finger = 1 ;
//            }
//            n--;
//        }
//        if (check){
//            System.out.println();
//        }
//    }


}

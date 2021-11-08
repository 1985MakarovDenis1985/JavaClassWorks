package Exceptions;

public class ExceptionsApp {
    /*
     * Exceptions
     * try
     * catch
     * finally
     * throw
     * throws
     */
    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        try {
            int x = solution(a, b);
            System.out.println(x);
            return;
        }
//        catch (Exception e){ // -> Объкт exception перехватывает все ошибки и до нижних не дойде. поэтому он должен обрабатываться в самом низу
//            return;
//        }
        catch (ArithmeticException e) {
//            e.printStackTrace(); // ->  показывает красную ошибку
            System.out.println("No solutions");
            return;
        } catch (IllegalArgumentException e){
            System.out.println("Solutions any number");
            return;
        } catch (Exception e) { // -> Объкт exception перехватывает все ошибки и до нижних не дойде. поэтому он должен обрабатываться в самом низу
            System.out.println("UnknownException");
            return;
        }
        finally { // do not depend has a problem or has not
            System.out.println("By!");
        }
    }

//    private static int solution(int a, int b) {
//        int res = b / a;
//        return res;
//    }

    private static int solution(int a, int b)  throws IllegalAccessException{
        if (a==0 && b !=0 ){ // невозможное решение
            throw new ArithmeticException();
        }
        if (a==0 && b ==0 ){ // возможное решение
//            throw new IllegalArgumentException();
            throw new IllegalAccessException();
        }
        int res = b / a;
        return res;
    }

    // trow - альтернатива return
    // trows - пробросить дальше
}


// iterator, collections
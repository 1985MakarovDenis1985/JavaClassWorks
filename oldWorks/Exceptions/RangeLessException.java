package Exceptions;

public class RangeLessException extends RuntimeException { // run time exception - не проверяемый
    int number;
    public RangeLessException(int number) {
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public void printException(){
        System.out.println("So less...");
    }
}

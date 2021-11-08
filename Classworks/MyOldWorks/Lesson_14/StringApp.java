package Lesson_14;

public class StringApp {
    public static void main(String[] args) {
        greeting("Ukraine");
        calc(1, 2,"+");
    }

    public  static void greeting(String name){
        String res = "Viva " + name;
        System.out.println(res);
    }

    public static void  calc(double a, double b, String operation){
        switch (operation){
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("Wrong operation");
                break;
        }
    }

}

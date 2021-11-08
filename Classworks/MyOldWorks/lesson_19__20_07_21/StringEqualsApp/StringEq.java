package lesson_19__20_07_21.StringEqualsApp;

public class StringEq {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello"; // проверяет в кеше есть ли такой объект или нету и не создает его
        boolean check = str1.equals(str2);
        System.out.println(check);

    }
}

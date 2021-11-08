package PatterMatcher.controller.stringBuilder;

public class StringBuilderApp {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Java"); // не создает при каждом изменнении новый obj а меняет прежний
        builder.append(8);
//        builder.reverse();
        String str = builder.toString();
//        System.out.println(builder);
        str = stringManip("mama");
        System.out.println(str);


    }

    public static String stringManip(String str){
        StringBuilder builder = new StringBuilder(str);
        builder.append(" myla").append(" ramu");
        return builder.toString();
    }

}

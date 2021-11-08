package old.unitTests.RegExp;

public class RegExp {

    public static void main(String[] args) {
        String str = "   java89";
//        String pattern = "(J|j)ava[0-9]?"; // () - группа, [] - класс(всегда один символ), ? - только один символ есть или нет(относиться к предыдущему)
//        String pattern = "(J|j)ava[0-9]*"; // * - сколь угодно
//        String pattern = "(J|j)ava.+" . - любой символ, + - обязательно должен быть символ
        String pattern = "\\s*(J|j)ava\\d{3,5}"; // <3 ... >5
//        boolean check = str.matches(pattern);
//        System.out.println(check);

        String domain = "peter.il";
        pattern = "\\w+\\.(com|il|ru|by)";
        boolean check = domain.matches(pattern);
//        System.out.println(check);

        String email = "peter.jackson92@gmail.com";
        pattern = "\\w(\\w|\\.|-)*\\w@\\w(\\w|\\.|-)*\\.[a-zA-Z]{2,6}";
        check = email.matches(pattern);
//        System.out.println(check);

        String words = "Mama   myla ramu";
        String[] arr = words.split("\\s+");  // + 1 или более раз
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        String card = "23456789012";
        pattern = "";

        String Date1 = "23456789012";
        pattern = "";

        String Date2 = "23456789012";
        pattern = "";

        String Phone = "23456789012";
        pattern = "";

    }

}

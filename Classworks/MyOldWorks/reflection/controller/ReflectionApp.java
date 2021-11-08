package telran.reflection.controller;

public class ReflectionApp {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // 1 solution
        Class<String> clazzStr1 = String.class;

        // 2 solution
        String str = "";
        Class<? extends String> clazzStr2 = str.getClass();

        // 3 solution
        Class<?> clazzStr3 = Class.forName("java.lang.String");

        System.out.println(clazzStr1 == clazzStr2);
        System.out.println(clazzStr2 == clazzStr3);

        String str1 = (String) clazzStr3.newInstance();

    }

}

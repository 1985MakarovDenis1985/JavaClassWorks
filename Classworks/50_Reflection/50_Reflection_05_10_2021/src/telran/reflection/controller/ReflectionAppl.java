package telran.reflection.controller;

public class ReflectionAppl {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<String> clazzStr1 = String.class;
		String str = "";
		Class<? extends String> clazzStr2 = str.getClass();
		Class<?> clazzStr3 = Class.forName("java.lang.String");
		boolean check = clazzStr1 == clazzStr2;
		System.out.println(check);
		System.out.println(clazzStr3 == clazzStr2);
		String str1 = (String) clazzStr3.newInstance();
		

	}

}

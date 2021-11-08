package telran.wrapper.controller;

public class WrapperClassesAppl {

	public static void main(String[] args) {
		int x = 10;
		Integer y = 20;
		System.out.println(x);
		System.out.println(y);
		y = y + 100;
		System.out.println(y);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		String str1 = Integer.toString(x);
		String str2 = y.toString();
		str1 = "42";
		x = Integer.parseInt(str1);
		x = x * 10;
		System.out.println(x);
		str2 = "3.1415926";
		double pi = Double.parseDouble(str2);
		double length = 2 * pi * 10;
		System.out.println(length);
		Boolean check = true;
		str1 = "TrUE";
		check = Boolean.parseBoolean(str1);
		System.out.println(check);
		double a = 20 / 10.;
		if (Double.isNaN(a) || Double.isInfinite(a)) {
			System.out.println("Wrong result");
		} else {
			System.out.println(a);
		}
	}

}

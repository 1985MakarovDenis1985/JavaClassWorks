package telran.string.controller;

public class StringIntroAppl {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str);
		str = str + " world";
		System.out.println(str);
		str = 8 - 1 + "Java" + 8 + 1;
		System.out.println(str);
		greeting("Dina");
		calculator(5, 6, "#");
	}

	public static void greeting(String name) {
		String res = "Viva " + name;
		System.out.println(res);
	}

	public static void calculator(double a, double b, String oper) {
		switch (oper) {
		case "+":
			System.out.println(a + b);
			break;
		case "-":
			System.out.println(a - b);
			break;
		case "x":
			System.out.println(a * b);
			break;
		case "/":
			System.out.println(a / b);
			break;
		default:
			System.out.println("Wrong operation");
		}
	}

}

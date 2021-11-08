
public class StackAppl {

	public static void main(String[] args) {
		System.out.println("Main start");
		function1();
		System.out.println("Main finish");
	}

	public static void function1() {
		System.out.println("Function1 start");
		function2();
		System.out.println("Function1 finish");
	}

	public static void function2() {
		System.out.println("Function2 start");
		function3();
		System.out.println("Function2 finish");
	}

	public static void function3() {
		System.out.println("Function3 start");
		function4();
		System.out.println("Function3 finish");
	}

	public static void function4() {
		System.out.println("Function4 start");
		System.out.println("Function4 finish");
	}

}


public class IfElseAppl {

	public static void main(String[] args) {
		int height = 177;
		if (height > 192) {
			System.out.println("I am very tall");
		} else {
			System.out.println("I am ordinary");
		}
		System.out.println("My height = " + height);
		double res = max(5, 6);
		System.out.println("max = " + res);
		int z = sign(0);
		System.out.println("sign = " + z);
		boolean check = checkArmy(55);
		if (check) {
			System.out.println("Go to army");
		} else {
			System.out.println("Go rest");
		}
	}

	public static double max(double x, double y) {

		if (x > y) {
			return x;
		}
		return y;
	}

	public static int sign(double x) {
		if (x > 0) {
			return 1;
		}
		if (x < 0) {
			return -1;
		}
		return 0;
	}

	public static double abs(double x) {
		double res;
		if (x >= 0) {
			res = x;
		} else {
			res = -x;
		}
		return res;
	}

	public static boolean checkArmy(int age) {
		return 18 <= age && age < 45;
	}

}

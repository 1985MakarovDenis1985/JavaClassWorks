
public class FunctionAdvAppl {

	public static void main(String[] args) {
		double res = 0;
		res = pi();
		System.out.println(res);
		double r = 5;
		res = circleLength(r);
		System.out.println(res);
		res = max(50, 6);
		System.out.println(res);
		res = abs(-5);
		System.out.println(res);
	}

	public static double pi() {
		return 3.1415926;
	}

	public static double circleLength(double radius) {
		double len = 2 * pi() * radius;
		return len;
	}

	public static double max(double x, double y) {
		return x > y ? x : y;
	}

	public static double abs(double x) {
		return x >= 0 ? x : -x;
	}

}

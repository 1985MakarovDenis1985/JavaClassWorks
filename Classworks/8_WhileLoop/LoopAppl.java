
public class LoopAppl {

	public static void main(String[] args) {
//		 haharin();
		printStars(22);
		double pow = powPositive(3, 5);
		System.out.println(pow);
	}

	public static void printStars(int n) {
		boolean check = n % 5 != 0;
		int finger = 1;
		while (n > 0) {
			if (finger < 5) {
				System.out.print("*");
				finger++;
			} else {
				System.out.println("*");
				finger = 1;
			}
			n--;
		}
		if (check) {
			System.out.println();
		}
	}

	public static void haharin() {
		int counter = 10;
		while (counter > 0) {
			System.out.println(counter);
			counter--; // counter = counter - 1;
		}
		// System.out.println(counter);
		System.out.println("GO!");
	}

	public static double powPositive(double x, int n) {
		double res = 1;
		while (n > 0) {
			res = res * x;
			n--;
		}
		return res;
	}

}


public class ForLoopAppl {

	public static void main(String[] args) {
		int num = 5671273;
		//haharin();
		printStars(28, 6);
		int sum = sumDigits(num);
		System.out.println("Sum digits = " + sum);
	}
	
	public static int sumDigits(int num) {
		int res = 0;
		for (; num != 0; num /= 10) {
			res += num % 10;
		}
		return res;
	}

	public static void printStars(int n, int row) {
		for (int x = 1; x <= n; x++) {
			System.out.print("*");
			if (x % row == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	public static void haharin() {
		for (int counter = 10; counter > 0; counter--) {
			System.out.println(counter);

		}
		// System.out.println(counter);
		System.out.println("GO!");
	}

}


public class LuckyNumberAppl {

	public static void main(String[] args) {
		boolean res = luckyNumberTraditional(1235106);
		if (res) {
			System.out.println("Lucky");
		} else {
			System.out.println("Unlucky");
		}

	}

	public static boolean luckyNumber(int number) {
		int sum1 = 0;
		int sum2 = 0;
		int pos = 1;
		while (number != 0) {
			if (pos % 2 == 0) {
				sum1 += number % 10;
			} else {
				sum2 += number % 10;
			}
			pos++;
			number /= 10;
		}
		return sum1 == sum2;
	}

	public static boolean luckyNumber2(int number) {
		int sum1 = 0;
		int sum2 = 0;
		while (number != 0) {
			sum1 += number % 10;
			number /= 10;
			sum2 += number % 10;
			number /= 10;
		}
		return sum1 == sum2;
	}

	public static boolean luckyNumber3(int number) {
		// TODO Homework explain of idea
		int sum = 0;
		while (number != 0) {
			sum = number % 10 - sum;
			number /= 10;
		}
		return sum == 0;
	}

	public static boolean luckyNumberTraditional(int number) {
		int totalDigits = countDigits(number);
		int pow10 = pow(10, totalDigits / 2);
		int left = totalDigits % 2 == 0 ? sumDigits(number / pow10) : sumDigits(number / pow10 / 10);
		int right = sumDigits(number % pow10);
		return left == right;
	}

	public static int sumDigits(int num) {
		int res = 0;
		while (num != 0) {
			res += num % 10;
			num /= 10;
		}
		return res;
	}

	public static int countDigits(int num) {
		int res = 0;
		do {
			res++;
			num /= 10; // num = num / 10;
		} while (num != 0);
		return res;
	}

	private static int powPositive(int x, int n) {
		int res = 1;
		while (n > 0) {
			res = res * x;
			n--;
		}
		return res;
	}

	public static int pow(int x, int n) {
		return n >= 0 ? powPositive(x, n) : 1 / powPositive(x, -n);
	}

}

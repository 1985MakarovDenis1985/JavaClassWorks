
public class LoopAdvAppl {

	public static void main(String[] args) {
		int num = 5671273;
		int sum = sumDigits(num);
		System.out.println("Sum digits = " + sum);
		int count = countDigits(3);
		System.out.println("Count digits = " + count);
	}

	public static int sumDigits(int num) {
		int res = 0;
		while (num != 0) {
			res += num % 10; // res = res + num % 10;
			num /= 10; // num = num / 10;
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

}

package telran.exceptions.controller;

/*
 * try
 * catch
 * finally
 * throw
 * throws
 */
public class ExceptionAppl {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		try {
			int x = solution(a, b);
			System.out.println(x);
			return;
		} catch (ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("No solutions");
			return;
		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
			System.out.println("Solution any number");
			return;
		} catch (Exception e) {
			System.out.println("Unknown Exception");
		} finally {
			System.out.println("Bye, bye!");
		}

	}

	private static int solution(int a, int b) throws IllegalAccessException, ArithmeticException {
		if (a == 0 && b != 0) {
			throw new ArithmeticException();
		}
		if (a == 0 && b == 0) {
			throw new IllegalAccessException();
		}
		int res = b / a;
		return res;
	}

}

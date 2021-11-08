package telran.range.exceptions;

public class RangeLessException extends RuntimeException {
	int number;

	public RangeLessException(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void printException() {
		System.out.println("So less...");
	}
}

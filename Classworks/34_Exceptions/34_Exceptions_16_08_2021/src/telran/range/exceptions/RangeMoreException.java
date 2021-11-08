package telran.range.exceptions;

public class RangeMoreException extends Exception {
	int number;

	public RangeMoreException(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
	
	public void printException() {
		System.out.println("Too much...");
	}

}

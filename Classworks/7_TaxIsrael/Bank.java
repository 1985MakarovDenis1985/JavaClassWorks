
public class Bank {

	public static void main(String[] args) {
		leumi(1);

	}

	public static void leumi(int day) {
		switch (day) {
		case 1:
		case 3:
		case 5:
			System.out.println("8:30 - 13:30");
			break;
		case 2:
		case 4:
			System.out.println("8:30 - 13:00 and 16:00 - 18:00");
			break;
		case 6:
		case 7:
			System.out.println("Closed");
			break;
		default:
			System.out.println("Wrong day");
		}
	}

}

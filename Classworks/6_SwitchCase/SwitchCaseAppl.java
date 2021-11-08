
public class SwitchCaseAppl {

	public static void main(String[] args) {
		fan2(3);
		double res = calculator(4, 5, 20);
		System.out.println("Result = " + res);
		scheduler(188);
	}
	
	public static void scheduler(int week) {
		if(week < 1 || week > 52) {
			System.out.println("wrong week");
			return;
		}
		switch (week % 4) {
		case 1:
			System.out.println("John");
			break;
		case 2:
			System.out.println("Peter");
			break;
		case 3:
			System.out.println("Mary");
			break;
		case 0:
			System.out.println("Tigran");
			break;
		}
	}

	public static double calculator(double a, double b, int oper) {
		switch (oper) {
		case 1:
			return a + b;
		case 2:
			return a - b;
		case 3:
			return a * b;
		case 4:
			return a / b;
		default:
			//System.out.println("Error");
			return 0;
		}
	}

	public static void fan2(int mode) {
		switch (mode) {
		case 0:
			System.out.println("Off");
			break;
		case 1:
			System.out.println("Slow");
			break;
		case 2:
			System.out.println("Medium");
			break;
		case 3:
			System.out.println("Fast");
			break;
		default:
			System.out.println("Wrong mode");
		}
	}

	public static void fan(int mode) {
		if (mode == 0) {
			System.out.println("Off");
		} else {
			if (mode == 1) {
				System.out.println("Slow");
			} else {
				if (mode == 2) {
					System.out.println("Medium");
				} else {
					if (mode == 3) {
						System.out.println("Fast");
					} else {
						System.out.println("Wrong mode");
					}
				}
			}
		}
	}

	public static void fan1(int mode) {
		if (mode == 0) {
			System.out.println("Off");
		}
		if (mode == 1) {
			System.out.println("Slow");
		}
		if (mode == 2) {
			System.out.println("Medium");
		}
		if (mode == 3) {
			System.out.println("Fast");
		}
		if (mode < 0 || mode > 3) {
			System.out.println("Wrong mode");
		}

	}
}

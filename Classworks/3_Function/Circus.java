
public class Circus {
	
	private static void lightOff() {
		System.out.println("Light off");

	}

	public static void main(String[] args) {
		lightOn();
		entertainer();
		lightOff();

	}

	private static void entertainer() {
		singer();
		clown();
		joggler();
	}

	

	private static void joggler() {
		System.out.println("My name is John Smith");
		System.out.println("I am a joggler");
		
	}

	private static void singer() {
		System.out.println("My name is Philipp");
		System.out.println("I am a super singer");

	}

	

	private static void lightOn() {
		System.out.println("Light on");

	}
	
	private static void clown() {
		System.out.println("My name is Oleg Popov");
		System.out.println("I am a clown");
	}

}

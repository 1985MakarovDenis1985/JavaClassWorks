
public class TaxIsrael {

	public static void main(String[] args) {
		double res = taxIsrael(6000, 5.25);
		System.out.println("Tax = " + res);

	}

	public static double taxIsrael(double salary, double taxAllowance) {
		//0, 6330, 9080, 14580, 20260, 42160, 54300
		//0.1, 0.14, 0.2, 0.31, 0.35, 0.47, 0.5
		double tax = -(taxAllowance * 219);
		if (salary > 0 && salary < 6330) {
			double res = tax + (salary - 0) * 0.1;
			return res > 0 ? res : 0;
		} else {
			tax = tax + (6330 - 0) * 0.1;
		}
		if (salary >= 6330 && salary < 9080) {
			double res = tax + (salary - 6330) * 0.14;
			return res > 0 ? res : 0;
		} else {
			tax = tax + (9080 - 6330) * 0.14;
		}
		if (salary >= 9080 && salary < 14580) {
			double res = tax + (salary - 9080) * 0.2;
			return res > 0 ? res : 0;
		} else {
			tax = tax + (14580 - 9080) * 0.2;
		}
		if (salary >= 14580 && salary < 20260) {
			double res = tax + (salary - 14580) * 0.31;
			return res > 0 ? res : 0;
		} else {
			tax = tax + (20260 - 14580) * 0.31;
		}
		if (salary >= 20260 && salary < 42160) {
			double res = tax + (salary - 20260) * 0.35;
			return res > 0 ? res : 0;
		} else {
			tax = tax + (42160 - 20260) * 0.35;
		}
		if (salary >= 42160 && salary < 54300) {
			double res = tax + (salary - 42160) * 0.47;
			return res > 0 ? res : 0;
		} else {
			tax = tax + (54300 - 42160) * 0.47;
		}
		double res = tax + (salary - 54300) * 0.5;
		return res > 0 ? res : 0;
	}

	public static double netSalary(double salary, double taxAllowance) {
		return salary - taxIsrael(salary, taxAllowance);
	}

}

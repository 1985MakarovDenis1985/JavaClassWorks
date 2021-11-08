package telran.employee.model;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private double taxAllowance;

	public Employee(int id, String name, double salary, double taxAllowance) {
		if (id >= 0) {
			this.id = id;
		}
		this.name = name;
		setSalary(salary);
		setTaxAllowance(taxAllowance);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTaxAllowance() {
		return taxAllowance;
	}

	public void setTaxAllowance(double taxAllowance) {
		if (taxAllowance > 0) {
			this.taxAllowance = taxAllowance;
		}
	}

	public int getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		}
	}

	public double taxIsrael() {
		double[] levels = { 0, 6330, 9080, 14580, 20260, 42160, 54300 };
		double[] rates = { 0.1, 0.14, 0.2, 0.31, 0.35, 0.47, 0.5 };
		double tax = -(taxAllowance * 219);
		for (int i = 0; i < levels.length - 1; i++) {
			if (salary > levels[i] && salary <= levels[i + 1]) {
				tax = tax + (salary - levels[i]) * rates[i];
				return tax < 0 ? 0 : tax;
			} else {
				tax = tax + (levels[i + 1] - levels[i]) * rates[i];
			}
		}
		tax = tax + (salary - levels[levels.length - 1]) * rates[rates.length - 1];
		return tax < 0 ? 0 : tax;
	}

	public double netSalary() {
		return salary - taxIsrael();
	}

	public void display() {
		System.out.println(
				"ID: " + this.id + ", Name: " + this.name + ", Salary: " + this.salary + ", Tax: " + this.taxIsrael());
	}
}

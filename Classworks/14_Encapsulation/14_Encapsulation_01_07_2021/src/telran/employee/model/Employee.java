package telran.employee.model;

public class Employee {
	public int id;
	public String name;
	public double salary;
	public double taxAllowance;
	
	public void display() {
		System.out.println("ID: " + id + ", Name: " + name+
				", Salary: " + salary + ", Tax allowance: " + taxAllowance);
	}
}

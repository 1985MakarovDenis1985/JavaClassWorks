package telran.employee.controller;

import telran.employee.model.Employee;

public class EmployeeAppl {

	public static void main(String[] args) {
		Employee john = new Employee(1000, "John Smith", 20000, 2.25);
		john.display();
		Employee peter = new Employee(2000, "Peter Jackson", 18000, 5.25);
		peter.display();
		System.out.println(peter.taxIsrael());
		System.out.println(john.taxIsrael());
		double totalTaxes = peter.taxIsrael() + john.taxIsrael();
		System.out.println(totalTaxes);
		double totalSalary = john.getSalary() + peter.getSalary();
		System.out.println(totalSalary);
		john.setSalary(100);
		john.display();
	}

}

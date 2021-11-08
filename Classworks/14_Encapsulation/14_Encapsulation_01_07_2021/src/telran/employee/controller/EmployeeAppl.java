package telran.employee.controller;

import telran.employee.model.Employee;

public class EmployeeAppl {

	public static void main(String[] args) {
		Employee john = new Employee();
		john.id = 1000;
		john.name = "John Smith";
		john.salary = 20000;
		john.taxAllowance = 2.25;
		john.display();
		Employee peter = new Employee();
		peter.id = 2000;
		peter.name = "Peter Jackson";
		peter.salary = 18000;
		peter.taxAllowance = 5.25;
		peter.display();
		

	}

}

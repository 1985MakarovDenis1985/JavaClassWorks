package telran.employee.dao;

import java.util.HashSet;
import java.util.Set;

import telran.employee.interfaces.ICompany;
import telran.employee.model.Employee;
import telran.employee.model.SalesManager;

public class CompanySet implements ICompany {
	private Set<Employee> employees;
	private int capacity;

	public CompanySet(int capacity) {
		this.capacity = capacity;
		employees = new HashSet<>();
	}

	@Override
	public boolean addEmployee(Employee employee) {
		if (employee == null || employees.size() == capacity) {
			return false;
		}
		return employees.add(employee);
	}

	@Override
	public Employee removeEmployee(int id) {
		Employee victim = findEmployee(id);
		employees.remove(victim);
		return victim;
	}

	@Override
	public Employee findEmployee(int id) {
		for (Employee employee : employees) {
			if (employee.getId() == id) {
				return employee;
			}
		}
		return null;
	}

	@Override
	public double totalSalary() {
		double sum = 0;
		for (Employee employee : employees) {
			sum += employee.calcSalary();
		}
		return sum;
	}

	@Override
	public int quantity() {
		return employees.size();
	}

	@Override
	public double totalSales() {
		double sum = 0;
		for (Employee employee : employees) {
			if (employee instanceof SalesManager) {
				SalesManager sm = (SalesManager) employee;
				sum += sm.getSalesValue();
			}
		}
		return sum;
	}

	@Override
	public void printEmployees() {
		employees.forEach(e -> System.out.println(e));

	}

}

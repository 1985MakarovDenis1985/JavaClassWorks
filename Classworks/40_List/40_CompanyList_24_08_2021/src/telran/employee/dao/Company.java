package telran.employee.dao;

import telran.employee.interfaces.ICompany;
import telran.employee.model.Employee;
import telran.employee.model.SalesManager;

public class Company implements ICompany {
	private Employee[] employees;
	private int size;

	public Company(int capacity) {
		employees = new Employee[capacity];
	}

	@Override
	public boolean addEmployee(Employee employee) {
		if(size == employees.length 
				|| findEmployee(employee.getId()) != null) {
			return false;
		}
		employees[size] = employee;
		size++;
		return true;
	}

	@Override
	public Employee removeEmployee(int id) {
		for (int i = 0; i < size; i++) {
			if(employees[i].getId() == id) {
				Employee victim = employees[i];
				employees[i] = employees[size - 1];
				size--;
				employees[size] = null;
				return victim;
			}
		}
		return null;
	}

	@Override
	public Employee findEmployee(int id) {
		for (int i = 0; i < size; i++) {
			if(employees[i].getId() == id) {
				return employees[i];
			}
		}
		return null;
	}

	@Override
	public double totalSalary() {
		double sum = 0;
		for (int i = 0; i < size; i++) {
			sum += employees[i].calcSalary();
		}
		return sum;
	}

	@Override
	public int quantity() {
		return size;
	}

	@Override
	public double totalSales() {
		double sum = 0;
		for (int i = 0; i < size; i++) {
			if(employees[i] instanceof SalesManager) {
				SalesManager sm = (SalesManager) employees[i];
				sum += sm.getSalesValue();
			}
		}
		return sum;
	}

	@Override
	public void printEmployees() {
		for (int i = 0; i < size; i++) {
			System.out.println(employees[i]);
		}

	}

}

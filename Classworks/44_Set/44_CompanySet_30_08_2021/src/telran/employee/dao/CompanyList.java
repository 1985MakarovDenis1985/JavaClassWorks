package telran.employee.dao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import telran.employee.interfaces.ICompany;
import telran.employee.model.Employee;
import telran.employee.model.Manager;
import telran.employee.model.SalesManager;

public class CompanyList implements ICompany {
	private List<Employee> employees;
	private int capacity;
	
	public CompanyList(int capacity) {
		this.capacity = capacity;
		employees = new ArrayList<>();
	}

	@Override
	public boolean addEmployee(Employee employee) {
		if(employees.size() == capacity || employees.contains(employee)) {
			return false;
		}
		employees.add(employee);
		return true;
	}

	@Override
	public Employee removeEmployee(int id) {
		Employee victim = findEmployee(id);
		employees.remove(victim);
		return victim;
	}

	@Override
	public Employee findEmployee(int id) {
//		Employee fake = new Manager(id, null, null, 0, 0, 0);
//		int index = employees.indexOf(fake);
//		return index < 0 ? null : employees.get(index);
		for (Employee employee : employees) {
			if(employee.getId() == id) {
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
			if(employee instanceof SalesManager) {
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

package Employee_40_LinkedList.dao;

import Employee_40_LinkedList.interfacese.ICompany;
import Employee_40_LinkedList.models.Employee;
import Employee_40_LinkedList.models.Manager;
import Employee_40_LinkedList.models.SalesManager;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompanyList implements ICompany {
    private List<Employee> employees;
    private int capacity;

    public CompanyList(int capacity) {
        this.capacity = capacity;
        employees = new LinkedList<>();
    }

    @Override
    public boolean addEmployee(Employee employee) {
        if (employees.size() == capacity || employees.contains(employee)) {return false;}
        employees.add(employee);
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        Employee employee = findEmployee(id);
        employees.remove(employee);
        return employee;
    }

    @Override
    public Employee findEmployee(int id) {
//        Employee fake = new Manager(id, null, null, 0,0,0);
//        int index = employees.indexOf(fake);
//        return index < 0 ? null : employees.get(index);
        for (Employee employee : employees) {
            if (employee.getId() == id) return employee;
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
    public double avgSalary() {
        return totalSalary() / employees.size();
    }

    @Override
    public double totalSales() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee instanceof SalesManager){
                SalesManager sm = (SalesManager) employee;
                sum += sm.getSalesValue();
            }
        }
        return sum;
    }

    @Override
    public void printEmployee() {
        employees.forEach(e -> System.out.println(e));
    }
}

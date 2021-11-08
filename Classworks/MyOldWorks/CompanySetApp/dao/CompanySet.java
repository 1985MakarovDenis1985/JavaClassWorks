package CompanySetApp.dao;

import CompanySetApp.interfacese.ICompany;
import CompanySetApp.models.Employee;
import CompanySetApp.models.SalesManager;

import java.util.HashSet;
import java.util.Set;

public class CompanySet implements ICompany {
    private Set<Employee> employees;
    private int capacity;

    public CompanySet(int capacity) {
        this.capacity = capacity;
        employees = new HashSet<>();
    }

    @Override
    public boolean addEmployee(Employee employee) {
        if (employee == null || employees.size() == capacity){
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
        for(Employee el: employees){
            if (el.getId() == id){
                return el;
            }
        }
        return null;
    }

    @Override
    public double totalSalary() {
        double sum = 0;
        for (Employee el: employees){
            sum += el.calcSalary();
        }

        return sum;
    }

    @Override
    public int quantity() {
        return employees.size();
    }

    @Override
    public double avgSalary() {
        return totalSalary() / quantity();
    }

    @Override
    public double totalSales() {
        double sum = 0;
        for (Employee el: employees) {
            if (el instanceof SalesManager){
                sum += ((SalesManager) el).getSalesValue();
            }
        }
        return sum;
    }

    @Override
    public void printEmployee() {
        employees.forEach( e -> System.out.println(e));
    }
}

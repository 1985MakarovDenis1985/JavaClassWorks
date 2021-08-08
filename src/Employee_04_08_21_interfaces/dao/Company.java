package Employee_04_08_21_interfaces.dao;

import Employee_04_08_21_interfaces.interfacese.ICompany;
import Employee_04_08_21_interfaces.models.Employee;
import Employee_04_08_21_interfaces.models.SalesManager;

public class Company implements ICompany {
    private Employee[] employees;
    private int size;

    public Company(int capacity) {
        employees = new Employee[capacity];
    }

    @Override
    public boolean addEmployee(Employee employee) {
        if (size == employees.length || findEmployee(employee.getId()) != null){
            return false;
        }
        employees[size++] = employee;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id){
                Employee victim = employees[i];
                employees[i] = employees[--size];
                System.out.println();

                return victim;
            }
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id){
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
    public double avgSalary() {
        return totalSalary() / size;
    }

    @Override
    public double totalSales() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i] instanceof SalesManager){
                sum += ((SalesManager) employees[i]).getSalesValue();
            }
        }
        return sum;
    }

    @Override
    public void printEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }
}

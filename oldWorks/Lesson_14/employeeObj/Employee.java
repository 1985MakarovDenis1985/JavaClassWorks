package Lesson_14.employeeObj;

public class Employee {
    public int id;
    public String name;
    public double salary;
    public double taxAllowance;

    public void display(){
        System.out.println("ID: " + id);
        System.out.println("name: " + name);
        System.out.println("salary: " + salary);
        System.out.println("taxAllowance: " + taxAllowance);
    }
}

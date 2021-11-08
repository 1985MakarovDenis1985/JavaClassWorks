package Lesson_14.controller;
import Lesson_14.employeeObj.Employee;

public class EmployeeController {
    public static void main(String[] args) {
        Employee john = new Employee();
        Employee peter = new Employee();

        john.id = 1;
        john.name = "John Smith";
        john.salary = 20000;
        john.taxAllowance = 2.25;

        peter.id = 2;
        peter.name = "Peter Jackson";
        peter.salary = 1005000;
        peter.taxAllowance = 5.25;

        peter.display();
    }


}

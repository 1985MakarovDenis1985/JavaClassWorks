package ObjectOrientedStream.controller;

import ObjectOrientedStream.employee.Address;
import ObjectOrientedStream.employee.Employee;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SaveEmployeeApp {
    public static void main(String[] args) {
        Address address1 = new Address("Beer Sheva", "Yeelim", 3, 100500);
        Employee employee1 = new Employee(1, "Peter", LocalDate.of(1991, 5, 21), 9000.50, address1);
        Employee employee2 = new Employee(2, "John", LocalDate.of(1989, 11, 7), 8000.50, address1);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data"))) {
            oos.writeObject(employees);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

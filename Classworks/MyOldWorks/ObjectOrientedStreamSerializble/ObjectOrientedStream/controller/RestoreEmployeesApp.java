package ObjectOrientedStream.controller;

import ObjectOrientedStream.employee.Employee;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class RestoreEmployeesApp {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data"))){
            List<Employee> employees = (List<Employee>) ois.readObject();
            employees.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

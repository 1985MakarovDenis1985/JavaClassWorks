package telran.Annotation.employee.model.controller;

import telran.Annotation.employee.model.Employee;
import telran.Annotation.tools.TableInfoRunner;

public class App {
    public static void main(String[] args) {
        TableInfoRunner.runInfo(Employee.class);
    }
}

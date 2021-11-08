package telran.Annotation.employee.model;

import telran.Annotation.Id;
import telran.Annotation.Index;
import telran.Annotation.Table;

import java.time.LocalDate;

@Table(value = "employees")

public class Employee {
    @Id
    @Index(unique = true)
    int id;
    String name;
    int salary;
    @Index
    LocalDate birthDay;

    public Employee() {
    }

    public Employee(int id, String name, int salary, LocalDate birthDay) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.birthDay = birthDay;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

}

package ObjectOrientedStream.employee;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Serializable { // статические поля не сериализуются || всегда добавлять serial version ID
    int id;
    String name;
    LocalDate birthDay;
    double salary;
    Address address;



    public Employee(int id, String name, LocalDate birthDay, double salary, Address address) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.salary = salary;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public double getSalary() {
        return salary;
    }

    public Address getAddress() {
        return address;
    }

//    public void setBirthDay(LocalDate birthDay) {
//        this.birthDay = birthDay;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Employee -> { " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", salary=" + salary +
                ", address=" + address +
                " }";
    }
}

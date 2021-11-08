package employeeClone;

import ObjectOrientedStream.employee.Address;
import ObjectOrientedStream.employee.Employee;

import java.io.*;
import java.time.LocalDate;

public class EmployeeCloneApp {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        Address address1 = new Address("Beer Sheva", "Yeelim", 3, 100500);
        Employee employee1 = new Employee(1, "Peter", LocalDate.of(1991, 5, 21), 9000.50, address1);

        try (ObjectOutputStream oos = new ObjectOutputStream(byteArray)) {
            oos.writeObject(employee1);
        } catch (IOException e) {

        }

        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(byteArray.toByteArray()))) {
            Employee employee2 = (Employee) ois.readObject();
            employee2.getAddress().setCity("Dimona");
            System.out.println(employee1);
            System.out.println(employee2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

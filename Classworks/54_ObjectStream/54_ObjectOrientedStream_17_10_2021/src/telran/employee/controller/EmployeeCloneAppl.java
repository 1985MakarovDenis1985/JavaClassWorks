package telran.employee.controller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

import telran.employee.model.Address;
import telran.employee.model.Employee;

public class EmployeeCloneAppl {

	public static void main(String[] args) {
		ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
		Address address1 = new Address("Be'er Sheva", "Yeelim", 3, 100500);
		Employee empl1 = new Employee(1, "Peter", LocalDate.of(1991, 5, 21), 9000.5, address1);
		try (ObjectOutputStream oos = new ObjectOutputStream(byteArray)) {
			oos.writeObject(empl1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(byteArray.toByteArray()))) {
			Employee empl2 = (Employee) ois.readObject();
			empl2.getAddress().setCity("Dimona");
			System.out.println(empl1);
			System.out.println(empl2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

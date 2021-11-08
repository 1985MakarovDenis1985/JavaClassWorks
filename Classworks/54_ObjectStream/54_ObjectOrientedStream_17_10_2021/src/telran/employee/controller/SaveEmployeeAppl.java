package telran.employee.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import telran.employee.model.Address;
import telran.employee.model.Employee;

public class SaveEmployeeAppl {

	public static void main(String[] args) {
		Address address1 = new Address("Be'er Sheva", "Yeelim", 3, 100500);
		Employee empl1 = new Employee(1, "Peter", LocalDate.of(1991, 5, 21), 9000.5, address1);
		Employee empl2 = new Employee(2, "John", LocalDate.of(1989, 11, 7), 8000.5, address1);
		List<Employee> employees = new ArrayList<>();
		employees.add(empl1);
		employees.add(empl2);
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data"))){
			oos.writeObject(employees);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

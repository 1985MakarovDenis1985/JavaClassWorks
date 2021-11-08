package telran.employee.model;

import java.time.LocalDate;

import telran.table.annotation.Id;
import telran.table.annotation.Index;
import telran.table.annotation.Table;

@Table(value = "employees")
public class Employee {
	@Id
	@Index(unique = true)
	int id;
	@Index
	String name;
	@Index(unique = true)
	int salary;
	@Index
	LocalDate birthDate;

	public Employee() {
	}

	public Employee(int id, String name, int salary, LocalDate birthDate) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.birthDate = birthDate;
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

	public int getId() {
		return id;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", birthDate=" + birthDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}

}

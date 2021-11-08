package telran.employee.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1093665483455672656L;
	int id;
	String name;
	LocalDate birthDate;
	double salary;
	Address address;
	public Employee(int id, String name, LocalDate birthDate, double salary, Address address) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
		this.address = address;
		System.out.println("Hello from consructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", birthDate=" + birthDate + ", salary=" + salary
				+ ", address=" + address + "]";
	}
	
	

}

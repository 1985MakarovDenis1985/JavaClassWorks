package telran.employee.model;

import java.io.Serializable;

public class Address implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6174543873056715305L;
	String city;
	String street;
	int building;
	int aprt;

	public Address(String city, String street, int building, int aprt) {
		this.city = city;
		this.street = street;
		this.building = building;
		this.aprt = aprt;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", building=" + building + ", aprt=" + aprt + "]";
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setStreet(String street) {
		this.street = street;
	}
}

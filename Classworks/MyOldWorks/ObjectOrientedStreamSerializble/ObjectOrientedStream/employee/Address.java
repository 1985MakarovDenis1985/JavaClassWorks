package ObjectOrientedStream.employee;

import java.io.Serializable;

public class Address implements Serializable {
    String city;
    String street;
    int building;
    int apart;

    public Address(String city, String street, int building, int apart) {
        this.city = city;
        this.street = street;
        this.building = building;
        this.apart = apart;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building=" + building +
                ", apart=" + apart +
                '}';
    }
}

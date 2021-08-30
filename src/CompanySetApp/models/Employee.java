package CompanySetApp.models;

import java.util.Objects;

public abstract class Employee {

    protected static double minWage = 30;
    protected final int id;
    protected String firstName;
    protected String lastName;
    protected double hours;

    public Employee(int id, String firstName, String lastName, double hours) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hours = hours;
    }

    public static double getMinWage() {
        return minWage;
    }

    public static void setMinWage(double minWage) {
        Employee.minWage = minWage;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public abstract double calcSalary();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Employee)) return false;
//        Employee employee = (Employee) o;
//        return id == employee.id && Double.compare(employee.hours, hours) == 0 && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, firstName, lastName, hours);
//    }

//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
//        long temp;
//        temp = Double.doubleToLongBits(hours);
//        result = prime * result + (int) (temp ^ (temp >>> 32));
//        result = prime * result + id;
//        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
//        return result;
//    }
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        Employee other = (Employee) obj;
//        if (firstName == null) {
//            if (other.firstName != null)
//                return false;
//        } else if (!firstName.equals(other.firstName))
//            return false;
//        if (Double.doubleToLongBits(hours) != Double.doubleToLongBits(other.hours))
//            return false;
//        if (id != other.id)
//            return false;
//        if (lastName == null) {
//            if (other.lastName != null)
//                return false;
//        } else if (!lastName.equals(other.lastName))
//            return false;
//        return true;
//    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary= " + calcSalary();
    }
}

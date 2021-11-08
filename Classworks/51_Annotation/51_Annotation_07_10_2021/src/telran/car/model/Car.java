package telran.car.model;

import telran.table.annotation.Id;
import telran.table.annotation.Index;
import telran.table.annotation.Table;

@Table
public class Car {
	@Id
	@Index(unique = true)
	String regNumber;
	@Index
	String modelName;
	@Index
	double engine;
	double gasTank;

	public Car() {
	}

	public Car(String regNumber, String modelName, double engine, double gasTank) {
		this.regNumber = regNumber;
		this.modelName = modelName;
		this.engine = engine;
		this.gasTank = gasTank;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public double getEngine() {
		return engine;
	}

	public void setEngine(double engine) {
		this.engine = engine;
	}

	public double getGasTank() {
		return gasTank;
	}

	public void setGasTank(double gasTank) {
		this.gasTank = gasTank;
	}

	public String getRegNumber() {
		return regNumber;
	}

	@Override
	public String toString() {
		return "Car [regNumber=" + regNumber + ", modelName=" + modelName + ", engine=" + engine + ", gasTank="
				+ gasTank + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((regNumber == null) ? 0 : regNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Car)) {
			return false;
		}
		Car other = (Car) obj;
		if (regNumber == null) {
			if (other.regNumber != null) {
				return false;
			}
		} else if (!regNumber.equals(other.regNumber)) {
			return false;
		}
		return true;
	}
}

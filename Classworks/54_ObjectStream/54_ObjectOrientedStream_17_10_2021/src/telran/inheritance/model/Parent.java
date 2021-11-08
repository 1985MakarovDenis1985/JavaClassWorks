package telran.inheritance.model;

import java.io.Serializable;

public class Parent {
	
	private int parentField;

	public Parent() {
		parentField = 10;
		System.out.println("Parent constructor");
	}

	public int getParentField() {
		return parentField;
	}

	public void setParentField(int parentField) {
		this.parentField = parentField;
	}

}

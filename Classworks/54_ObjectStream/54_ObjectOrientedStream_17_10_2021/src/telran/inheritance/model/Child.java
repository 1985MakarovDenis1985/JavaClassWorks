package telran.inheritance.model;

import java.io.Serializable;

public class Child extends Parent implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8270392343542606443L;

	private int childField;

	public Child(int childField) {
		super();
		this.childField = childField;
		System.out.println("Child constructor");
	}

	public int getChildField() {
		return childField;
	}

	public void setChildField(int childField) {
		this.childField = childField;
	}

}

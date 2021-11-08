package inharitace.model;

import java.io.Serializable;

public class Parent  implements Serializable {
    private int parentField;

    public Parent() {
        parentField = 10;
        System.out.println("Parent constructor");
    }

    public int getParentField() {
        return this.parentField;
    }

    public void setParentField(int parentField) {
        this.parentField = parentField;
    }
}

package telran.generics.model;

public class Printer1 {
    Object value;

    public Printer1(Object value) {
        this.value = value;
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{ value : " + value + " }";
    }
}

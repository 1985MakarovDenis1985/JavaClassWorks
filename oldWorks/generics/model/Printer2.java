package telran.generics.model;

public class Printer2 <T extends CharSequence>{
    T value;

    public Printer2(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{ value : " + value + " }";
    }
}

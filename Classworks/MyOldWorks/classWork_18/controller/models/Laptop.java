package classWork_18.controller.models;

public class Laptop extends Computer{
    private double weight;
    private int hours;

    public Laptop(double weight, int hours) {
        this.weight = weight;
        this.hours = hours;
    }

    public Laptop(String cpu, int ram, int hdd, String brand, double weight, int hours) {
        super(cpu, ram, hdd, brand);
        this.weight = weight;
        this.hours = hours;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }

    // преопределили
    public String toString(){
        return super.toString() + " | Weight: " + weight + " | Hours: " + hours;
    }
}

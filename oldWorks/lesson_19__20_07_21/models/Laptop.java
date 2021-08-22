package lesson_19__20_07_21.models;

public class Laptop  extends Computer{
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

    public boolean equals(Object obj){
        Laptop other = (Laptop) obj;
        return super.equals(other) && this.weight == other.weight && this.hours == other.hours;
    }

//    @Override
//    public boolean equals(Object obj) {
//        Laptop other = (Laptop) obj;
//        return super.equals(other) && this.weight == other.weight && this.hours == other.hours;
//    }


}

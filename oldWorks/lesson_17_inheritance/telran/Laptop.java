package lesson_17_inheritance.telran;

public class Laptop extends Computer {
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

// переопределили метод -> на самом деле он один у родителя но был переопределен
//    public void display(){
//        System.out.print("Brand: " + getBrand() + " | CPU: " + cpu + " | RAM: " + ram + " | HDD: " + hdd +
//                " | Weight: " + weight + " | Hours: " + hours);
//    }

//    можно написать другим путем
    public void display() {
        super.display();
        System.out.print( " | Weight: " + weight + " | Hours: " + hours);
    }

    // преопределили
    public String toString(){
        return super.toString() + " | Weight: " + weight + " | Hours: " + hours;
    }
}




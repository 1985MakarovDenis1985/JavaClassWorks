package lesson_17_inheritance.telran;

public class Smartphone extends Laptop {
    private long imei;

    public Smartphone(String cpu, int ram, int hdd, String brand, double weight, int hours, long imei) {
        super(cpu, ram, hdd, brand, weight, hours);
        this.imei = imei;
    }

    public long getImei(){
        return imei;
    }
    public void display(){
        super.display();
        System.out.println(" | IMEI: " + imei);
    }

    // преопределили
    public String toString(){
        return super.toString() + " | IMEI: " + imei;
    }

}

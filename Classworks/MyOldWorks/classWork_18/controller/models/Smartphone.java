package classWork_18.controller.models;

public class Smartphone extends Laptop{
    private long imei;

    public Smartphone(double weight, int hours, long imei) {
        super(weight, hours);
        this.imei = imei;
    }

    public Smartphone(String cpu, int ram, int hdd, String brand, double weight, int hours, long imei) {
        super(cpu, ram, hdd, brand, weight, hours);
        this.imei = imei;
    }

    public long getImei(){
        return imei;
    }
    // преопределили
    public String toString(){
        return super.toString() + " | IMEI: " + imei;
    }
}

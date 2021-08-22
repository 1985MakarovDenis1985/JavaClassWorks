package lesson_18__15_07_21_comp.controller;

public class SmartphoneCasting extends LaptopCasting {
    private long imei;

    public SmartphoneCasting(String cpu, int ram, int hdd, String brand, double weight, int hours, long imei) {
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

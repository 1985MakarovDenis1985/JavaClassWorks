package lesson_19__20_07_21.controller;
import lesson_19__20_07_21.models.Computer;
import lesson_19__20_07_21.models.Laptop;
import lesson_19__20_07_21.models.Smartphone;

public class CompApp {
    protected String cpu;
    protected int ram;
    protected int hdd;
    protected String brand;

    public static void main(String[] args) {
        Computer[] shop = new Computer[3];
        shop[0] = new Computer("i5", 16, 512, "HP");
        shop[1] = new Laptop("i7", 8, 256, "ASUS", 2.1, 2);
        shop[2] = new Smartphone("Snapdragon", 6, 128, "Samsung", 1.2, 8, 1234567890);

//        Computer comp = new Computer("i5", 16, 512, "HP");
//        boolean check = comp.equals(shop[0]);
//        System.out.println(check);
//
//        comp = new Laptop("i7", 8, 256, "ASUS", 2.1, 2);
//        check = comp.equals(shop[1]);
//        System.out.println(check);

        Computer comp = new Laptop("i7", 8, 256, "ASUS", 2.1, 2);
        boolean check = comp.equals(shop[0]);
        System.out.println(check);

    }
}

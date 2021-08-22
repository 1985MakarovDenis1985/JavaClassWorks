package classWork_18.controller.controller;
import classWork_18.controller.models.Computer;
import classWork_18.controller.models.Laptop;
import classWork_18.controller.models.Smartphone;


public class ComputerApp {
    public static void main(String[] args) {
        Computer[] shop = new Computer[3];
        shop[0] = new Computer("i5", 16, 512, "HP");
        shop[1] = new Laptop("i7", 8, 256, "ASUS", 2.1, 2);
        shop[2] = new Smartphone("Snapdragon", 6, 128, "Samsung", 1.2, 8, 1234567890);
        ((Smartphone)shop[2]).getImei(); // что бы достучатся до методов наследников при кастинге;
        System.out.println(((Smartphone)shop[2]).getImei());


        int sumHdd = totalBatteryHours(shop);
        int sumMemory = totalMemory(shop);
        double sumWeight = totalWeight(shop);
        System.out.println("Total => HDD: " + sumHdd + " | Memory: " + sumMemory +  " | Weight : " + sumWeight);
//        printArr(shop);
    }


    private static int totalBatteryHours(Computer[] shop) {
        int res = 0;
        for (int i = 0; i < shop.length; i++) {
            if (shop[i] instanceof Laptop) {
                res += ((Laptop) shop[i]).getHours();
            }
        }
        return res;
    }

    private static  int totalMemory(Computer[] shop){
        int res = 0;
        for (int i = 0; i < shop.length; i++) {
            res += shop[i].getHdd();
        }
        return res;
    }

    private static  double totalWeight(Computer[] shop){
        double res = 0;
        for (int i = 0; i < shop.length; i++) {
            if (shop[i] instanceof Laptop){
                res += ((Laptop) shop[i]).getWeight();
            }
        }
        return res;
    }

    private static void printArr(Computer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    private static void printBrands(Computer[] shop) {
        for (int i = 0; i < shop.length; i++) {
            System.out.println(shop[i].getBrand());
        }
    }
}

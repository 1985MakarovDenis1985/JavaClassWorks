package lesson_18__15_07_21_comp.controller;

public class ComputerAppCasting {

    public static void main(String[] args) {
        ComputerCasting[] shop = new ComputerCasting[3];
        shop[0] = new ComputerCasting("i5", 16, 512, "HP");
        shop[1] = new LaptopCasting("i7", 16, 256, "Asus", 2.1, 2);
        shop[2] = new SmartphoneCasting("Snapdragon", 6, 128, "Samsung", 0.2, 8, 1234567890);
        LaptopCasting a = new LaptopCasting("i7", 16, 256, "Asus", 2.1, 2);

        printArr(shop);
        printBrands(shop);

        int totalHDD = totalMemory(shop);
        System.out.println("total HDD: " + totalHDD);
        int totalHours = totalBatteryHours(shop);
        System.out.println("total hours: " + totalHours);





//      кастинг при несоотвтствиии типов
//        Laptop lap1 = (Laptop) shop[1];
//        System.out.println(lap1.getHours());
    }

    private static int totalBatteryHours(ComputerCasting[] shop){
        int res = 0;
        for (int i = 0; i < shop.length; i++) {
            if (shop[i] instanceof LaptopCasting){
                res += ((LaptopCasting) shop[i]).getHours();
            }
        }
        return res;
    }

    private static  int totalMemory(ComputerCasting[] shop){
        int res = 0;
        for (int i = 0; i < shop.length; i++) {
            res += shop[i].getHdd();
        }
        return res;
    }

    private static void printArr(ComputerCasting[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    private static void printBrands(ComputerCasting[] shop) {
        for (int i = 0; i < shop.length; i++) {
            System.out.println(shop[i].getBrand());
        }
    }
}

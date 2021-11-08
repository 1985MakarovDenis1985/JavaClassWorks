


public class SupermarketApp {
    public static void main(String[] args) {
        Supermarket kiosk = new Supermarket(10);

        boolean check = kiosk.addProduct(new Food("Fish", 25, 879865765, true, "15.10.2021", 25));
//        System.out.println(check);

        kiosk.addProduct(new Milk("Milk", 12, 298427908, true, "15.11.2021", 33, 1.5, "Goat"));
        kiosk.addProduct(new Meat("Meat", 67, 779875765, false, "17.08.2021", "Pig"));
        kiosk.addProduct(new Food("Fish", 25, 878657659, true, "15.10.2021", 25));

        check = kiosk.addProduct(new Food("Fish", 25, 879865765, true, "15.10.2021", 25));
//        System.out.println(check);

        int sku = kiosk.getCurrentSku();
//        System.out.println(sku);

        Product product = kiosk.findProduct(298427908);
//        System.out.println(product);

        kiosk.printProducts();
    }


}

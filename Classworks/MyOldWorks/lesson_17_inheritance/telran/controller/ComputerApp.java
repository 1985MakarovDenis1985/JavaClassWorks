package lesson_17_inheritance.telran.controller;
import lesson_17_inheritance.telran.Computer;
import lesson_17_inheritance.telran.Laptop;
import lesson_17_inheritance.telran.Smartphone;

public class ComputerApp {

    public static void main(String[] args) {
        Computer comp1 = new Computer("i5", 16, 512, "HP");
        Laptop lap1 = new Laptop("i7", 16, 512, "Asus", 2.1, 2);
        comp1.display();System.out.println();
        lap1.display();
        System.out.println();
        Smartphone smart1 =new Smartphone("Snapdragon", 6, 128, "Samsung", 0.2, 8, 1234567890);
        smart1.display();
        System.out.println("============ переопределили для понятия ==========");
        System.out.println(smart1);
        System.out.println(comp1);
        System.out.println(lap1);
        // имя // прайс // баркод //---наслед---// кошер // экспкрейшен дате //---наслед---// дабл фат // Стринг тип
                                                                            //---наслед---// меат фуд // тип

    }
}

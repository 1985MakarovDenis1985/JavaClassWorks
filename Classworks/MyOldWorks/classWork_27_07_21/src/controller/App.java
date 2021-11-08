package controller;

import model.Goat;

public class App {


    public static void main(String[] args) {
        Goat g1 = new Goat();
        for (int i = 0; i < 10; i++) {
            Goat.count++; // нужно так
//            g1.count++;
        }
        System.out.println(g1.count);

        Goat g2 = new Goat();
        for (int i = 0; i < 10; i++) {
//            g2.count++;
        }
        System.out.println(g2.count);
        System.out.println(g1.count);

    }
}

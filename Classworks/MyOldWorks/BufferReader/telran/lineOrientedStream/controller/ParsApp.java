package telran.lineOrientedStream.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ParsApp {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("src/person.csv"))) {
            String str = br.readLine();
//            System.out.println(str);

            String[] cells = str.split(";");
            for (int i=0; i<cells.length; i++){
                System.out.print(cells[i] + "\t");
            }
            System.out.println();

            double salary = 0;
            int count = 0;
            long age = 0;

            str = br.readLine();
            while (str != null){
                count++;
                cells = str.split(";");
                salary += Double.parseDouble(cells[2]);
                age += ChronoUnit.YEARS.between(LocalDate.parse(cells[3], DateTimeFormatter.ofPattern("dd.MM.yyyy")), LocalDate.now());
//                age += ChronoUnit.YEARS.between(LocalDate.parse(cells[3], DateTimeFormatter.BASIC_ISO_DATE), LocalDate.now());
                for (int i=0; i<cells.length; i++){
                    System.out.print(cells[i] + "\t");
                }
                System.out.println();
                str = br.readLine();
            }

            System.out.println("total salary = " + salary);
            System.out.println("average salary = " + salary / count);
            System.out.println("average age = " + 1. * age / count);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

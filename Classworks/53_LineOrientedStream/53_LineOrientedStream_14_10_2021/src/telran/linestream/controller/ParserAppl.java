package telran.linestream.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ParserAppl {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("person.csv"))) {
			String str = br.readLine();
//			System.out.println(str);
			String[] cells = str.split(",");
			for (int i = 0; i < cells.length; i++) {
				System.out.print(cells[i] + "\t");
			}
			System.out.println();
			double salary = 0;
			int count = 0;
			long age = 0;
			str = br.readLine();
			while (str != null) {
				count++;
				cells = str.split(",");
				salary += Double.parseDouble(cells[2]);
				age += ChronoUnit.YEARS.between(LocalDate.parse(cells[3]), LocalDate.now());
				for (int i = 0; i < cells.length; i++) {
					System.out.print(cells[i] + "\t");
				}
				System.out.println();
				str = br.readLine();
			}
			System.out.println("Total salary = " + salary);
			System.out.println("Average salary = " + salary / count);
			System.out.println("Average age = " + 1.0 * age / count);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

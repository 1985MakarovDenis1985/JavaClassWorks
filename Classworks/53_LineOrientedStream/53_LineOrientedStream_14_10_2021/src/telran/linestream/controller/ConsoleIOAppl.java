package telran.linestream.controller;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ConsoleIOAppl {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter file name:");
		String fileName = br.readLine();
		PrintWriter pw = new PrintWriter(fileName);
		System.out.println("Please write your poem here:");
		String str = br.readLine();
		while(!str.isEmpty()) {
			pw.println(str);
			pw.flush();
			str = br.readLine();
		}
		
		pw.close();

	}

}

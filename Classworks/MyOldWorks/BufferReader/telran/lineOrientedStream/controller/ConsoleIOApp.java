package telran.lineOrientedStream.controller;

import java.io.*;

public class ConsoleIOApp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter file name: ");
        String filename = br.readLine();
        PrintWriter pw = new PrintWriter(new FileWriter(filename, true));
        System.out.println("Pleas write your poem here: ");
        filename = br.readLine();
        while (!filename.isEmpty()){
            pw.println(filename);
            filename = br.readLine();
        }
//        pw.flush();
        pw.close();
    }
}

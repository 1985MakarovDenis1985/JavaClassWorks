package telran.byteOut.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutputApp {
    public static void main(String[] args) {
        try (FileOutputStream fout = new FileOutputStream("src/test.data")) {

            fout.write(1);
            fout.write(2);
            fout.write(159);
            fout.write(259);

            fout.write(259);

        } catch (IOException e){
            e.printStackTrace();
        }

    }
}

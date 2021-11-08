package telran.byteInput.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteInputApp {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("src/test.data")) {
//            System.out.println("Available = " + fin.available());
//            int x = fin.read();
//            System.out.println(x);
//            System.out.println("Available = " + fin.available());

//            int x = fin.read();
//            while (x != -1){
//                System.out.println(x);
//                x = fin.read();
//            }

            int size = fin.available();
            for (int i = 0; i < size; i++){
                int x = fin.read();
                System.out.println(x);
            }

//            int size = fin.available();
//            byte[] arr = new byte[size];
//            int len = fin.read(arr);
//            for (int i = 0; i < arr.length; i++) {
//                System.out.println(arr[i]);
//            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

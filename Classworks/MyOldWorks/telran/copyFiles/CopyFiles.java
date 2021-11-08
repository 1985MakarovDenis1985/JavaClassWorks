package telran.copyFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFiles {
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("Wrong arg...");
            return;
        }

             FileOutputStream fout = new FileOutputStream(args[1]);)
        {
            int x = fin.read();
            while (x != -1){
                fout.write(x);
                x = fin.read();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Wrong file name");
        } catch (IOException e) {
            System.out.println("Wrong read / write data");
        }
    }
}

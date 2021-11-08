package File_app;

import java.io.File;
import java.io.IOException;

public class FileApp {
    public static void main(String[] args) throws IOException {
        System.out.println(File.pathSeparator);
        System.out.println(File.separator);
        File file = new File("./"); // "./" -> root
//        System.out.println(file.exists());
//        System.out.println(file.isDirectory());
//        file.delete();
//        file.createNewFile();
//        file.mkdir();
        for (File f : file.listFiles()){
            System.out.println(f.getName() + " - " + (f.isDirectory() ? " dir" : "file"));
        }
    }
}

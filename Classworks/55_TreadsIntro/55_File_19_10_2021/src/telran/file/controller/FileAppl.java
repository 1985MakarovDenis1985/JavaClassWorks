package telran.file.controller;

import java.io.File;
import java.io.IOException;

public class FileAppl {

	public static void main(String[] args) throws IOException {
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		File file = new File("./");
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
//		file.delete();
//		file.createNewFile();
//		file.mkdir();
		for(File f : file.listFiles()) {
			System.out.println(f.getName() + " - " + (f.isDirectory() ? "dir" : "file"));
		}

	}

}

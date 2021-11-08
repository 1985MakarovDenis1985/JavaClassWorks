package telran.byteio.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutputAppl {

	public static void main(String... args) {
		
		try(FileOutputStream fout = new FileOutputStream("test.data")) {
			fout.write(1);
			fout.write(2);
			fout.write(159);
			fout.write(259);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

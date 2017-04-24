package IO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {

	public static void main(String[] args) {
		try {
			RandomAccessFile raf = new RandomAccessFile(
					"C:/JavaProjects/CoreJava/src/Constructor/ConstructorExample1.java", "rw");
			raf.seek(0);
			//System.out.println("raf.readLine(): " +raf.readUTF());
			System.out.println("raf.readLine(): " + raf.readLine());
			raf.seek(200);
			System.out.println("raf.readLine(): " + raf.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
		}
	}

}

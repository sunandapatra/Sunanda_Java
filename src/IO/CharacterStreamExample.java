package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {

	public static void main(String[] args) {
		String inputFile = "C:/JavaProjects/CoreJava/src/Constructor/ConstructorExample.java";
		String outputFile = "C:/JavaProjects/CoreJava/src/Constructor/ConstructorExample1.java";
		//FileReader reader = new FileReader(new File(inputFile));
		
		FileReader reader;
		BufferedWriter bw = null;
		try {
			reader = new FileReader(inputFile);
			BufferedReader br = new BufferedReader(reader); // BufferedInputStream
			
			bw = new BufferedWriter(new FileWriter(outputFile));
			
			int c;
			while((c = br.read()) != -1) {
				bw.write(c);
			}
			bw.flush();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch(IOException e){
			
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Writing Completed...");
		
	}

}
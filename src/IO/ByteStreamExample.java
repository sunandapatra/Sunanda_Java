package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class ByteStreamExample {

	public static void main(String[] args) {
		String inputFile = "C:/Users/biswa/Downloads/SCJP Book 1.pdf";
		String outputFile = "C:/Users/biswa/Downloads/SCJP Book 11.pdf";
		//FileReader reader = new FileReader(new File(inputFile));
		
		FileInputStream reader;
		BufferedOutputStream bw = null;
		try {
			reader = new FileInputStream(inputFile);
			BufferedInputStream br = new BufferedInputStream(reader); // BufferedInputStream
			
			bw = new BufferedOutputStream(new FileOutputStream(outputFile));
			
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
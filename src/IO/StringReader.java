package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringReader {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:/JavaProjects/CoreJava/src/Constructor/ConstructorExample1.java"));
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();
		    
		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		        System.out.println("line: "+line);
		    }
		    String everything = sb.toString();
		    System.out.println("Everyting: "+everything);
		} finally {
		    br.close();
		}

	}

}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PickEmailIds {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("/Users/jrout/Desktop/Batch25StudentsEmail.txt"));
		while(scanner.hasNext()){
			String email = scanner.next();
			if(email.contains("@")) {
				System.out.print(email+",");
			}
	
		}
	}

}
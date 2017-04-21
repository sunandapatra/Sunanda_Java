package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class ScannerExample {

	public static void main(String[] args) {
//		try {
//			jFileChooser();
//			
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
		scanFile();
	}

	public static void scanFile(){
		try {
			Scanner scanInput = new Scanner(System.in);
			System.out.println("Enter a file name");
			
			String fileName = scanInput.next();
			
			Scanner scanner = new Scanner(new File(fileName));
			while(scanner.hasNextLine()){
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @throws IOException
	 */
	public static void jFileChooser() throws IOException {
		JFileChooser chooser = new JFileChooser();
		if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			File file = chooser.getSelectedFile();
			Scanner scan = new Scanner(file);
			while(scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
			scan.close();	
		}
		
	}
	
}

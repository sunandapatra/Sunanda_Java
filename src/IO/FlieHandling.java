package IO;

import java.io.File;

public class FlieHandling {

	public static void main(String[] args) {
		File file1 = new File("C:/JavaProjects/CoreJava/src/Constructor");
		File file = new File("C:/JavaProjects/CoreJava/src/Constructor/ConstructorExample.java");
		System.out.println(file.exists());
		System.out.println(file.canExecute());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.isFile());
		System.out.println(file1.list());
		
		if(file1.isDirectory()){
			String[] listOfFiles = file1.list();
			for(String fileName : listOfFiles) {
				System.out.println(fileName);
			}
		}
		

	}

}
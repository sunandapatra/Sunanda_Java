package CollectionExample;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionExample {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(new File("/Users/jrout/git/batch25/Java/src/corejava/classes/Batch25.txt"));
		
		
		List names = new ArrayList();
		
		//String[] names = new String[13];
		//int index = 0;
		while(scan.hasNextLine()){
			//names[index++] = scan.next();
			//System.out.println(scan.next());
			names.add(scan.next());
		}
		
		printName(names);
		
	}

//	public static void printName(String[] names) {
	public static void printName(List names) {
		/*for(String name : names){
			System.out.println("Your Name is "+ name);
		}*/
		
		for(int i = 0 ; i < names.size(); i++){
			System.out.println("Your Name is "+ names.get(i));
		}
	}
}
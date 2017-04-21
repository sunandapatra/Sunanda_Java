package Exception.JayramException;

import java.util.Scanner;

public class MultipleException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ages[] = {3,4,5,6,7,8,9,2};
		
		int a = 30;
		
		
		System.out.println("Enter input");
		
		/*int b;
		int pickedAge=0;
		try {
			try {
				b = Integer.parseInt(scan.next());
			} catch (NumberFormatException e) {
				b = 10;
				e.printStackTrace();
			}
			
			int c = a/b;
			pickedAge = ages[c];
		} catch (ArrayIndexOutOfBoundsException e) {
			pickedAge = 45;
			e.printStackTrace();
		} // 10
		*/
		
//		int ages[] = {3,4,5,6,7,8,9,2};
		//System.out.println("Picked Age ="+ pickedAge);
		int b = 0;
		int age = 0;
		try {
			b = Integer.parseInt(scan.next());//2 a
			age = ages[b];
		} catch (NumberFormatException e) {
			System.err.println("NumberFormationExcetion");
			b = 5;
			age = ages[b];
		}catch(ArrayIndexOutOfBoundsException aiobExp){
			System.err.println("ArrayIndexOutOfBoundsException");
			b = 6;
			age = ages[b];
		}catch(Exception exp){
			age = 90;
		}finally{
			System.out.println("MultipleException.main()");
		}
		
		System.out.println("Age is ="+ age);
		
		
	}
}

package Exception.JayramException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter First Number");
		String a;
		try {
			a = Integer.toString(scan.nextInt());
		} catch (InputMismatchException e1) {
			a= Integer.toString(5);
		//	e1.printStackTrace();
		}

		System.out.println("Enter Second Number");
		String b;
		try {
			b = Integer.toString(scan.nextInt());
		} catch (InputMismatchException e1) {
			b= Integer.toString(6);
			//e1.printStackTrace();
		}

		// Integer.parseInt("w");

		int finalValue = 0;
		try {
			finalValue = ExceptionCalculator.add(a, b);
		} catch (Exception e) {
			finalValue = 50;
			//e.printStackTrace();
		}

		finalValue = ExceptionCalculator.add(a, b);
		finalValue = ExceptionCalculator.add(a, b);

		finalValue = finalValue + ExceptionCalculator.substract("A", "B", "67");

		System.out.println("Final Value =" + finalValue);

		int finalResult = finalValue + 30;

		System.out.println("End Of the Program.. With Final Result as " + finalResult);

	}

}

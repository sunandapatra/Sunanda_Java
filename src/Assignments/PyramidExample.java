package Assignments;

import java.util.Scanner;

public class PyramidExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the pyramid Number");
		int rows = scan.nextInt();
		System.out.println("Enter diff. between two numbers");
		int diff = scan.nextInt();

		int y = 0;

		for (int i = 0; i <= rows; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(y + "\t");
				y = y + diff;
			}
			System.out.println("");
		}

	}

}
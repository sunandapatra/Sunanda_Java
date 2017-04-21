package Assignments;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Year: \n");
		int year = scan.nextInt();

		// boolean isLeapYear = false; // Your Logic should go here.

		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			System.out.println("Year " + year + " is a leap year");
		else
			System.out.println("Year " + year + " is a not leap year");
	}

}

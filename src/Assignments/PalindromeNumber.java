package Assignments;

import java.util.Scanner;

/**
 * A palindrome is a word, phrase, number, or other sequence of characters which
 * reads the same backward or forward, such as madam or kayak.
 * 
 * @author jrout https://en.wikipedia.org/wiki/Palindrome
 */
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a Number");
		int number = scan.nextInt();
		System.out.println("Number is: " + number);
		int r, sum = 0, temp;
		temp = number;
		while (number > 0) {
			r = number % 10; // getting remainder
			sum = (sum * 10) + r;
			System.out.println("sum is: " + sum);
			number = number / 10;
			System.out.println("Number1 is: " + number);
		}
		if (number == sum)
			System.out.println(number + " is Palindrom");
		else
			System.out.println(number + " is not a Palindrom number ");
	}

}

// 161 is a palindrome number
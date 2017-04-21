package Assignments;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Limit for Fibonacci Series: \n");
		int limit  = scan.nextInt();
		
		long[] series = new long[limit];
        series[0] = 0;
        series[1] = 1;
        
		for(int i=2; i < limit; i++){
			series[i] = series[i-1] + series[i-2];
		}
		
		System.out.println("Fibonacci Series upto " + limit);
        for(int i=0; i< limit; i++){
                System.out.print(series[i] + " ");
        }
	}

}

/**
 * Fibonacci Series upto 5
	0 1 1 2 3 
*/

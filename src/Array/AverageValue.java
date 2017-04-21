package Array;

/**
 * Find the Average Value of the numbers array Eg : Avg value of 3,4,5,6,7 is
 * equals (3+4+5+6+7)/5
 * 
 * @author jrout
 *
 */
public class AverageValue {

	public static void main(String[] args) {
		int[] numbers = new int[] { 10, 20, 30, 25, 16, 70, 100 };
		int a = 0, i = 0;
		for (i = 0; i < numbers.length; i++)
			a = a + numbers[i];
		double average = a / numbers.length;

		System.out.println("Average value of array elements is : " + average);
	}
}

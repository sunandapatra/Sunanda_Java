package Array;

public class FindMinimum {

	public static void main(String[] args) {
		int arr[] = { 6, 4, 8, 2, 1 };
		int minval = arr[0];
		for (int i = 0; i < arr.length; ++i)
			minval = minimum(minval, arr[i]);
		System.out.println("Minimum Value: "+minval);
	}

	public static int minimum(int a, int b) {
		return (a <= b) ? a : b;
	}

}

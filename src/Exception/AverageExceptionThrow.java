package Exception;

public class AverageExceptionThrow {
	public static void main(String[] args) {
		try {
			printAverage(100, 0);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("Exception Handled IN " + "Main().");
		} finally {
			System.out.println("Finally in Main() ");
		}
		System.out.println("Exit Main(). ");
	}

	public static void printAverage(int totalSum, int totalNumber) {
		try {
			int average = computeAverage(totalSum, totalNumber);
			System.out.println("Average= " + totalSum + " / " + totalNumber + " = " + average);
		} catch (IllegalArgumentException ae) {
			ae.printStackTrace();
			System.out.println("Exception Handled IN " + "printAverage().");
		} finally {
			System.out.println("Finally In printAverage() ");
		}
		System.out.println("Exit printAverage(). ");
	}

	public static int computeAverage(int sum, int num) {
		System.out.println("Computing Average. ");
		if (num == 0)
			throw new ArithmeticException("Integer Division By zero");
		return sum / num;
	}
}

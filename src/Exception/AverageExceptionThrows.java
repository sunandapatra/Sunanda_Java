package Exception;

public class AverageExceptionThrows {

	public static void main(String[] args){
		try {
			printAverage(100, 0);
		} catch (Exception ae) {
			ae.printStackTrace();
			System.out.println("Exception Handled IN " + "Main().");
		} finally {
			System.out.println("Finally in Main() ");
		}
		System.out.println("Exit Main(). ");
	}

	public static void printAverage(int totalSum, int totalNumber) throws Exception {
		
			int average = computeAverage(totalSum, totalNumber);
			System.out.println("Average= " + totalSum + " / " + totalNumber + " = " + average);
		
		System.out.println("Exit printAverage(). ");
	}

	public static int computeAverage(int sum, int num) throws Exception {
		System.out.println("Computing Average. ");
		if (num == 0)
			throw new ArithmeticException("Integer Division By zero");
		return sum / num;
	}
}


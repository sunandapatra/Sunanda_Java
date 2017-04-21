package Exception;

public class AverageException {

	public static void main(String[] args) {
		printAverage(100, 0);
		System.out.println("Exit Main(). ");
	}
	public static void printAverage(int totalSum, int totalNumber){
		try{
			int average = computeAverage(totalSum, totalNumber);
			System.out.println("Average= "+totalSum+" / "+totalNumber+" = "+average);
		}catch(ArithmeticException ae){
			ae.printStackTrace();
			System.out.println("Exception Handled IN " + "printAverage().");
		}
		System.out.println("Exit printAverage(). ");
	}
	public static int computeAverage(int sum , int num){
		System.out.println("Computing Average. ");
		return sum/num;
	}
}

package CoreJavaPractice.Inheritance;

public class Calculator {

	public void addition(int a, int b) {
		int c = a + b;
		System.out.println("Addition is: " + c);
	}

	public static void main(String[] args) {
		SubCalculator inhCalc = new SubCalculator();
		int x = 20;
		int y = 2;
		inhCalc.addition(x, y);
		inhCalc.substaction(x, y);
		((MultiCalculaor)inhCalc).multiplication(x, y);
		((DivCalculator)inhCalc).division(x, y);
	}
}

class SubCalculator extends Calculator{
	
	public void substaction(int a, int b) {
		int c = a - b;
		System.out.println("Substraction is: " + c);
	}
}

class MultiCalculaor extends SubCalculator {
	
	public void multiplication(int a, int b) {
		int c = a * b;
		System.out.println("Multiplication is: " + c);
	}
}
class DivCalculator extends SubCalculator{
	public void division(int a, int b) {
		int c = a / b;
		System.out.println("Division is: " + c);
	}
}

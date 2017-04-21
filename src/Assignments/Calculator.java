//Write a program Calculator
//	give 3 arguments then do the calculation depending on the 3 argument.
//	Eg: Calculator 34 56 +
//	Eg: Calcualtor 33 88 -
package Assignments;

public class Calculator {
//--------------in one function---------------------------
//	public void calculation(int a, int b) {
//		int result;
//		result = a + b;
//		System.out.println("Sum is: " + result);
//		result = a - b;
//		System.out.println("Substraction is: " + result);
//	}
//
//	public static void main(String[] args) {
//		Calculator calc = new Calculator();
//		calc.calculation(5, 3);
//
//	}
//-----------------------------------------------------------
//---------------by two separate functions---------------------
public void add(int a, int b) {
	int result;
	result = a + b;
	System.out.println("Sum is: " + result);
	
}
public void sub(int a, int b) {
	int result;
	result = a - b;
	System.out.println("Substraction is: " + result);
}

public static void main(String[] args) {
	Calculator calc = new Calculator();
	calc.add(34, 56);
	calc.sub(33, 88);
}
//------------------------------------------------------
}

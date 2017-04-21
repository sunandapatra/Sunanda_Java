package CoreJavaPractice.Operators;

public class ArithmaticOperator {

	public static void main(String[] args) {
		
		int age = 20;
		age = age+1;
		age++;
		//System.out.println(age);
		
		double distance = 43;
		//System.out.println(distance++); // post increment
		System.out.println(distance--); // pre increment
		System.out.println(distance);
		
		
		age = 200;
		//age = age + 2; // age++
		age *=2; // age++
		System.out.println(age);
		
		
		
	}
}
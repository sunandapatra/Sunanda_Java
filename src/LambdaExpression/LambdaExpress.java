package LambdaExpression;

public class LambdaExpress {

	public static void main(String[] args) {
		LambdaExpress lambdaexpress = new LambdaExpress();
		MathOperation addition = ( a,  b) -> a+b;
		MathOperation substraction = (a , b) -> a-b;
		MathOperation multiplication = (a , b) -> a*b;
		MathOperation division = (a , b) -> a/b;
		System.out.println("The addition is: "+lambdaexpress.operation(5, 3, addition));
		System.out.println("The substraction is: "+lambdaexpress.operation(5, 3, substraction));
		System.out.println("The Multiplication is: "+lambdaexpress.operation(5, 3, multiplication));
		System.out.println("The Division is: "+lambdaexpress.operation(5, 3, division));

		GreetingsMessage greetingsMessage = s -> {
			System.out.println("Hello "+s);
		};
		GreetingsMessage greetingsMessage1 = s -> {
			System.out.println("Hello "+s);
		};
		greetingsMessage.massage("Sunanda");
		greetingsMessage1.massage("Aakarsh");
	}

	interface MathOperation {
		int operate(int a, int b);
	}

	interface GreetingsMessage {
		void massage(String S);
	}
	public int operation(int a, int b, MathOperation mathoperation ){
	return mathoperation.operate(a,b);
}
	}


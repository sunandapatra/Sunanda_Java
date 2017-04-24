package LambdaExpression;

public class LambdaClient {

	public static void main(String[] args) {
		/*Evaluate evalA = new EvalAddition();
		System.out.println(evalA.evaluate(2, 4));*/
		
		Evaluate evalS = new EvalSubstration();
		System.out.println(evalS.evaluate(2, 4));
		
		Evaluate evalD = (a , b) -> a/b;
		System.out.println(evalD.evaluate(8, 4));
		
		Evaluate evalA = (a , b) -> a+b;
		System.out.println(evalA.evaluate(2, 4));	
		
	}
}

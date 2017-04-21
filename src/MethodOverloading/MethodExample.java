package MethodOverloading;

public class MethodExample {

	public static void main(String[] args) {
		MethodExample me = new MethodExample();
		
		int a = 20;
		int b = 5;
		
		
		int result1 = me.runMath(a,b);
		
		int c = 40;
		int d = 5;
		
		int result2 = me.runMath(c,d);
		
		int e = 40;
		int f = 5;
		
		int result3 = me.runMath(e,f);
		
		int finalResult = result1 + result2 + result3;
		
		System.out.println("Final Result = "+ finalResult);
		
		
	}
	
	public int runMath(int x , int y) {
		int result = x + y + (x/y) + 5;
		return result;
	}
	
	
	

}

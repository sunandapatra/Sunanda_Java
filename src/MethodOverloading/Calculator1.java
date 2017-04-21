package MethodOverloading;

public class Calculator1 {
	public static void main(String[] args) {
		Calculator1 calc = new Calculator1();
		int twoN = calc.add(3,4);
		int threeN = calc.add(3, 4, 5);
		int fourN = calc.add(3,4,5,6,7,8,9);
		
		//System.out.println(fourN);
	}
	/*
	 * This is method overloading
	 */
	public int add(int a , int b){
		return a + b;
	}
	
	public int add(int x , int y, int z){
		return (x + y + z);
	}
	
	public int add(int ...array){
		
		int result = 0;
		for(int arr : array){
			//result += a;
			System.out.println(arr);
		}
		return result;
	}
	

}

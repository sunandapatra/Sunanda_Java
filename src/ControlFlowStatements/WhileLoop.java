package ControlFlowStatements;

public class WhileLoop {

	public static void main(String[] args) {
		boolean b = false;
		int i = 1;
		do{
			i++;
			b = !b;
		}while (b);
		System.out.println("The value of i is: "+i);
	}

}

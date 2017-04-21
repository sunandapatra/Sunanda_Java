package ControlFlowStatements;

public class ForLoop {

	public static void main(String[] args) {
		int i = 0;
		int j;
		for (j = 0; j < 10; ++j) {
			i++;
		}
		System.out.println("The Value of i: " + i + " The Value of j: " + j);

		// for( ; i<10; i++);
		// for(i=0; ; i++) break;
		// for (i=0;i<10 ; ) i++;
		// for( ; ; );

		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 2; b++) {
				if (a == b) {
					continue;
				}
				//System.out.println("a is: " + a + " b is: " + b);
			}
		}
		int x =0;
		int y = 0;
		for(int z =0 ; z<=3; z++){
			x++;
			if(z == 2)break;
			y++;
		}
		System.out.println("x is : "+x+" y is : "+y);

	}

}

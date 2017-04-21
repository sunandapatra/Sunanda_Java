package ControlFlowStatements;

/*
 * Try to print all the even number between 0 - 20
 */
public class ContinueBreak {

	public static void main(String[] args) {
		int number[] = { 12, 8, 5, 200, 0, 4, 77, 54 };
		
		int age = 89;
		int Age = 56;
		boolean isClassPresentToday;
		
		/*
		 * boolean is200Present = false;
		 * 
		 * for(int i= 0 ; i < number.length ; i++){ int val = number[i];
		 * 
		 * if(val == 200) { is200Present = true; break; }
		 * 
		 * }
		 * 
		 * 
		 * if(is200Present){ System.out.println("I was a luck day"); }else {
		 * System.out.println("No Luck Today"); }
		 */

		for (int i = 1; i < 20; i++) {
			if (i % 2 == 0)
				System.out.println(i+" is even number.");
				continue;
			
			
		}
		// we can use continue statement wen we dnt want to use some number.
		//here 5 will not be printed.
//		for (int i = 0; i < 10; i++) {
//			if(i == 5) continue;
//			System.out.println("Value is "+i);
//		}

	}

}
//for(int i =0 ; i < ages.length ; i++) {
//			System.out.println("ages["+i+"]"  +  "  " + ages[i]);
//		}
//Add up all the ages...			
//While in the for loop if the value of age is more than 50 then print.. YOU R OLD
package Assignments;

public class Ages {

	public static void main(String[] args) {

		int laxman = 25;
		int nithya = 21;
		int meena = 20;

		int agesBag[] = new int[10];
		agesBag[0] = laxman;
		agesBag[1] = 21;
		agesBag[2] = meena;
		agesBag[5] = 50;
		
		for (int i = 0; i < agesBag.length; i++) {
			if (agesBag[i] != 0) {
				System.out.println("agesBag["+i+"]"  +  "  " + agesBag[i]);
				if (agesBag[i] >= 50){
					System.out.println("agesBag["+i+"]"+" You Are Old");
				}
			}
		}
	}
}
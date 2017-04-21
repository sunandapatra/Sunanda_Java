package Array;

public class ArrayExample {
	// java ArrayExample 3 4 5 6 7
	public static void main(String[] args) {

		int laxman = 25;
		int nithya = 21;
		int meena = 20;

		// int agesBag[] = {laxman,21,meena};

		int agesBag[] = new int[10];
		agesBag[0] = laxman;
		agesBag[1] = 21;
		agesBag[2] = meena;
		agesBag[5] = 50;
		// System.out.println(agesBag.length);

		// System.out.println(agesBag[2]);
		/*
		 * for(int age : agesBag){ System.out.println(age); }
		 */
		int i = 0;
		for (i = 0; i < agesBag.length; i++) {
			if (agesBag[i] != 0) {
				System.out.println(agesBag[i]);
			}
		}
	}
}

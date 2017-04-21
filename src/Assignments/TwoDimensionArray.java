package Assignments;

public class TwoDimensionArray {

	// java ArrayExample 3 4 5 6 7
	public static void main(String[] args) {

		int laxmanAge = 25;
		int laxmanHeight = 6;
		//int laxmanDetail[] = new int[2];
		int laxmanDetail[] = { laxmanAge, laxmanHeight };
		
		int nithyaAge = 21;
		int nithyaHeight = 5;
		int nithyaDetail[] = { nithyaAge, nithyaHeight };

		int meenaDetail[] = { 20, 4 };

		// int PersonDetails[][] = new int[3][2];

		int PersonDetails[][] = { laxmanDetail, nithyaDetail, meenaDetail, { 50, 6 } };
		// System.out.println("PersonDetails: "+PersonDetails.length);
		//laxmanDetail = PersonDetails[0];
		// System.out.println("laxmanDetail[0]: "+laxmanDetail[0]);
		//System.out.println("laxmanDetail[1]: "+laxmanDetail[1]);

		for (int i = 0; i < PersonDetails.length; i++) {
			
			for (int j = 0; j < PersonDetails[i].length; j++) {
				
				System.out.print(PersonDetails[i][j] + " ");
				//System.out.println(" ");
			}	
			System.out.println("");
		}
	}
}
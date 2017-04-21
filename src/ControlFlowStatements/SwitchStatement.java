package ControlFlowStatements;

public class SwitchStatement {

	public static void main(String[] args) {
		for (int i = 0; i < 6; i++){
			//System.out.println(i);
			
			
			switch (i) {
			case 0:
				System.out.println("i is zero.");
				break;
			case 1:
				System.out.println("i is One.");
				break;
			case 2:
				System.out.println("i is Two.");
				break;
			case 3:
				System.out.println("i is Three.");
				break;
			case 4:
				System.out.println("i is Four.");
				break;
			default:
				System.out.println("I do not know");
				break;
			}
		}
	}

}

/*class SampleSwitch {
	public static void main(String args[]) {
		for (int i = 0; i < 6; i++)
			switch (i) {
			case 0:
				System.out.println("i is zero.");
				break;
			case 1:
				System.out.println("i is one.");
				break;
			case 2:
				System.out.println("i is two.");
				break;
			case 3:
				System.out.println("i is three.");
				break;
			default:
				System.out.println("i is greater than 3.");
			}
	}
}
class MissingBreak {
	public static void main(String args[]) {
		for (int i = 0; i < 12; i++)
			switch (i) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("i is less than 5");
				break;
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.println("i is less than 10");
				break;
			default:
				System.out.println("i is 10 or more");
			}
	}
}
class Switch {
	public static void main(String args[]) {
		int month = 4;
		String season;
		switch (month) {
		case 12:
		case 1:
		case 2:
			season = "Winter";
			break;
		case 3:
		case 4:
		case 5:
			season = "Spring";
			break;
		case 6:
		case 7:
		case 8:
			season = "Summer";
			break;
		case 9:
		case 10:
		case 11:
			season = "Autumn";
			break;
		default:
			season = "Bogus Month";
		}
		System.out.println("April is in the " + season + ".");
	}
}*/

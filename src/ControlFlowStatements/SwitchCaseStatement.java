package ControlFlowStatements;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			//System.out.println(i);
			switch (i) {
			case 0:
				System.out.println(" I is Zero");
				break;
			case 1:
				System.out.println(" I is One");
				break;
			case 2:
				System.out.println(" I is Two");
				break;
			case 3:
				System.out.println(" I is Three");
				break;
			case 4:
				System.out.println(" I is Four");
				break;

			default:
				System.out.println(" I donot know");
				break;
			}
		}

	}

}

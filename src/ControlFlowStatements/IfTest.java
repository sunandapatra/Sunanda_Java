package ControlFlowStatements;

public class IfTest {

	void test(int x){
		switch (x) {
		case 1:
		case 2:
		case 0:
		default:
		case 4:
		}
	}
	public static void main(String[] args) {
		IfTest iftest = new IfTest();
		iftest.test(3);
		if (true)
			if (false)
				System.out.println("a");
			else
				System.out.println("b");
		
	}

}

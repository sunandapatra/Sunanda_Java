package Assignments;

public class MyClass {

	String fName;
	String lName;
	int id;

	public static void main(String[] args) {
		MyClass e1 = new MyClass();
		e1.fName = "David";
		e1.lName = "Schwimmer";
		e1.id = 1001;
		MyClass e2 = e1;
		System.out.println(e1.fName);
		try {
			System.out.println(e2.lName);
		} catch (Exception e) {
			System.out.println("Do not understand this");
		}
	}
}
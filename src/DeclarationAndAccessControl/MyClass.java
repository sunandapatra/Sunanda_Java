package DeclarationAndAccessControl;

public class MyClass {

	int var;

	MyClass(int param) {
		var = param;
		System.out.println("Hii");
	}

	public MyClass() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		MyClass a, b;
		a = new MyClass();
		b = new MyClass(5);

	}

}

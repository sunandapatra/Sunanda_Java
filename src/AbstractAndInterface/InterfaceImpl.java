package AbstractAndInterface;

public class InterfaceImpl implements MyInterface, MyInterface1 {

	public static void main(String[] args) {
		System.out.println("MyInterface String: " + MyInterface.s);
		InterfaceImpl inimp = new InterfaceImpl();
		inimp.sayHello();
		inimp.addNumber(8, 2);
		inimp.sub(7, 2);
		inimp.div(6, 3);
		inimp.details("Sunanda");
		MyInterface myinter = new Engineering_Student(006, "ddd", "ttt", "gggg", 666, "ggggg");
		myinter.sayHello();
	}

	public void sayHello() {
		System.out.println("Hello");
	}

	public int addNumber(int a, int b) {
		int c;
		c = a + b;
		System.out.println("C: " + c);
		return c;
	}

	public void details(String Name) {
		System.out.println("Name: " + Name);
	}

	public int sub(int a, int b) {
		int c;
		c = a - b;
		System.out.println("C: " + c);
		return c;
	}

	public int div(int a, int b) {
		int c;
		c = a / b;
		System.out.println("C: " + c);
		return c;
	}
}

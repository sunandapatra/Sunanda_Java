package Constructor;

public class OverloadingConstructor {
	int id;
	String name;
	int age;

	OverloadingConstructor(int i, String n) {
		id = i;
		name = n;
	}

	OverloadingConstructor(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String args[]) {
		OverloadingConstructor s1 = new OverloadingConstructor(111, "Karan");
		OverloadingConstructor s2 = new OverloadingConstructor(222, "Aryan", 25);
		s1.display();
		s2.display();
	}
}

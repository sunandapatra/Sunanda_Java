package MethodOverloading;

public class Calculator {

	public static void main(String[] args) {
			Calculator m1 = new Calculator();
			int a, b;
			a = 5;
			b = 2;
			int c = m1.add(a, b);
				System.out.println("Added value:" + c);

			int d = m1.sub(a, b);
				System.out.println("substracted value:" + d);

			int f = m1.add(1, 5, 6, 9);
				System.out.println("Added values in array: " + f);

			String str = m1.add(a , b , c);
				System.out.println(str);

		}

	String add(int x, int y, int z) {
		String s = "Added succeessfully";
		return s;
	}

	public static int add(int... x) {
		int result = 0;
		for (int a : x)
			result += a;
		return result;
	}

	public static int add(int x, int y) {
		return x + y;
	}

	int sub(int x, int y) {
		int z = x - y;
		return z;
	}

}
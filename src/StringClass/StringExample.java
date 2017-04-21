package StringClass;

public class StringExample {

	public static void main(String[] args) {

		/*
		 * String name1 = "Hello";
		 * 
		 * //name = name + " You";
		 * 
		 * String name2WithNew = new String("Hello");
		 * 
		 * 
		 * 
		 * String name3 = "Hello";
		 * 
		 * 
		 * 
		 * System.out.println(name1 == name2WithNew);
		 * 
		 * System.out.println(name1.equals(name2WithNew));
		 */

		/*
		 * String message = "Hello";
		 * 
		 * message = message.concat(" How");
		 * 
		 * message.concat(" Are");
		 * 
		 * message.concat(" You");
		 * 
		 * 
		 * 
		 * System.out.println(message);
		 */

		/*
		 * String value = "";
		 * 
		 * for(int i = 0 ; i < 10; i ++){
		 * 
		 * value += i;
		 * 
		 * 
		 * 
		 * }
		 * 
		 * System.out.println(value);
		 */

		StringBuffer sb = new StringBuffer();

		StringBuilder sbuilder = new StringBuilder();

		for (int i = 0; i < 10; i++) {

			sbuilder.append(i);

		}

		System.out.println(sb.toString());

		Integer intVal = new Integer(90);

		printValue(intVal.toString());

	}

	public static void printValue(String val) {

		System.out.println(val);

	}

}
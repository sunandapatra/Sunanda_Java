package StringClass;

public class StringFunctions {

	public static void main(String[] x) {

		String t = "  Sachin  ";
		System.out.println(t);// Sachin
		System.out.println(t.trim());// Sachin

		String s = "Sachin";
		System.out.println(s.startsWith("Sa"));// true
		System.out.println(s.endsWith("n"));// true
		System.out.println(s.charAt(0));// S
		System.out.println(s.charAt(3));// h
		System.out.println(s.length());// 6

		String s1 = new String("Sachin");
		String s2 = s1.intern();
		// String s2 = s1;
		System.out.println(s2);// Sachin

		int a = 10;
		String s3 = String.valueOf(a);
		System.out.println(s3 + 10);

		String s4 = "Java is a programming language. Java is a platform. Java is an Island.";
		String replaceString = s4.replace("Java", "Kava");// replaces all
															// occurrences of
															// "Java" to "Kava"
		System.out.println(replaceString);

		StringBuffer sb = new StringBuffer("Hello ");

		sb.append("Java");// now original string is changed
		System.out.println(sb);// prints Hello Java

		sb.insert(1, "Java");// now original string is changed
		System.out.println(sb);// prints HJavaello
	}
}
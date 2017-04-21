package StringClass;

public class StringComparison {
	
	public static void main(String args[]) {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "Saurav";
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true
		System.out.println(s1.equals(s4));// false

		String s5 = "Sachin";
		String s6 = "SACHIN";
		System.out.println(s5.equals(s6));// false
		System.out.println(s5.equalsIgnoreCase(s6));// true
		
		String s7 = "Sachin";
		String s8 = "Sachin";
		String s9= new String("Sachin");
		System.out.println(s7 == s8);// true (because both refer to same
										// instance)
		System.out.println(s7 == s9);// false(because s3 refers to instance
										// created in nonpool)
		
		String x = "Sachin";
		String y = "Sachin";
		String z = "Ratan";
		System.out.println(x.compareTo(y));// 0
		System.out.println(x.compareTo(z));// 1(because s1>s3)
		System.out.println(z.compareTo(x));// -1(because s3 < s1 )
	}
}
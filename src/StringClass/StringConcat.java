package StringClass;

public class StringConcat {
	public static void main(String args[]) {
		
		String s = "Sachin" + " Tendulkar";
		System.out.println(s);// Sachin Tendulkar
		
		String s1 = 50 + 30 + "Sachin" + 40 + 40;
		System.out.println(s1);// 80Sachin4040
		
		String s2 = "Sachin ";
		String s3 = "Tendulkar";
		String s4 = s2.concat(s3);
		System.out.println(s4);// Sachin Tendulkar
	}
}

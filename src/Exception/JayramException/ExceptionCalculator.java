package Exception.JayramException;

public class ExceptionCalculator {
	
	public static int add(String a , String b) throws Exception {
		int i = Integer.parseInt(a);
		
		int j = Integer.parseInt(b);
		
		System.out.println("Value of I = "+ i);

		System.out.println("Value of J = "+ j);
		
		int addition = i + j;
		
		return addition;
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 * @throws RuntimeException
	 */
	public static int substract(String a , String b, String c) throws RuntimeException {
		int i;
		try{
			i = Integer.parseInt(a);
		}catch(Exception exp){
			//exp.printStackTrace();
			i = 10;
		}
		int j = 0;
		try{
			j = Integer.parseInt(b);
		}catch(Exception exp){
			//exp.printStackTrace();
			j = 5;
		}
		
		int k = 0;
		try{
			k = Integer.parseInt(c);
		}catch(Exception exp){
			//exp.printStackTrace();
			k = 1;
		}
		
		System.out.println("Value of I = "+ i);

		System.out.println("Value of J = "+ j);
		
		int addition = i - j - k;
		
		return addition;
	}
	
	public static int calcTax(int ssn) throws Exception{
		if(ssn <=0){
			throw new Exception("Please Enter a proper SSN Value");
		}
		
		return 3456;
	}
}

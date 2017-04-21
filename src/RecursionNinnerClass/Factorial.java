package RecursionNinnerClass;

public class Factorial {

		final static int MONTH_JAN = 1;
		final static int MONTH_FEB = 2;
		
		public static void main(String[] args) {
			Factorial1 f = new Factorial1();
			System.out.println(f.fact(3));
			
			Factorial r = new Factorial();
			
			
		}
	}

	class Factorial1{
		int fact(int val){
			int result;
			if(val ==1) 
				return 1;
			
			result = val * fact(val-1);
			
			return result;
		}
	}
package RecursionNinnerClass;

public class InnerClass {
	
	InnerClassOne ico = new InnerClassOne();
	String val = ico.Inner_function();
	
	public void justMethod(){
		InnerClassOne one = new InnerClassOne();
		one.Inner_function();
	}
	
	class InnerClassOne {
		String Inner_function() {
			System.out.println("This is Inner_function of InnerClassOne");
			return "something";
		}
	}

}

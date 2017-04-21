package Classes;

import MethodOverloading.Calculator;

public class LifeCycle {
	int i;
	static int j;
	
	static {
		System.out.println("Hello");
	}
	
	{
		System.out.println("Hello One");
	}
	
	public LifeCycle(){
		System.out.println("In Constructor");
	}
	
	public static void main(String[] args) {
		
		LifeCycle lc = new LifeCycle();
		callMe();
		
		int val = Calculator.add(3, 4);
		
		/*for(int i = 0; i < 50000; i++){
			new Employee(i);
		}*/
		
		/*Employee emp1 = new Employee(300);
		
		Employee emp2 = new Employee(300);
		Employee emp3 = new Employee(300);
		
		System.out.println("Hello I am good");
		
		Employee emp4 = new Employee(400);
		
		System.out.println("Hello I am good");
		System.out.println("Hello I am good");
		
		System.out.println(emp1.getNumber());
		
		*/
		
	
		}
	// Can you invoke a non static method from a static method.
	public static void callMe(){
		//i=0;
		j=0;
		//callme1();
	}
	public  void callMe1(){
		callMe();
		i=0;
		j=0;
	}
	
	// Try to create static and not static method..and try to invoke it from each other
}
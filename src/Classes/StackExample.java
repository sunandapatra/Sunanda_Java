package Classes;

import Assignments.Employee;

public class StackExample {
	public static void main(String ...arg){
		StackExample se = new StackExample();
		se.callMe1();
	}
	
	public void callMe1(){
		Employee emp = new Employee(300);
		
		callMe2();
		System.out.println("Call Me One");
	}
	
	public void callMe2(){
		Employee emp = new Employee(300);
		callMe3();
		System.out.println("Call Me Two");
	}
	
	public void callMe3(){
		Employee emp = new Employee(300);
		System.out.println("Call Me Three");
	}
	
}

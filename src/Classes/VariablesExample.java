package Classes;

import Assignments.Employee;

public class VariablesExample {

	public static void main(String[] args) {
		int index = 0;
		Employee emp = new Employee(200,"Test",'F',20);
		Employee emp2 = new Employee(200,"Test2",'F',20);
		new Employee(200,"Test2",'F',20);
//		for(int i = 0; i< 5; i++){
//			new Employee(200,"Test2",'F',20);
//		}
		System.out.println(emp.count);
		emp2.count = 500;
		emp2.setFirstName("TEsting3");

		System.out.println(emp2.count +" "+ emp2.getFirstName());
		System.out.println(emp.count);
	}
}
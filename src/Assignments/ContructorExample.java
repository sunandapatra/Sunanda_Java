package Assignments;

public class ContructorExample {

	public static void main(String[] arg){
		Employee emp = new Employee(100); // While
		
		//emp.setNumber(100);
		emp.setFirstName("Nithya"); // After
		emp.setGender('F');
		emp.setAge(-20);
		
		System.out.println("Hello " + emp.getAge());
		
		System.out.println(emp.getFirstName());
		
		System.out.println(emp.getNumber());
		
		
		
	}

}

package MethodOverloading;

import Assignments.Employee;

public class Client {

	public static void main(String[] args) {
		Employee emp = new Employee(45,"Test",'F', 17);
		
		Client client = new Client();
		
		int test = 45;
		client.changeMe(test);
		System.out.println(test);
		
		
/*		System.out.println(emp.getFirstName());
		client.changeEmployee(emp);
		System.out.println(emp.getFirstName());
*/		
		/*String name = "Test";
		System.out.println(name);
		
		client.changeName(name);
		
		System.out.println(name);*/
		
		boolean isEli = client.isEligibleForParty(emp);
		//boolean isEli = emp.isEligibleForParty();
		System.out.println("Employee eligibility is "+ isEli);
		
		
	}
	
	
	public boolean isEligibleForParty(Employee emp) {
		boolean isEligible = false;
		
		if(emp.getGender() == 'F' && emp.getAge() <= 17){
			isEligible = false;
		}else{
			isEligible = true;
		}
		
		return isEligible;
	}
	
	public void changeMe(int i){
		i = 90;
	}

	public void changeEmployee(Employee emp){
		emp.setFirstName("Tulsi");
	}
	
	public void changeName(String name){
		name = "Tulsi";
	}
	
	

}
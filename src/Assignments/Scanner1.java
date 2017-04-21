package Assignments;

import java.util.Scanner;

public class Scanner1 {
	
	public static void main(String[] args) {
		Employee employees[] = new Employee[3];
		Scanner scan = new Scanner(System.in);
		// Write a while loop to get the employee information one by one
		// and 
		int index = 0;
		Employee emp = null;
		while(true){

			System.out.println("Enter Employee ID for Employee Number "+(index+1)+"\n");
			int id = scan.nextInt();

			System.out.println("Enter Employee Name\n");
			String name = scan.next();
			
			emp = new Employee(id,name);
			employees[index++] = emp;
			
			if(index ==  3) {
				Assignment assign = new Assignment();
				assign.printEmployeeDetails(employees);
				break;
			}
		}
	}

	/**
	 * Use enhanced forloop to iterate the employee array
	 * @param employees
	 */
	public void printEmployeeDetails(Employee [] employees){
		for(Employee emp : employees){
			if(emp != null){
				System.out.println("Employee Name ="+ emp.getFirstName());
				System.out.println("Employee ID ="+ emp.getNumber());	
			}
		}
		/*for(int i = 0; i < employees.length; i++){
			Employee emp = employees[i];
			System.out.println("Employee Name ="+ emp.getFirstName());
			System.out.println("Employee Name ="+ emp.getNumber());
		}*/
		
		
	}
}

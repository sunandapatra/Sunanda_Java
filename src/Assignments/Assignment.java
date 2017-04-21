package Assignments;
import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		
		
		Employee emp = new Employee(222,"TestOne");
		Employee emp2 = new Employee(223,"TestTwo");
		
		Employee employees[] = new Employee[2];
		employees[0] = emp;
		employees[1] = emp2;
		
		Assignment assign = new Assignment();
		assign.printEmployeeDetails(employees);
		
		// Write a while loop to get the employee information one by one
		// and 
		while(true){
			
		}
		
		
		
	}

	/**
	 * Use enhanced forloop to iterate the employee array
	 * @param employees
	 */
	public void printEmployeeDetails(Employee [] employees){
		for(int i = 0; i < employees.length; i++){
			Employee emp = employees[i];
			System.out.println("Employee Name ="+ emp.getFirstName());
			System.out.println("Employee Name ="+ emp.getNumber());
		}
	}
}




//import java.util.Scanner;
/*Scanner scan = new Scanner(System.in);

System.out.println("Enter Age\n");
int age = scan.nextInt();

System.out.println("Enter Name\n");
String name = scan.next();
	
System.out.println("Do you want another employee to be added \n");
String toExit = scan.next();

System.out.println("Name is "+ name);
System.out.println("Age is "+ age);*/

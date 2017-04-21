package Assignments;

import java.util.Scanner;

public class CompanyOne {

	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);
         Employee employees [] = new Employee [3];
         int num;
         String name;
         char gend;
         int ageX;
         
         int i = 0;
         
         while(i < employees.length){
             
             System.out.println("Enter the Employee ID:   "+ "\t"+"Enter the Employee Name:   " + "\t"+ "Enter the Employee Gender:   " +"\t"+ "Enter the Employee Age: ");
             
             num = input.nextInt();
             name = input.next();
             //gend = input.next();
             ageX = input.nextInt();
             
             
             employees[i] = new Employee();
             employees[i].setNumber(num);
             employees[i].setFirstName(name);
            // employees[i].setGender(gend);
             employees[i].setAge(ageX);
             
             System.out.println("Do you want to add more employees?");
             String toExit = input.next();
             i++;
             
         }
                     
      
         for (i = 0; i < employees.length; i++){
             
             System.out.println("Employee ID: " + employees[i].getNumber() + "\n" + "Employee Name: " + employees[i].getFirstName() + "\n" + "Employee Gender: " + employees[i].getGender() + "\n" + "Employee Age: "+ employees[i].getAge());
             System.out.println("-------------------------------");
             
                          }
         
	}
}
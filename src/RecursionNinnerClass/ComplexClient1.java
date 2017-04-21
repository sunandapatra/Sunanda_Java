package RecursionNinnerClass;

import java.util.Scanner;

public class ComplexClient1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("How many name you want to enter:");
		int num = scan.nextInt();
		int i = 0;
		ComplexClient1 complexclient = new ComplexClient1();
		Person persons[] = new Person[num];
		Address address[] = new Address[num];
		while (i < num) {
			System.out.println("Enter First Name");
			String firstName = scan.next();

			System.out.println("Enter Last Name");
			String lastname = scan.next();
			
			System.out.println("Enter Address One");
			String addressone = scan.next();
			
			System.out.println("Enter Address Two");
			String addresstwo = scan.next();
			
			System.out.println("Enter Zip");
			int zip = scan.nextInt();

			//persons[i] = new Person();
			//address[i] = new Address();
			persons[i].setFirstName(firstName);
			persons[i].setLastName(lastname);
			address[i].setAddressOne(addressone);
			address[i].setAddressTwo(addresstwo);
			address[i].setZip(zip);
			System.out.println(address[i].getAddressOne());
			i++;
		}
		complexclient.printUserDetails(persons,address);
	}

	void printUserDetails(Person[] person,Address[] address) {
			for (int i = 0; i < person.length; i++) {
				System.out.println("Person First Name "+(i+1)+"th =" + person[i].getFirstName());
				System.out.println("Person Last Name "+(i+1)+"th =" + person[i].getLastName());
				System.out.println("Address One "+(i+1)+"th =" + address[i].getAddressOne());
				System.out.println("Address Two "+(i+1)+"th =" + address[i].getAddressTwo());
				System.out.println("Zip "+(i+1)+"th =" + address[i].getZip());
				System.out.println("-------------------------------");
		}
	}
}
//Scanners.java
package Assignments;
import java.util.*;

public class Scanners {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("How many name you want to enter:");
		int num = scan.nextInt();
		int i = 0;
		Scanners scanner = new Scanners();
		User users[] = new User[num];
		while (i < num) {
			System.out.println("Enter Age");
			int age = scan.nextInt();

			System.out.println("Enter Name");
			String name = scan.next();

			users[i] = new User();
			users[i].setAge(age);
			users[i].setName(name);

			i++;
		}
		scanner.printUserDetails(users);
	}

	void printUserDetails(User[] user) {
			for (int i = 0; i < user.length; i++) {
				System.out.println("User Age Of "+(i+1)+"th =" + user[i].getAge());
				System.out.println("User Name Of "+(i+1)+"th =" + user[i].getName());
				System.out.println("-------------------------------");
		}
	}
}
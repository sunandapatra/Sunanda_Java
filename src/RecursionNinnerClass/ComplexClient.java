package RecursionNinnerClass;

import java.util.Scanner;

public class ComplexClient {

	public static void main(String[] args) {
		Person raj = new Person("Raj","Malhotra",'M');
		
		Person.Address address = raj.new Address("Bunglow Road","Rich Area",12089);
		raj.setAddress(address);

		Person mala = new Person("Mala","Malhotra",'F');
		mala.setType("Wife"); 
		Person richa = new Person("Richa","Malhotra",'F');
		richa.setType("daughter"); 
		Person raghav = new Person("Raghav","Malhotra",'M');
		raghav.setType("son");  
		Person persons[] = {mala,richa,raghav};
		raj.setPersons(persons);
	
		Person.Pet pet = raj.new Pet("Wiggy","Dog");
		raj.setPet(pet);
		
		System.out.println("First Name: "+raj.getFirstName()+ "\n"+ "Last Name: "+raj.getLastName()+ " \n"+ "Gender: "+raj.getGender()+ "\n"+ "Address: "+address.getAddressOne()+ "\n         "+address.getAddressTwo()+"\n         "+address.getZip());
		System.out.println("---------------------------------------");
		System.out.println("Member1: "+persons);
		raj.isRich();
	}
}
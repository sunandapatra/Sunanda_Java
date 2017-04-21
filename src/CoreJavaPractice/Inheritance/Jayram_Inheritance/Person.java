package CoreJavaPractice.Inheritance.Jayram_Inheritance;

public abstract class Person extends Object {

	private String firstName;

	private String lastName;

	private char gender;

	private String type = "";

	public Person(String fname, String lname, char gender) {

		this.firstName = fname;

		this.lastName = lname;

		this.gender = gender;

	}

	public String getFirstName() {

		return firstName;

	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;

	}

	public String getLastName() {

		return lastName;

	}

	public void setLastName(String lastName) {

		this.lastName = lastName;

	}

	public char getGender() {

		return gender;

	}

	public void setGender(char gender) {

		this.gender = gender;

	}

	public String getType() {

		return type;

	}

	public void setType(String type) {

		this.type = type;

	}

	public boolean isRich() {

		if (this.type.equals("Good")) {

			return true;

		}

		return false;

	}

	public void printMessage() {

		System.out.println(this.getFirstName() + " is a Person***********");

	}

	public void companyName() {

		System.out.println("I am an Employee Of JayramCompany");

	}

	public abstract void desireToLead();

}
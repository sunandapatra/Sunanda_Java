package RecursionNinnerClass;

public class Person {

	String firstName;
	String lastName;
	Address address;
	char gender;
	String type;
	Person persons[];
	Pet pet;

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	public Person[] getPersons() {
		return persons;
	}

	public void setPersons(Person[] persons) {
		this.persons = persons;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	public boolean isRich() {
		if (this.address.addressTwo.equals("Rich Area") && pet != null) {
			return true;
		}
		return false;
	}

	class Pet {

		public String name;
		public String type;

		public Pet(String name,String type) {
			this.name = name;
			this.type = type;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}
	class Address {
		String addressOne;
		String addressTwo;
		int zip;

		public Address(String addressOne,String addressTwo,int zip) {
		this.addressOne = addressOne;
		this.addressTwo = addressTwo;
		this.zip = zip;
	}

		public String getAddressOne() {
			return addressOne;
		}

		public void setAddressOne(String addressOne) {
			this.addressOne = addressOne;
		}

		public String getAddressTwo() {
			return addressTwo;
		}

		public void setAddressTwo(String addressTwo) {
			this.addressTwo = addressTwo;
		}

		public int getZip() {
			return zip;
		}

		public void setZip(int zip) {
			this.zip = zip;
		}

	}
}
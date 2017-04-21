package CoreJavaPractice.Inheritance;

public class Person {

	public String fname;
	public String lname;
	public char gender;
	private int age;
	private String location;

	public Person(){}
	public Person(String fname, String lname, char gender, int age, String location) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.age = age;
		this.location = location;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
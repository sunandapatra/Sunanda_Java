package CoreJavaPractice.Inheritance;

public class BadPerson extends Person {

	String bdreput;

	public BadPerson(String fname, String lname, char gender, int age, String location, String bdreput) {
		super(fname, lname, gender, age, location);
		this.bdreput = bdreput;
	}

	public String getBdreput() {
		return bdreput;
	}

	public void setBdreput(String bdreput) {
		this.bdreput = bdreput;
	}
}
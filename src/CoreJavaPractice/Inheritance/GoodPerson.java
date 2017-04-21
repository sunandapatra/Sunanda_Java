package CoreJavaPractice.Inheritance;

public class GoodPerson extends Person {

	String gdreput;

	public GoodPerson(String fname, String lname, char gender, int age, String location, String gdreput) {
		super(fname, lname, gender, age, location);
		this.gdreput = gdreput;
	}

	public String getGdreput() {
		return gdreput;
	}

	public void setGdreput(String gdreput) {
		this.gdreput = gdreput;
	}
}

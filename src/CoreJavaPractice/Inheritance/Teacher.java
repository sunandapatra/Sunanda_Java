package CoreJavaPractice.Inheritance;

public class Teacher extends GoodPerson {

	String school;
	String subject;

	public Teacher(String fname, String lname, char gender, int age, String location, String gdreput, String school,
			String subject) {
		super(fname, lname, gender, age, location, gdreput);
		this.school = school;
		this.subject = subject;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void printPersonDetails() {
		System.out.println("Name: " + super.getFname() + super.getLname() + "\n" + "Gender: " + super.getGender() + "\n"
				+ "Location: " + super.getLocation() + "\n" + "Reputation: " + super.getGdreput() + "\n" + "School: "
				+ (getSchool() + "\n" + "Subject: " + getSubject() + "\n"
						+ "-----------------------------------------------"));
	}
}
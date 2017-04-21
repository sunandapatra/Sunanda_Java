package CoreJavaPractice.Inheritance;

public class Student extends GoodPerson {

	String university;
	String major;

	public Student(String fname, String lname, char gender, int age, String location, String gdreput, String university,
			String major) {
		super(fname, lname, gender, age, location, gdreput);
		this.university = university;
		this.major = major;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void printPersonDetails() {
		System.out.println("Name: " + super.getFname() + super.getLname() + "\n" + "Gender: " + super.getGender() + "\n"
				+ "Location: " + super.getLocation() + "\n" + "Reputation: " + super.getGdreput() + "\n"
				+ "University: " + (getUniversity() + "\n" + "Degree: " + getMajor() + "\n"
						+ "-----------------------------------------------"));
	}
}
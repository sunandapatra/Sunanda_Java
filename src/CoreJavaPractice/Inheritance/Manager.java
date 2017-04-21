package CoreJavaPractice.Inheritance;

public class Manager extends BadPerson {
	String company;
	String education;

	public Manager(String fname, String lname, char gender, int age, String location, String bdreput, String company,
			String education) {
		super(fname, lname, gender, age, location, bdreput);
		this.company = company;
		this.education = education;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public void printPersonDetails() {
		System.out.println("Name: " + super.getFname() + super.getLname() + "\n" + "Gender: " + super.getGender() + "\n"
				+ "Location: " + super.getLocation() + "\n" + "Reputation: " + super.getBdreput() + "\n" + "Company: "
				+ (getCompany() + "\n" + "Education: " + getEducation() + "\n"
						+ "-----------------------------------------------"));
	}
}

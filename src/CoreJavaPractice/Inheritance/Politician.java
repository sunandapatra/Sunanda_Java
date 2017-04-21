package CoreJavaPractice.Inheritance;

public class Politician extends BadPerson {

	String position;
	String party;

	public Politician(String fname, String lname, char gender, int age, String location, String bdreput,
			String position, String party) {
		super(fname, lname, gender, age, location, bdreput);
		this.position = position;
		this.party = party;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public void printPersonDetails() {
		System.out.println("Name: " + super.getFname() + super.getLname() + "\n" + "Gender: " + super.getGender() + "\n"
				+ "Location: " + super.getLocation() + "\n" + "Reputation: " + super.getBdreput() + "\n" + "Position: "
				+ (getPosition() + "\n" + "Party: " + getParty() + "\n"
						+ "-----------------------------------------------"));
	}
}

package CoreJavaPractice.Inheritance.Jayram_Inheritance;

public class BadPerson extends Person {

	private String temperLevel = "HIGH";

	public BadPerson(String fname, String lname, char gender) {

		super(fname, lname, gender);

	}

	public String getTemperLevel() {

		return temperLevel;

	}

	public void setTemperLevel(String temperLevel) {

		this.temperLevel = temperLevel;

	}

	@Override

	public void printMessage() {

		System.out.println(
				super.getFirstName() + " is a Bad Person*********** with temper Leve " + this.getTemperLevel());

	}

	@Override

	public void desireToLead() {

		System.out.println("My desire is to lead everyone in trouble...");

	}

}
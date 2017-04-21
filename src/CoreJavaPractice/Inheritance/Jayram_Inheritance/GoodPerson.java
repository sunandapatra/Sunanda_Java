package CoreJavaPractice.Inheritance.Jayram_Inheritance;

public class GoodPerson extends Person implements Swimming, Speech {

	private String kindMessage = "Namestay";

	public GoodPerson(String fname, String lname, char gender) {

		super(fname, lname, gender);

	}

	public String getKindMessage() {

		return kindMessage;

	}

	public void setKindMessage(String kindMessage) {

		this.kindMessage = kindMessage;

	}

	@Override

	public void desireToLead() {

		System.out.println("My desire is to lead everyone to successs..in life....");

	}

	@Override

	public void swim() {

		System.out.println("I know how to smim a long distance...");

	}

	@Override

	public void speechDelivery() {

		System.out.println("A good person give a very good speech...");

	}

}
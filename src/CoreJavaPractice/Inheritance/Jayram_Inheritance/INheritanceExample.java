package CoreJavaPractice.Inheritance.Jayram_Inheritance;

public class INheritanceExample {

	public static void main(String[] args) {

		Swimming goodSwim = new GoodPerson("GF", "GL", 'F');

		Swimming dogSwim = new ServiceDog();

		printSwimingDetails(goodSwim);

		printSwimingDetails(dogSwim);

	}

	public static void printSwimingDetails(Swimming swim) {

		swim.swim();
		((GoodPerson)swim).desireToLead();
		// assignment...cast it to a particular typ...

	}

}
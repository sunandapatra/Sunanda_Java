package CoreJavaPractice.Inheritance.Jayram_Inheritance;

public class PolymorphismExample {

	public static void main(String[] args) {

		Person bad = new BadPerson("BF", "BL", 'F');

		printDetails(bad);

		// BadPerson bp1 = (BadPerson)bad;

		// System.out.println("Temper Level is :
		// "+((BadPerson)bad).getTemperLevel());;

		Person good = new GoodPerson("GF", "GL", 'F');

		printDetails(good);

		// System.out.println(goodPerson1.getKindMessage());

		// Person p = new GoodPerson("GF","GL",'F');

	}

	public static void printDetails(Person person) {

		/*
		 * if(person.isRich()){
		 * 
		 * System.out.println(person.getFirstName() +" is a rich guy");
		 * 
		 * 
		 * 
		 * }else {
		 * 
		 * System.out.println(person.getFirstName() +" is a poor guy");
		 * 
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 * person.printMessage();
		 * 
		 * 
		 * 
		 * if(person instanceof BadPerson){
		 * 
		 * System.out.println("Temper Level is : "+((BadPerson)person).
		 * getTemperLevel());
		 * 
		 * }else if(person instanceof GoodPerson){
		 * 
		 * System.out.println("Temper Level is : "+((GoodPerson)person).
		 * getKindMessage());
		 * 
		 * }
		 */

		person.desireToLead();

	}

	/*
	 * public static void printStatus(GoodPerson gp){
	 * 
	 * if(gp.isRich()){
	 * 
	 * System.out.println(gp.getFirstName() +" is a rich guy");
	 * 
	 * }else {
	 * 
	 * System.out.println(gp.getFirstName() +" is a poor guy");
	 * 
	 * }
	 * 
	 * }
	 * 
	 * 
	 * 
	 * public static void printStatus(BadPerson bp){
	 * 
	 * if(bp.isRich()){
	 * 
	 * System.out.println(bp.getFirstName() +" is a rich guy");
	 * 
	 * }else {
	 * 
	 * System.out.println(bp.getFirstName() +" is a poor guy");
	 * 
	 * }
	 * 
	 * }
	 */

}
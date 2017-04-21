package CoreJavaPractice.Inheritance.Jayram_Inheritance;

public class ClientProgramme {



	public static void main(String[] args) {

		

		//Person person = new Person("AF","AL",'F');

		BadPerson badPerson = new BadPerson("BF","BL",'F');

		GoodPerson goodPerson = new GoodPerson("GF","GL",'F');

		

		//System.out.println(person.isRich());

		System.out.println(badPerson.isRich());

		System.out.println(goodPerson.isRich());

		

		//System.out.println(person.toString());

		

		

		

		BadPerson badPerson1 = new BadPerson("BF","BL",'F');

		GoodPerson goodPerson1 = new GoodPerson("GF", "GL", 'F');

		System.out.println(badPerson1.isRich());

	}

}
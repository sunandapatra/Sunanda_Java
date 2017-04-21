package CoreJavaPractice.Inheritance.Jayram_Inheritance;

public class ServiceDog implements Swimming {

	public String name;

	@Override

	public void swim() {

		System.out.println("I am a service dog..with a good swiming capability");

	}

}

//public abstract class ServiceDog extends Person{
//
//	public ServiceDog(String fname, String lname, char gender) {
//		super(fname, lname, gender);
//		// TODO Auto-generated constructor stub
//	}
//	
//}
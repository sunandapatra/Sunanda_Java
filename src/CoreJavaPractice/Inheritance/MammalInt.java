package CoreJavaPractice.Inheritance;

public class MammalInt implements InterferenceAnimal1 {

	   public void eat() {
	      System.out.println("Mammal eats");
	   }

	   public void travel() {
	      System.out.println("Mammal travels");
	   } 

	   public int noOfLegs() {
	      return 0;
	   }
	   public void sleep(){
		   System.out.println("Mammal Sleeps");
	   }
	   public static void main(String args[]) {
	      MammalInt m = new MammalInt();
	      m.eat();
	      m.travel();
	      m.sleep();
	   }
	} 
interface InterferenceAnimal1 {
	public void sleep();
}


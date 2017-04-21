// Using Super Constructor with argument
package CoreJavaPractice.Inheritance;

class Superclass {
	   int age;

	   Superclass(int age) {
	      this.age = age; 		 
	   }

	   public void getAge() {
	      System.out.println("The value of the variable named age in super class is: " +age);
	   }
	}

	public class SubClass extends Superclass {
		SubClass(int age) {
	      super(age);
	   }

	   public static void main(String argd[]) {
		   SubClass s = new SubClass(24);
	      s.getAge();
	   }
	}
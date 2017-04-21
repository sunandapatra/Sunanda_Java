package CoreJavaPractice.Inheritance;

class Super_Inheritance {
	   int num = 20;

	   // display method of superclass
	   public void display() {
	      System.out.println("This is the display method of superclass");
	   }
	}

	public class Sub_Inheritance extends Super_Inheritance {
	   int num = 10;

	   // display method of sub class
	   public void display() {
	      System.out.println("This is the display method of subclass");
	   }

	   public void my_method() {
	      // Instantiating subclass
	      Sub_Inheritance sub = new Sub_Inheritance();

	      // Invoking the display() method of sub class
	      sub.display();

	      // Invoking the display() method of superclass
	      super.display();

	      // printing the value of variable num of subclass
	      System.out.println("value of the variable named num in sub class:"+ sub.num);

	      // printing the value of variable num of superclass
	      System.out.println("value of the variable named num in super class:"+ super.num);
	   }

	   public static void main(String args[]) {
	      Sub_Inheritance obj = new Sub_Inheritance();
	      obj.my_method();
	   }
	}
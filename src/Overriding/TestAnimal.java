package Overriding;

class Animal {
	   public void move() {
	      System.out.println("Animals can move");
	   }
	}

	class Dog extends Animal {
	   public void move() {
		 // super.move();
	      System.out.println("Dogs can walk and run");
	   }
	   public void bark() {
		   super.move();
	      System.out.println("Dogs can bark");
	   }
	}

	public class TestAnimal {

	   public static void main(String args[]) {
	     // Animal a = new Animal();   // Animal reference and object
	      Animal b = new Dog();   // Animal reference but Dog object
	      Dog c = new Dog(); 
	      //a.move();   // runs the method in Animal class
	      b.move();   // runs the method in Dog class
	      c.bark();
  }
}
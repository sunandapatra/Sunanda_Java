package CoreJavaPractice.Inheritance;

class Animal1 {
}
class Mammal extends Animal1 {
}
class Reptile extends Animal1 {
}
public class Dog1 extends Mammal {

   public static void main(String args[]) {
      Animal1 a = new Animal1();
      Mammal m = new Mammal();
      Dog1 d = new Dog1();

      System.out.println(m instanceof Animal1);
      System.out.println(d instanceof Mammal);
      System.out.println(d instanceof Animal1);
   }
}

package CoreJavaPractice.DataType;

public class DataTypeExample1 {
	   public void pupAge() {
	      int age = 0;
	      age = age + 7;
	      System.out.println("Puppy age is : " + age);
	   }

	   public static void main(String args[]) {
		   DataTypeExample1 dataType = new DataTypeExample1();
		   dataType.pupAge();
	   }
	}
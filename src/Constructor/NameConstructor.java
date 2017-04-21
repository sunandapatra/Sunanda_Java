package Constructor;

public class NameConstructor {

	 NameConstructor(){
		 System.out.println("Constructor");
	 }
	 void NameConstructor(){
		 System.out.println(" Method");
	 }
	 
	
	public static void main(String[] args) {
		new NameConstructor().NameConstructor();
	}

}

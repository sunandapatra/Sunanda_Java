package DeclarationAndAccessControl;

abstract class Light1{
	//Fields
	 int noOfWatts;
	 boolean indicator;
	 String location;
	 
	//instance Methods
	public void switchOn(){
		indicator = true;
	}
	public void switchOff(){
		indicator = false;
	}
	public boolean isOn(){
		return indicator;
	}
	//Abstarct Instance Method
	abstract public double kwhPrice();
}
class TubeLight extends Light1{
	// Fields
	int TubeLength;
	//implementation of inherited abstract method
	public double kwhPrice(){
		return 2.75;
	}
}
public class AbstractLight {

	public static void main(String[] args) {
		TubeLight tubelight = new TubeLight();
		Light1 light1;
		//Light1 light1 = new Light1();//compilation error bcoz we cant create object of abstract class
		light1 = tubelight;
		System.out.println("tubelight.kwhPrice(): "+tubelight.kwhPrice());
		System.out.println("light1.kwhPrice(): "+light1.kwhPrice());
	}

}

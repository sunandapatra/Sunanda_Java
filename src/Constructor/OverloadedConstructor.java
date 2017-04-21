package Constructor;

public class OverloadedConstructor {
	
	int noOfWatts;
	boolean indicator;
	String location;
	
	//Default Constructor
	OverloadedConstructor(){
		noOfWatts = 50;
		indicator = true;
		location = "X";
		System.out.println("No of WattsDefault: " + noOfWatts);
		System.out.println("No of WattsDefault: " + indicator);
		System.out.println("No of WattsDefault: " + location);
	}
	//Non-default Constructor
	OverloadedConstructor(int noOfWatts, boolean indicator, String location){
		this.noOfWatts = noOfWatts; // Assignment to Field
		this.indicator = indicator; // Assignment to Parameter
		this.location = location;
		System.out.println("No of Watts: " + noOfWatts);
		System.out.println("No of Watts: " + indicator);
		System.out.println("No of Watts: " + location);
	}
	public static void main(String[] args) {
		OverloadedConstructor light = new OverloadedConstructor(100, true, "GreenHouse");
		OverloadedConstructor light1 = new OverloadedConstructor();

	}

}

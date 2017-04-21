package DeclarationAndAccessControl;

public class Light {
	int noOfWatts;
	boolean indicator;
	String location;

	public Light(int noOfWatts, boolean indicator, String site) {
		String location;
		this.noOfWatts = noOfWatts; // Assignment to Field
		indicator = indicator; // Assignment to Parameter
		location = site;
		this.superFluous();
		superFluous();
	}

	public void superFluous() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		Light light = new Light(100, true, "Loft");
		System.out.println("No of Watts: " + light.noOfWatts);
		System.out.println("No of Watts: " + light.indicator);
		System.out.println("No of Watts: " + light.location);
	}

}

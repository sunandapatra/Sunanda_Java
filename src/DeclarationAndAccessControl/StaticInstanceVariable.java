package DeclarationAndAccessControl;

public class StaticInstanceVariable {

		private int noOfWatts;
		private boolean indicator;
		private String location;
		
		public void switchOn(){
			indicator = true;
		}
		public void switchOff(){
			indicator = false;
		}
		public boolean isOn(){
			return indicator;
		}
		public static StaticInstanceVariable duplicateLight(StaticInstanceVariable oldLight){
			StaticInstanceVariable newLight = new StaticInstanceVariable();
			newLight.noOfWatts = oldLight.noOfWatts;
			System.out.println("newLight.noOfWatts: "+newLight.noOfWatts+" oldLight.noOfWatts"+oldLight.noOfWatts);
			newLight.indicator = oldLight.indicator;
			System.out.println("newLight.indicator: "+newLight.indicator+" oldLight.indicator"+oldLight.indicator);
			newLight.location = oldLight.location;
			System.out.println("newLight.location: "+newLight.location+" oldLight.location"+oldLight.location);
			return newLight;
		}
	public static void main(String[] args) {
		StaticInstanceVariable oldLight = new StaticInstanceVariable();
		duplicateLight(oldLight);
	}

}

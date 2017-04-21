package Exception;

public class SpeedAssretions {

	public static void main(String[] args) {
		SpeedAssretions objRef = new SpeedAssretions();
		double Speed = objRef.calcSpeed(-12.0, 3.0);
		//double Speed = objRef.calcSpeed(12.0, -3.0);
		//double Speed = objRef.calcSpeed(12.0, 2.0);
		//double Speed = objRef.calcSpeed(12.0, 0.0);
		System.out.println("Speed (km/h): "+Speed);
	}
	private double calcSpeed(double distance, double time){
		assert distance >= 0.0;
		assert time > 0.0 : "Time is not a Positive Value: "+time;
		double speed = distance / time;
		assert speed >= 0.0;
		return speed;
	}

}

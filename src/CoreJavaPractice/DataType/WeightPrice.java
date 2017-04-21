package CoreJavaPractice.DataType;

public class WeightPrice {

	public static void main(String[] args) {
		int Weight = 50, thePrice = 0;
		if (Weight < 50)
			thePrice = 1000;
		if (Weight > 50)
			thePrice = 5000;
		if (Weight >= 50)
			thePrice = Weight * 5;
		System.out.println("The Price is: " + thePrice);
	}

}

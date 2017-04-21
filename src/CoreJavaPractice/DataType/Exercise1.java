package CoreJavaPractice.DataType;

public class Exercise1 {
	int counter;

	public static void main(String[] args) {
		Exercise1 exercise = new Exercise1();
		exercise.go();
	}

	public void go() {
		int sum = 0;
		int i = 0;
		while (i < 100) {
			if (i == 0)
				sum = 100;
			sum = sum + i;
			i++;
		}
		System.out.println("Sum is: " + sum);
	}
}

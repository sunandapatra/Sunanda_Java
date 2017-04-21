package Array;

public class Test implements Runnable {
	public static void main(String[] args) throws Exception {
		Thread t = new Thread(new Test());
		t.start();
		System.out.print("Started");
		t.join();
		System.out.print("Complete");
	}

	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.print(i);
		}
	}
}
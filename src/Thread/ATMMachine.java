package Thread;

public class ATMMachine implements Runnable {
	@Override
	public  void run() {
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("I am using the ATM "+ Thread.currentThread().getName());
		}
		
	}
}
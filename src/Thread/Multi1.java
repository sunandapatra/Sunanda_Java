package Thread;

public class Multi1 implements Runnable {
	public void run(){
		System.out.println("Thread is Running");
	}

	public static void main(String[] args) {
		Multi1 multi1 = new Multi1();
		Thread thread = new Thread(multi1);
		thread.start();

	}

}


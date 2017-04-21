package Thread;

public class ThreadSleep extends Thread{
	int total;
	public void run(){
		for(int i = 0; i<5 ; i++ ){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			total+= i;
			System.out.println("The Total is: "+total+ "[ Current Thread Name Is: "+Thread.currentThread().getName()+ "]");
		}
	}

	public static void main(String[] args) {
		ThreadSleep sleep = new ThreadSleep();
		ThreadSleep sleep1 = new ThreadSleep();
		ThreadSleep sleep2 = new ThreadSleep();
		System.out.println("Name of the Thread1: "+sleep.getName());
		System.out.println("Name of the Thread2: "+sleep1.getName());
		System.out.println("Name of the Thread3: "+sleep2.getName());
		System.out.println("Id of the Thread1: "+sleep.getId());
		sleep.start();
		try {
			sleep.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sleep1.start();
		sleep2.start();
		sleep.setName("Sunanda");
		sleep1.setName("Biswajit");
		sleep2.setName("Aakarsh");
		sleep1.setPriority(MAX_PRIORITY);
		sleep.setPriority(MIN_PRIORITY);
		sleep2.setPriority(NORM_PRIORITY);
		System.out.println("After change the name of the Thread1: "+sleep.getName());
		
	}

}

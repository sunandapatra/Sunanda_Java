
package Thread;
public class MouseRunner {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		
		
		Mouse mikey = new Mouse("Mikey");
		Thread mikeyThread = new Thread(mikey,"Mikey");
		mikeyThread.setPriority(10);
		mikeyThread.start();
		
		Mouse dona = new Mouse("Dona");
		Thread donaThread = new Thread(dona,"Dona");
		donaThread.start();
		
//		Thread thread = new Thread(mikey);
//		thread.start();
		
		
		
	}

}

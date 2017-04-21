
package Thread;
public class Mouse extends Animal implements Runnable {
	private String mouseName;
	public Mouse(String mouseName){
		this.mouseName = mouseName;
		//super.setName("["+mouseName+" Thread]");
	}
	
	public void startRunning() {
		for(int i = 0; i < 5; i++) {
			System.out.println(this.mouseName + " Ran "+ i +" Meter "+ Thread.currentThread().getName());
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
		System.out.println("Huu.. "+this.mouseName+" am done Running");
	}
	
	@Override
	public void run() {
		startRunning();
	}
}
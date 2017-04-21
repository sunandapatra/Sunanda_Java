
package Thread;
public class InterThreadCommunication {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		
		new Reader(calc).start();
		new Reader(calc).start();
		new Reader(calc).start();
		
		//System.out.println(calc.total);
		calc.start();
	}

}

class Reader extends Thread {
	Calculator calc;
	public Reader(Calculator calc){
		this.calc = calc;
	}
	
	public void run() {
		synchronized(calc){
			try {
				System.out.println("Reader is waiting for calcualtor to finish");
				calc.wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("Final Calculation is "+ calc.total);
	}
}

class Calculator extends Thread {
	int total;
	
	public void run() {
		synchronized(this){
			for(int i=0 ; i < 5 ; i++){
				System.out.println("Calcualtor is running..."+ i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				total += i;
			}
			
			notify();
		}
		
	}
}
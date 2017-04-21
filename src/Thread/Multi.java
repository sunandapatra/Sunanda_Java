package Thread;

public class Multi extends Thread{

	public void run(){
		System.out.println("Thread is Running");
	}
	public static void main(String[] args){
		Multi multi = new  Multi();
		multi.start();
	}
}

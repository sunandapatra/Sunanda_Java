package Thread;
public class ATMUsers {

	public static void main(String[] args) {
		
		ATMMachine atmMachine = new ATMMachine();
		
		Thread nithya = new Thread(atmMachine,"Nithya");
		nithya.start();
		
		Thread bala = new Thread(atmMachine,"Bala");
		bala.start();
		
		Thread laxman = new Thread(atmMachine,"Laxman");
		laxman.start();
	}

}

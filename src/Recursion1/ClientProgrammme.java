package Recursion1;

public class ClientProgrammme {

	public static void main(String ...args) {
		Country india = new Country("India");
		
		Country.Boundary boundry = india.new Boundary();
		boundry.printDetails();
		
		india.setPopulation(9999999);
		State orissa = new State("Orissa");
		State ap = new State("AP");
		State kerela = new State("Kerela");
		
		State states [] = {orissa,ap,kerela};
		india.setStates(states);
		ClientProgrammme.callMe();
		
	}

	public static void callMe(){
		System.out.println("");
	}
	
	
}

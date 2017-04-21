package Assignments;

public class Employee {
	private int number;
	private String firstName;
	private char gender;
	private int age;
	
	public static int count;// class level variable
	
	public Employee(int number){
		this.number = number;
		count++;
		//System.out.println("Employee Created with ID "+ number);
	}
	
	public int getCount(){return this.count;}
	/**
	 * Constructor Overloading
	 * @param number
	 * @param firstName
	*/
	public Employee(){
		
	}
	/**
	 * Constructor Overloading
	 * @param number
	 * @param firstName
	 */
	public Employee(int number, String firstName){
		//this.number = number;
		this(number); // it call the one argument constructor
		this.firstName = firstName;
	}
	
	
	public Employee(int number, String firstName, char gender, int age){
		this(number,firstName);
		this.gender = gender;
		this.age = age;
	}
	
	
	public void setAge(int age){
		if(age < 15){
			this.age = 15;
		}else{
			this.age = age;	
		}
	}
	
	public int getAge(){
		return age;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	/*public static void main(String[] arg){
		Employee nithya = new Employee();
		nithya.number = 100;
		//nithya.firstName ="Nithya";
		nithya.gender = 'F';
		//nithya.age = 18;
		
		Employee sunanda = new Employee(); // instance / object
		sunanda.number = 100;
		sunanda.firstName ="Sunanda";
		sunanda.gender = 'F';
		sunanda.age = 19;
		
		//System.out.println(nithya.firstName);
		//System.out.println(sunanda.firstName);
		
		Employee sunanda2 = sunanda;
		
		//System.out.println(sunanda2.firstName);
		
		System.out.println(nithya.age);
		System.out.println(nithya.firstName);
		
		
		Employee jayram = null;
		
	}*/
	public boolean isEligibleForParty() {
		boolean isEligible = false;
		boolean isEligibleOldEmp = false;
		
		if(this.getGender() == 'F' && age <= 17){
			isEligible = false;
		}else{
			isEligible = true;
		}
		
		if(isEligible && this.number > 300)
		{
			isEligibleOldEmp = false;
		}else{
			isEligibleOldEmp = true;
		}
		
		return isEligibleOldEmp;
	}
}
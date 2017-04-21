package AbstractAndInterface;

public class MBA_Student extends Student implements MyInterface{

	String Category;

	public MBA_Student(int Stud_RollNo, String FName, String LName, String Address, int Phone,String Category) {
		super(Stud_RollNo, FName, LName, Address, Phone);
		this.Category = Category;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}
	public void PrintDetails(){
		System.out.println("RollNo: "+super.getStud_RollNo()+"\n"+ "First Name: "
				+super.getFName()+" "+ super.getLName()+"\n"+"Address: "
				+super.getAddress()+"\n"+"Phone No: "+super.getPhone()+"\n"+"Category: "+this.getCategory());
		System.out.println("----------------------------------------");
	}
	public void registration(){
		System.out.println("Registration");
	}
	public void campus(){
		System.out.println("MBA Campus");
	}
	public void sayHello() {
		System.out.println("Hii");
	}

	public int addNumber(int a, int b) {
		int c;
		c = a + b;
		System.out.println("C: " + c);
		return c;
	}

	public void details(String Name) {
		System.out.println("Name: " + Name);
	}
	
}

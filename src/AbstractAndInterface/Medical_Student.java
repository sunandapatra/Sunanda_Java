package AbstractAndInterface;

public class Medical_Student extends Student {

	String Category;
	
	public Medical_Student(int Stud_RollNo, String FName, String LName, String Address, int Phone,String Category) {
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
		System.out.println("Medical Campus");
	}
	
}

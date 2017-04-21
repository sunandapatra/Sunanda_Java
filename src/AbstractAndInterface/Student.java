package AbstractAndInterface;

public abstract class Student {
	
	int Stud_RollNo;
	String FName;
	String LName;
	String Address;
	int Phone;
	
	Student(int Stud_RollNo,String FName,String LName,String Address,int Phone){
		this.Stud_RollNo = Stud_RollNo;
		this.FName = FName;
		this.LName = LName;
		this.Address = Address;
		this.Phone = Phone;
	}
	public int getStud_RollNo() {
		return Stud_RollNo;
	}
	public void setStud_RollNo(int stud_RollNo) {
		Stud_RollNo = stud_RollNo;
	}
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	
	public void PrintDetails(){
		System.out.println("RollNo: "+this.getStud_RollNo()+"\n"+ "First Name: "
				+this.getFName()+" "+ this.getLName()+"\n"+"Address: "
				+this.getAddress()+"\n"+"Phone No: "+this.getPhone());
		System.out.println("----------------------------------------");
	}
	public void welcomeMessage(){
		System.out.println("Hello How Are You!!!");
	}
	public abstract void campus();
	public final void message(){
		System.out.println("My Name is Sunanda");
	}
}

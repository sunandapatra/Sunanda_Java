package AbstractAndInterface;

public class MCA_Student extends Engineering_Student {

	String Status;

	public MCA_Student(int Stud_RollNo, String FName, String LName, String Address, int Phone, String Category,
			String Status) {
		super(Stud_RollNo, FName, LName, Address, Phone, Category);
		this.Status = Status;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	public void PrintDetails(){
		System.out.println("RollNo: "+super.getStud_RollNo()+"\n"+ "First Name: "
				+super.getFName()+" "+ super.getLName()+"\n"+"Address: "
				+super.getAddress()+"\n"+"Phone No: "+super.getPhone()
				+"\n"+"Category: "+super.getCategory()+"\n"
				+"Status: "+this.getStatus());
		System.out.println("----------------------------------------");
	}
	public void byeMessage(){
		System.out.println("Bye!! See You Soon!!!");
	}
}
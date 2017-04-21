package AbstractAndInterface;

public class ClientProgramme {

	public static void main(String[] args) {
		Student std = new Student(001,"Sunanda","Patra","USA",999) {
			
			@Override
			public void campus() {
				// TODO Auto-generated method stub
				
			}
		};
		Engineering_Student std1 = new Engineering_Student(002,"Biswajit","Sahu","USA",444,"Engineering");
		MCA_Student std2 = new MCA_Student(003, "Aakarsh", "Sahu", "USA", 999, "MCA","Good");
		std.PrintDetails();
		std1.PrintDetails();
		std2.PrintDetails();
	}

}

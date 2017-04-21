package Classes;

public class TestingInnerClass {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		System.out.println(oc.name);
		
		OuterClass.InnerClassOne ico = oc.new InnerClassOne();
		ico.callInnerOne();
	}

}


class OuterClass {
	String name = "Raj";
	class InnerClassOne{
		public void callInnerOne(){
			System.out.println("This is from Inner class "+name);
		}
	}
	
	static class InnerClassTwo{
		public void callInnerOne(){
//			System.out.println(name);
		}
	}
}

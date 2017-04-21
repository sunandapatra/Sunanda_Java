package Exception;

public class MyClass1 {

	public static void main(String[] args) throws Exception{
		try {
			f();
		} catch (InterruptedException e) {
			System.out.println("1");
			throw new RuntimeException();
		} catch (RuntimeException e) {
			System.out.println("2");
			return;
		} catch (Exception e) {
			System.out.println("3");
		} finally {
			System.out.println("4");
		}
		System.out.println("5");
	}
	static void f() throws InterruptedException{
		throw new InterruptedException("Time For Lunch");
	}

}

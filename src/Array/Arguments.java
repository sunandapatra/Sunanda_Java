package Array;

public class Arguments {

	public static void main(String[] args) {
		String[] numbers = {"One","Two","Three","Four"};
		if(args.length == 0){
			System.out.println("No Arguments");
		}
		else{
			System.out.println(numbers[args.length]+" Arguments");
		}
		System.out.println("aaaaa  "+java.util.Arrays.toString(numbers));
	}

}

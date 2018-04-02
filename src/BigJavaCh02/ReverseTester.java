package BigJavaCh02;

public class ReverseTester {

	public static void main(String[] args) {
		String a = "desserts";
		StringBuilder a1 = new StringBuilder(a);
		System.out.println(a);
		System.out.println(a1);
		a1.reverse();
		System.out.println(a1);
		String a2 = a1.toString();
		System.out.println(a2);

	}

}

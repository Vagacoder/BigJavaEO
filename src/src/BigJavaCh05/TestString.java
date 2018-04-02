package BigJavaCh05;

public class TestString {

	public static void main(String[] args) {
		String s1 = "abacAda";
		
		String s2 = s1.replaceAll(s1.substring(0,1), "");
		
		System.out.println(s1);
		System.out.println(s2);
	}

}

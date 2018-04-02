package BigJavaCh06;

public class CharLoopTester {

	public static void main(String[] args) {
		String str = "";
		for (char c = 'A'; c < 'Z'; c++)
			{
				str = str + c;
			}
		System.out.println(str);

		String str1 = "";
		char ch = 'A';
		ch += 2;
		str1 = str1 + ch;
		System.out.println(str1);

	}

}

package BigJavaCh05;

public class TestSwitch {

	public static void main(String[] args) {

		int number = 5;
		String digitName;
		
		switch(number) {
		
		case 1: digitName = "one"; break;
		case 2: digitName = "two"; break;
		case 3: digitName = "three"; break;
		case 4: digitName = "four"; break;
		case 5: digitName = "five"; break;
		case 6: digitName = "six"; break;
		case 7: digitName = "seven"; break;
		default: digitName = "None"; break;
		}
		
		System.out.println(digitName);

	}

}

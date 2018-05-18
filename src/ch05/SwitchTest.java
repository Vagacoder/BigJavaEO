package ch05;

public class SwitchTest {
	
	public static void main(String[] args) {
		
		int digit = 7;
		String digitName;
		switch (digit)
		{
		case 1: digitName = "one"; break;
		case 2: digitName = "two"; break;
		case 3: digitName = "three"; break;
		case 4: digitName = "four"; break;
		case 5: digitName = "five"; break;
		case 6: digitName = "six"; break;
		case 7: digitName = "seven";
		case 8: digitName = "eight"; break;
		case 9: digitName = "nine"; break;
		default: digitName = ""; break;
		}
		
		System.out.println(digitName);
	}
	
}

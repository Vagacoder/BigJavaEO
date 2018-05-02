package BigJavaCh06;

public class P6_1 {
	
	public static void main(String[] args) {
		
		String ccNumber = "4012888888881881";
		int sum1 = 0;
		int sum2 =0;
		int sum3 = 0;
		
		for (int i=0; i<ccNumber.length(); i++)
		{
			int digit = Character.getNumericValue(ccNumber.charAt(i));
			sum1 += digit;
			
		}
		
		for (int i=ccNumber.length()-2; i>=0; i-=2)
		{
			int digit = Character.getNumericValue(ccNumber.charAt(i));
			sum2 += digit;
			
			if (digit > 4) {sum3 ++;}
		}
		
		int sum = sum1 + sum2 + sum3;
		if (sum%10 == 0) {System.out.println("Validate!");}
		else {System.out.println("Not validate!");}
		
	}
	
}

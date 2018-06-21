package ch13;

// R13.6 and R13.7
public class R13_6 {

	public static void main(String[] args) {
		System.out.println(powerN(2, 40));
		System.out.println(powerN2(2,40));

	}

	public static long powerN(int base, int pow) {
		if (pow <= 1) {
			return base;
		} else {
			return base * powerN(base, pow-1); 
		}
		
	}
	
	public static long powerN2(int base, int pow) {
		if (pow <= 1) {
			return base;
		} else if (pow %2 ==0) {
			long powResult = powerN2(base, pow/2);
			return   powResult * powResult;
		}
		
		else {
			return base * powerN2(base, pow-1); 
		}
	}
}

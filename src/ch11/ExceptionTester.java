package ch11;

public class ExceptionTester {

	// try / catch block execution order: once exception is thrown within try block,
	// program jumps to catch block to handle exception. Once exception is handled,
	// program jumps to the one instruction immediate after try/catch block,

	public static void main(String[] args) {
		try {
			System.out.println("step1");
			int a = 10;
			int b = a / 0; // throw a Runtime exception
			System.out.println("step2"); // this instruction will not be executed

		}

		catch (RuntimeException e) {
			System.out.println("handle exception 1"); // handle exception
		}

		System.out.println("step3"); // after catch block handle exception, this will be executed

		try {
			System.out.println("step4");
			throw new RuntimeException();
		} 
		
		catch (RuntimeException e) {
			System.out.println("handle exception 2"); // handle exception
		}

		System.out.println("step5");
	}

}

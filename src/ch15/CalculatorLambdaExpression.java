package ch15;

public class CalculatorLambdaExpression {

	interface IntegerMath {
		int operation(int a, int b);
	}

	public int operateBinary(int a, int b, IntegerMath op) {
		return op.operation(a, b);
	}

	public static void main(String... args) {

		CalculatorLambdaExpression myApp = new CalculatorLambdaExpression();

		// using lambda expression define objects
		IntegerMath addition = (a, b) -> a + b;
		IntegerMath subtraction = (a, b) -> a - b;
		System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, addition));
		System.out.println("20 - 10 = " + myApp.operateBinary(20, 10, subtraction));

		// using lambda expression in method, more concise than above.
		System.out.println("2 x 3 = " + myApp.operateBinary(2, 3, (a, b) -> a * b));
		System.out.println("16 / 8 = " + myApp.operateBinary(16, 8, (a, b) -> a / b));
	}
}
package ch13;

public class ExpressionTokenizerTester {

    public static void main(String[] args) {

	ExpressionTokenizer et = new ExpressionTokenizer("3+4*)5");
	String token = et.peekToken();
	// System.out.println(token);
	token = et.nextToken();
	System.out.println(token);
	token = et.nextToken();
	System.out.println(token);
	token = et.nextToken();
	System.out.println(token);
	token = et.nextToken();
	System.out.println(token);
	token = et.nextToken();
	System.out.println(token);
	token = et.nextToken();
	System.out.println(token);

    }

}

package ch15;

import java.util.*;

/*
 * This program evaluates arithmetic expressions, using two stacks.
   
? Alogrithm:
? If you read a number, Push it on the number stack.
? Else if you read a (, Push it on the operator stack.
? Else if you read an operator op :
?	While the top of the stack has a higher precedence than op
?		Evaluate the top.
?	Push op on the oper­ator stack.
? Else if you read a ) :
?	While the top of the stack is not a (
?		Evaluate the top.
?	Pop the (.
? Else if there is no more input:
?	While the operator stack is not empty
?		Evaluate the top.


 * E15.18 
 * Add a % (remainder) operator to the expression calculator of Section 15.6.3.

 * E15.19 
 * Add a ^ (power) operator to the expression calculator of Section 15.6.3. 
 * For example, 2 ^ 3 evaluates to 8. As in mathematics, your power operator 
 * should be evaluated from the right. That is, 2 ^ 3 ^ 2 is 2 ^ (3 ^ 2), not 
 * (2 ^ 3) ^ 2. (That’s more useful because you could get the latter as 
 * 2 ^ (3 × 2).)

 */
public class ExpressionCalculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an expression: ");
		String expression = in.nextLine().replace(" ", "");

		Stack<Integer> numstack = new Stack<>();
		Stack<Character> opstack = new Stack<>();

		int pos = 0;
		// * deal with input
		while (pos < expression.length()) {
			char ch = expression.charAt(pos);
			pos++;

			// * is operator
			if (isOperator(ch)) {
				// * operator stack is empty
				if (opstack.size() == 0) {
					opstack.push(ch);
				} 
				// * if not, check top operator
				else {
					char oldOp = opstack.pop();
					// ! special case for ^, which is evaluated from right
					if (ch == '^'){
						opstack.push(oldOp);
					}
					// * new operator > top operator, push them back
					else if (precedence(ch) > precedence(oldOp)) {
						opstack.push(oldOp);
					} 
					// * or evaluate old operator with operands
					else {
						evaluateTop(numstack, oldOp);
					}
					opstack.push(ch);
				}
			} 
			// * is left parenthesis
			else if (ch == '(') {
				opstack.push(ch);
			} 
			// * is right parenthesis
			else if (ch == ')') {
				boolean done = false;
				// * evaluate from top of operator stack until left parenthesis
				while (!done) {
					if (opstack.size() == 0) {
						error("No matching (");
					}
					char oldOp = opstack.pop();
					if (oldOp == '(') {
						done = true;
					} else {
						evaluateTop(numstack, oldOp);
					}
				}
			} 
			// * is a digit
			else if (Character.isDigit(ch)) {
				int start = pos - 1;
				while (pos < expression.length() && Character.isDigit(expression.charAt(pos))) {
					pos++;
				}
				String num = expression.substring(start, pos);
				numstack.push(Integer.parseInt(num));
			} 
			// * error handling
			else {
				error("Number, operator, or parenthesis expected.");
			}
		}

		// * after dealing input, deal with remaining in stacks
		while (opstack.size() > 0) {
			char oldOp = opstack.pop();
			if (oldOp == '(') {
				error("No matching )");
			} else {
				evaluateTop(numstack, oldOp);
			}
		}
		if (numstack.size() == 0) {
			error("Syntax error");
		}
		System.out.println(numstack.pop());
		if (numstack.size() > 0) {
			error("Syntax error");
		}
	}

	/**
	 * Tests if a token is an operator.
	 * 
	 * @param s the token
	 * @return true if s is one of: + - * / ^
	 */
	public static boolean isOperator(char ch) {
		return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%' ||
		ch == '^';
	}

	/**
	 * Prints an error message and exits.
	 * 
	 * @param message information about the error
	 */
	public static void error(String message) {
		System.out.println("ERROR: " + message + ".");
		System.exit(1);
	}

	/**
	 * Computes the precedence level of an operator.
	 * 
	 * @param s the operator
	 * @return the precedence level (1 = lowest, 3 = highest)
	 */
	public static int precedence(char ch) {
		if (ch == '+' || ch == '-') {
			return 1;
		} else if (ch == '*' || ch == '/' || ch == '%') {
			return 2;
		} else if(ch == '^'){
			return 3;
		} else {
			return 0;
		}
	}

	/**
	 * Computes a new value and pushes it on the stack.
	 * 
	 * @param num the stack for the operands and result
	 * @param op  the operation to use
	 */
	public static void evaluateTop(Stack<Integer> num, char op) {
		if (num.size() == 0) {
			error("Syntax error");
		}

		int y = num.pop();
		if (num.size() == 0) {
			error("Syntax error");
		}

		int x = num.pop();
		int z = 0;

		if(op == '^'){
			z = x;
			for(int i = 0; i < y-1; i++){
				z *= x;
			}
		}else if (op == '*') {
			z = x * y;
		} else if (op == '/') {
			if (y == 0) {
				error("Divide by 0");
			} else {
				z = x / y;
			}
		} else if(op == '%'){
			if(y == 0){
				error("Divide by 0");
			}else{
				z = x % y;
			}
		}else if (op == '+') {
			z = x + y;
		} else if (op == '-') {
			z = x - y;
		} else {
			error("Syntax error");
		}
		num.push(z);
	}
}

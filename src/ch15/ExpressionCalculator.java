package ch15;

import java.util.*;

/**
 * This program evaluates arithmetic expressions, using two stacks.
 */
public class ExpressionCalculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an expression: ");
		String expression = in.nextLine().replace(" ", "");

		Stack<Integer> numstack = new Stack<>();
		Stack<Character> opstack = new Stack<>();

		int pos = 0;
		while (pos < expression.length()) {
			char ch = expression.charAt(pos);
			pos++;
			if (isOperator(ch)) {
				if (opstack.size() == 0) {
					opstack.push(ch);
				} else {
					char oldOp = opstack.pop();
					if (precedence(ch) > precedence(oldOp)) {
						opstack.push(oldOp);
					} else {
						evaluateTop(numstack, oldOp);
					}
					opstack.push(ch);
				}
			} else if (ch == '(') {
				opstack.push(ch);
			} else if (ch == ')') {
				boolean done = false;
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
			} else if (Character.isDigit(ch)) {
				int start = pos - 1;
				while (pos < expression.length() && Character.isDigit(expression.charAt(pos))) {
					pos++;
				}
				String num = expression.substring(start, pos);
				numstack.push(Integer.parseInt(num));
			} else {
				error("Number, operator, or parenthesis expected.");
			}
		}
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
		return ch == '+' || ch == '-' || ch == '*' || ch == '/';
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
		} else if (ch == '*' || ch == '/') {
			return 2;
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
		if (op == '*') {
			z = x * y;
		} else if (op == '/') {
			if (y == 0) {
				error("Divide by 0");
			} else {
				z = x / y;
			}
		} else if (op == '+') {
			z = x + y;
		} else if (op == '-') {
			z = x - y;
		} else {
			error("Syntax error");
		}
		num.push(z);
	}
}

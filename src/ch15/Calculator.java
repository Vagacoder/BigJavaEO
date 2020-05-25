package ch15;

import java.util.*;

/*
 * This calculator uses the reverse Polish notation.

 */
public class Calculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack<Integer> results = new Stack<>();
		System.out.println("Enter one number or operator per line, Q to quit. ");
		boolean done = false;

		while (!done) {
			String input = in.nextLine();

			// If the command is an operator, pop the arguments and push the result

			if (input.equals("+")) {
				results.push(results.pop() + results.pop());
			} else if (input.equals("-")) {
				Integer arg2 = results.pop();
				results.push(results.pop() - arg2);
			} else if (input.equals("*") || input.equals("x")) {
				results.push(results.pop() * results.pop());
			} else if (input.equals("/")) {
				Integer arg2 = results.pop();
				results.push(results.pop() / arg2);
			} else if (input.equals("Q") || input.equals("q")) {
				done = true;
			} else {
				// Not an operator--push the input value

				results.push(Integer.parseInt(input));
			}
			System.out.println(results);
		}
	}
}

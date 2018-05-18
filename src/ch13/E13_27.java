package ch13;

import java.util.*;

public class E13_27 {

    // private ArrayList<Integer> fibNumbers = new ArrayList<>();
    private Integer[] fibNumbers;

    public E13_27(int n) {
	fibNumbers = new Integer[n];
    }

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Enter n: ");
	int n = in.nextInt();
	in.close();
	E13_27 test = new E13_27(n);
	System.out.println(test.fib(n));

    }

    public long fib(int n) {

	if (n == 1) {
	    fibNumbers[1] = 1;
	    return 1;
	} else if (n == 2) {
	    fibNumbers[2] = 1;
	    return 1;
	} else {
	    if (fibNumbers[n - 1] != null && fibNumbers[n - 2] != null) {
		fibNumbers[n] = fibNumbers[n - 1] + fibNumbers[n - 2];
		return fibNumbers[n];

	    } else {
		return fib(n - 1) + fib(n - 2);
	    }
	}
    }

}

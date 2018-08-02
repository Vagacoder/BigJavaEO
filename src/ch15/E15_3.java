package ch15;

import java.util.*;

// E15.3 implementing the sieve of Eratoshenes: a method to compute prime numbers

public class E15_3 {

	public static void main(String[] args) {
		findPrime(100);

	}

	public static void findPrime(int n) {
		if (n < 2) {
			System.out.println("Please enter an integer >=2!");
			return;
		}
		HashSet<Integer> numbers = new HashSet<>();
		for (int i = 2; i <= n; i++) {
			numbers.add(i);
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			for (int j = 2; j * i <= n; j++) {
				numbers.remove(i * j);
			}
		}

		System.out.println(numbers.toString());
	}
}

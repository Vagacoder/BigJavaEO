package ch10.worked_example_1;

public class PrimeSequence implements Sequence {

	private int n = 2;

	@Override
	public int next() {
		boolean found = false;
		while (!found) {
			if (isPrime(n)) {
				found = true;
			} else {
				n++;
			}
		}
		return n++;
	}

	private boolean isPrime(int n) {
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

}

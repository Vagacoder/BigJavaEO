package ch12;

public class Addition {
	
	protected int a;
	protected int b;
	protected int result;
	
	public Addition() {
		
	}
	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		result = a +b;
	}

	public void printQ() {
		System.out.printf("%d + %d = ?", a, b);
	}
	
	public boolean isCorret(int input) {
		return input == result;
	}
}

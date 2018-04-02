package BigJavaCh13;

public class E13_13 {

    final static double EPSILON = 1E-14;

    public static void main(String[] args) {
	double sr = squareRoot(1000);
	System.out.println(sr);
	System.out.println(sr * sr);

    }

    public static double squareRoot(double x) {
	return squareRootGuess(x, x / 2);
    }

    public static double squareRootGuess(double x, double g) {

	if (x < 0) {
	    throw new IllegalArgumentException("Input must be positive number.");
	}

	if (Math.abs(g * g - x) < EPSILON) {
	    return g;
	} else {
	    return squareRootGuess(x, (g + x / g) / 2);
	}
    }
}

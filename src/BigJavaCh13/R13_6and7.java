package BigJavaCh13;

public class R13_6and7 {

    public static void main(String[] args) {
	System.out.println(powN(1.5, 1024));
	System.out.println(powN2(1.5, 1024));
    }

    public static double powN(double x, int n) {

	if (n == 0) {
	    return 1;
	}

	else if (n > 0) {
	    return x * powN(x, n - 1);
	} else {
	    return 1 / powN(x, -n);
	}
    }

    public static double powN2(double x, int n) {
	if (n == 0) {
	    return 1;
	}

	else if (n > 0 && n % 2 == 0) {
	    return Math.pow(powN(x, n / 2), 2);
	} else if (n > 0 && n % 2 == 1) {
	    return x * powN(x, n - 1);
	} else {
	    return 1 / powN(x, -n);
	}
    }
}

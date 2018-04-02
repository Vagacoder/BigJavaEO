<<<<<<< HEAD
package BigJavaCh13;

public class Pow2 {

	public static void main(String[] args) {
		System.out.println(power2(-1));
		System.out.println(power2(0));
		System.out.println(power2(1));
		System.out.println(power2(2));
		System.out.println(power2(4));

	}

	public static int power2(int number) {
		if (number <= 0) {
			return 1;
		} else {
			return power2(number - 1) * 2;
		}
	}

}
=======
package BigJavaCh13;

public class Pow2 {

    public static void main(String[] args) {
	System.out.println(power2(-1));
	System.out.println(power2(0));
	System.out.println(power2(1));
	System.out.println(power2(2));
	System.out.println(power2(4));

    }

    public static int power2(int number) {
	if (number <= 0) {
	    return 1;
	} else {
	    return power2(number - 1) * 2;
	}
    }

}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a

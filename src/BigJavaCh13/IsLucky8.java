<<<<<<< HEAD
package BigJavaCh13;

public class IsLucky8 {

    public static void main(String[] args) {

	System.out.println(isLucky(46516897));

    }

    public static boolean isLucky(int number) {
	int lastDigit = number % 10;
	if (lastDigit == 8) {
	    return true;
	} else {
	    if (number < 10) {
		return false;
	    } else {
		return isLucky(number / 10);
	    }
	}
    }

}
=======
package BigJavaCh13;

public class IsLucky8 {

    public static void main(String[] args) {

	System.out.println(isLucky(46516897));

    }

    public static boolean isLucky(int number) {
	int lastDigit = number % 10;
	if (lastDigit == 8) {
	    return true;
	} else {
	    if (number < 10) {
		return false;
	    } else {
		return isLucky(number / 10);
	    }
	}
    }

}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a

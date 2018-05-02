package bigJavaCh18;

import java.awt.*;

public class MaxDemo {
    public static <E extends Comparable<E>> E max(E[] a) {
	E largest = a[0];
	for (int i = 1; i < a.length; i++) {
	    if (a[i].compareTo(largest) > 0) {
		largest = a[i];
	    }
	}
	return largest;
    }

    public static void main(String[] args) {
	String[] words = { "Mary", "had", "a", "little", "lamb" };

	Color[] colors = { Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW };

	Integer[] squares = { 1, 4, 9, 16, 25, 36 };

	System.out.println(max(words)); // Calls max<String>
	// System.out.println(max(colors)); // Error: Color is not Comparable
	System.out.println(max(squares)); // Calls max<Integer>
    }
}

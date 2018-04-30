package bigJavaCh18;

import java.util.*;

public class E18_15 {

    public static void main(String[] args) {
	ArrayList<Integer> a1 = new ArrayList<>();
	for (int i = 0; i < 11; i++) {
	    a1.add(i);
	}
	System.out.println(a1);

	ArrayList<Integer> b1 = new ArrayList<>();
	for (int j = 20; j < 31; j++) {
	    b1.add(j);
	}
	System.out.println(b1);
	append(a1, b1);
	System.out.println(a1);
    }

    public static <T> void append(ArrayList<T> a, ArrayList<T> b) {
	for (T tInB : b) {
	    a.add(tInB);
	}
    }
}

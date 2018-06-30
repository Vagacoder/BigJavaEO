package ch14;

import java.util.*;

public class DupRemoverTester {

    public static void main(String[] args) {
	int[] a = { 12, 4, 65, 2, 9, 11, 23, 4, 91, 80 };
	int[] b = DupRemover.removeDup(a);
	System.out.println(Arrays.toString(b));
    }

}

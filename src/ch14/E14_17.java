package ch14;

import java.util.*;

public class E14_17 {

    public static void main(String[] args) {
	String s1 = "afkji";
	String s2 = "hkl;fddie";
	String s3 = "glj";
	String s4 = "vljeiopas";
	String s5 = "fex";
	String[] slist = { s1, s2, s3, s4, s5 };
	System.out.println(Arrays.toString(slist));
	System.out.println();
	// Arrays.sort(slist);
	// System.out.println(Arrays.toString(slist));
	// System.out.println();
	StringLengthComparator slc = new StringLengthComparator();
	Arrays.sort(slist, slc);
	System.out.println(Arrays.toString(slist));

    }

}

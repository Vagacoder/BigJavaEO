package ch14;

import java.util.*;

// for E14.17 and E14.18
public class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {

	int l1 = s1.length();
	int l2 = s2.length();

	if (l1 < l2) {
	    return -1;
	} else if (l1 > l2) {
	    return 1;
	} else {
	    return s1.compareTo(s2);
	}
    }

}

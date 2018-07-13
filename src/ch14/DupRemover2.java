package ch14;

import java.util.*;

/**
 * R14.17 Sort integer array first, then check every element and the one after
 * it, if they are same, remove it.
 * 
 * @author Skuller
 *
 */

public class DupRemover2 {

    public static void main(String[] args) {
	int[] a = { 5, 2, 7, 9, 1, 2, 4, 6 };
	int[] b = removeDup(a);
	System.out.println(Arrays.toString(b));
    }

    public static int[] removeDup(int[] a) {
	int[] result = a.clone();
	Arrays.sort(result);
	int index = 0;
	while (index < result.length - 1) {
	    if (result[index] == result[index + 1]) {
		result = DupRemover.remove(index, result);
	    } else {
		index++;
	    }
	}
	return result;
    }

}

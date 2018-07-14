package ch14;

/**
 * for E14.8
 * 
 * @author qhu
 *
 */

public class TelephoneLookup {

    public static int lookName(String[] names, int[] numbers, String name) {

	int index = BinarySearcher.searchString(names, 0, names.length - 1, name);
	if (index >= 0) {
	    return numbers[index];
	} else {
	    return index;
	}
    }

    public static String lookNumber(String[] names, int[] numbers, int number) {

	int index = BinarySearcher.search(numbers, 0, names.length - 1, number);
	if (index >= 0) {
	    return names[index];
	} else {
	    return "Not found!";
	}
    }
}

package bigJavaCh18;

import BigJavaCh10.*;

public class Search {

    public static <T extends Measurable> T binarySearch(T[] input, int sIndex, int eIndex, T target) {

	int mIndex = (sIndex + eIndex) / 2;
	if (input[mIndex].getMeasure() == target.getMeasure()) {
	    return input[mIndex];
	} else if (input[mIndex].getMeasure() < target.getMeasure()) {
	    binarySearch(input, sIndex, mIndex - 1, target);
	} else {
	    binarySearch(input, mIndex + 1, eIndex, target);
	}
	return null;
    }

}

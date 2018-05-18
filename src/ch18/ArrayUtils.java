package ch18;

import ch10.*;

public class ArrayUtils {

    public static <T extends Measurable> double average(T[] array) {

	double sum = 0;
	for (T element : array) {
	    sum += element.getMeasure();
	}

	return sum / array.length;

    }

    public static <T extends Measurable> double min(T[] array) {

	double min = array[0].getMeasure();

	for (T element : array) {
	    if (element.getMeasure() < min) {
		min = element.getMeasure();
	    }
	}
	return min;
    }

}

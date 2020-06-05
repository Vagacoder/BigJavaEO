package ch18;

import java.util.ArrayList;

import ch10.*;

/*
 * E18.15 Provide a static method void append(ArrayList<T> a, ArrayList<T> b) 
 * that appends the elements of b to a.
 
 */
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

	// * E18.15
	public static <T> ArrayList<T> append(ArrayList<T> a, ArrayList<T> b) {
		ArrayList<T> result = new ArrayList<>();
		for (T e : a) {
			result.add(e);
		}
		for (T e : b) {
			result.add(e);
		}
		return result;
	}
}

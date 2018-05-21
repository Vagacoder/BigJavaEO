package ch10.sec4;

public class Data {
	/**
	 * Computes the average of the measures of the given objects.
	 * 
	 * @param objects
	 *            an array of objects
	 * @param meas
	 *            the measurer for the objects
	 * @return the average of the measures
	 */
	public static double average(Object[] objects, Measurer meas) {
		double sum = 0;
		for (Object obj : objects) {
			sum = sum + meas.measure(obj);
		}
		if (objects.length > 0) {
			return sum / objects.length;
		} else {
			return 0;
		}
	}

	public static Object max(Object[] objects, Measurer m) {

		double max = m.measure(objects[0]);
		int indexOfMax = 0;
		int i = 0;
		for (Object obj : objects) {
			if (m.measure(obj) > max) {
				max = m.measure(obj);
				indexOfMax = i;
			}
			i++;
		}
		return objects[indexOfMax];
	}
}
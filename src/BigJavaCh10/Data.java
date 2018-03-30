package BigJavaCh10;

import java.awt.*;

public class Data {
    /**
     * Computes the average of the measures of the given objects.
     * 
     * @param objects
     *            an array of Measurable objects
     * @return the average of the measures
     */
    public static double average(Measurable[] objects) {
	double sum = 0;
	for (Measurable obj : objects) {
	    sum = sum + obj.getMeasure();
	}
	if (objects.length > 0) {
	    return sum / objects.length;
	} else {
	    return 0;
	}
    }

    public static Measurable max(Measurable[] objects) {

	int index = 0;
	double max = objects[0].getMeasure();
	for (int i = 0; i < objects.length; i++) {

	    if (objects[i].getMeasure() > max) {
		max = objects[i].getMeasure();
		index = i;
	    }
	}
	return objects[index];
    }

    public static double average(Rectangle[] rects, Measurer areaMeas) {
	double sum = 0;
	int number = 0;
	for (Rectangle rec : rects) {
	    sum += areaMeas.measure(rec);
	    number++;
	}
	return sum / number;
    }

    public static Rectangle max(Rectangle rec1, Rectangle rec2, Measurer areaMeas) {

	if (areaMeas.measure(rec1) >= areaMeas.measure(rec2)) {
	    return rec1;
	} else {
	    return rec2;
	}

    }
}

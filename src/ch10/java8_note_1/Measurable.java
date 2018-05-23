package ch10.java8_note_1;

public interface Measurable {
    double getMeasure(); // An abstract method

    static double average(Measurable[] objects) // A static method
    {
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
}

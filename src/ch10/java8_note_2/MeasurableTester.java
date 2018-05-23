package ch10.java8_note_2;

/**
 * This program demonstrates the smallerThan default method.
 */
public class MeasurableTester {
    public static void main(String[] args) {
	Measurable[] countries = new Measurable[3];
	countries[0] = new Country("Uruguay", 176220);
	countries[1] = new Country("Thailand", 513120);
	countries[2] = new Country("Belgium", 30510);

	System.out.println("Uruguay is smaller than Thailand: " + countries[0].smallerThan(countries[1]));
	System.out.println("Expected: true");
	System.out.println("Uruguay is smaller than Belgium: " + countries[0].smallerThan(countries[2]));
	System.out.println("Expected: false");
    }
}

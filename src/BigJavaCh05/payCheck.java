<<<<<<< HEAD
package BigJavaCh05;

public class payCheck {

	private double wage;
	public final double HOUTLY_WAGE = 9.25;
	public final double MAXIMUM_HOUR = 40;
	public final double OVER_WORK_RATE = 1.5;

	public payCheck(double hours) {

		if (hours > MAXIMUM_HOUR) {
			wage = MAXIMUM_HOUR * HOUTLY_WAGE + (hours - MAXIMUM_HOUR) * HOUTLY_WAGE * OVER_WORK_RATE;
		}

		else {
			wage = HOUTLY_WAGE * hours;
		}
	}

	public void printCheck() {

		System.out.printf("Your payment is: $%.2f.\n", wage);
	}

}
=======
package BigJavaCh05;

public class payCheck {

	private double wage;
	public final double HOUTLY_WAGE = 9.25;
	public final double MAXIMUM_HOUR = 40;
	public final double OVER_WORK_RATE = 1.5;

	public payCheck(double hours) {

		if (hours > MAXIMUM_HOUR) {
			wage = MAXIMUM_HOUR * HOUTLY_WAGE + (hours - MAXIMUM_HOUR) * HOUTLY_WAGE * OVER_WORK_RATE;
		}

		else {
			wage = HOUTLY_WAGE * hours;
		}
	}

	public void printCheck() {

		System.out.printf("Your payment is: $%.2f.\n", wage);
	}

}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a

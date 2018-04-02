package BigJavaCh05;

public class LeapYear {

	private int year;

	public LeapYear(int year) {
		this.year = year;

	}

	public boolean isLeapYear() {
		boolean leap = false;

		if (year % 4 == 0) {
			leap = true;
		}
		if (year % 100 == 0) {
			leap = false;
		}
		if (year % 400 == 0) {
			leap = true;
		}

		return leap;
	}
}

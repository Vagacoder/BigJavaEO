<<<<<<< HEAD
package BigJavaCh05;

public class Month {

	private int month;

	public Month(int number) {

		this.month = number;
	}

	public int getDays() {
		if (month == 2) {
			return 28;
		}

		else if (month <= 7) {
			if (month % 2 == 1) {
				return 31;
			}

			else if (month % 2 == 0) {
				return 30;
			}

		}

		else if (month > 7) {
			if (month % 2 == 1) {
				return 30;
			} else if (month % 2 == 0) {
				return 31;
			}
		}

		return 0;
	}
}
=======
package BigJavaCh05;

public class Month {

	private int month;

	public Month(int number) {

		this.month = number;
	}

	public int getDays() {
		if (month == 2) {
			return 28;
		}

		else if (month <= 7) {
			if (month % 2 == 1) {
				return 31;
			}

			else if (month % 2 == 0) {
				return 30;
			}

		}

		else if (month > 7) {
			if (month % 2 == 1) {
				return 30;
			} else if (month % 2 == 0) {
				return 31;
			}
		}

		return 0;
	}
}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a

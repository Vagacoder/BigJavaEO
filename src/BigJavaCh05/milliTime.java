<<<<<<< HEAD
package BigJavaCh05;

public class milliTime {

	private int hour;
	private int minute;

	public milliTime(int time) {

		hour = time / 100;
		minute = time % 100;

	}

	public int getTime() {

		return hour * 100 + minute;

	}

	public int compareTo(milliTime time) {

		if (this.hour < time.hour) {
			return -1;
		} else if (this.hour == time.hour)

		{
			if (this.minute < time.minute) {
				return -1;
			}

			else if (this.minute == time.minute) {
				return 0;
			}

			else {
				return 1;
			}

		} else {
			return 1;
		}

	}

}
=======
package BigJavaCh05;

public class milliTime {

	private int hour;
	private int minute;

	public milliTime(int time) {

		hour = time / 100;
		minute = time % 100;

	}

	public int getTime() {

		return hour * 100 + minute;

	}

	public int compareTo(milliTime time) {

		if (this.hour < time.hour) {
			return -1;
		} else if (this.hour == time.hour)

		{
			if (this.minute < time.minute) {
				return -1;
			}

			else if (this.minute == time.minute) {
				return 0;
			}

			else {
				return 1;
			}

		} else {
			return 1;
		}

	}

}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a

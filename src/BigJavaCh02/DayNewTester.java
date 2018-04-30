
package BigJavaCh02;

public class DayNewTester {

    public static void main(String[] args) {
	Day thisYear = new Day(2017, 2, 28);

	System.out.println(thisYear);
	System.out.println(thisYear.addDays(365));
	System.out.println(thisYear.addDays(365 * 2));
	System.out.println(thisYear.addDays(365 * 3));

	int year = thisYear.getYear();
	int month = thisYear.getMonth();
	int day = thisYear.getDate();
	System.out.println(new Day(year + 1, month, day).addDays(1));
	System.out.println(new Day(year + 2, month, day).addDays(2));
	System.out.println(new Day(year + 3, month, day).addDays(3));
    }

}

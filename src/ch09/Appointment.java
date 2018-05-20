package ch09;

/**
 * P9.3
 *
 */

public class Appointment {
    String description;
    int year;
    int month;
    int day;

    // main method for testing
    public static void main(String[] args) {
	Appointment[] apps = new Appointment[3];
	OneTime app1 = new OneTime();
	app1.description = "Dentist";
	app1.year = 2018;
	app1.month = 11;
	app1.day = 5;
	apps[0] = app1;
	// System.out.println(app1.occursOn(2018, 12, 5));
	// System.out.println(app1.occursOn(2018, 11, 5));
	Monthly app2 = new Monthly();
	app2.description = "Physician";
	app2.year = 2016;
	app2.month = 7;
	app2.day = 5;
	apps[1] = app2;

	Daily app3 = new Daily();
	app3.description = "Surgery";
	app3.year = 2017;
	app3.month = 2;
	app3.day = 8;
	apps[2] = app3;

	for (Appointment app : apps) {
	    System.out.println(app.getClass());

	    if (app.occursOn(2018, 11, 5)) {
		System.out.println("Today you have " + app.description);
	    } else {
		System.out.println("You dont have " + app.description);
	    }

	}
    }

    // method to check whether an appointment occurs at a specific date;
    public boolean occursOn(int year, int month, int day) {
	if (this.year == year && this.month == month && this.day == day) {
	    return true;
	} else {
	    return false;
	}
    }
}

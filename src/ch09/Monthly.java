package ch09;

public class Monthly extends Appointment {

    @Override
    public boolean occursOn(int year, int month, int day) {
	if (this.day == day) {
	    return true;
	} else {
	    return false;
	}
    }
}

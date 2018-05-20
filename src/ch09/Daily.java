package ch09;

public class Daily extends Appointment {
    @Override
    public boolean occursOn(int year, int month, int day) {
	return true;

    }
}

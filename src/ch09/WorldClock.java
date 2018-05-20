package ch09;

// for P9.1, this class extends Clock class
public class WorldClock extends Clock {

    // time zone, compare to GMT
    private int timeZone;

    public static void main(String[] args) {
	WorldClock wc1 = new WorldClock(3);
	Clock c1 = new Clock();
	System.out.println(wc1.getTime());
	System.out.println(c1.getTime());
    }

    public WorldClock(int timeDifference) {
	this.timeZone = timeDifference;
    }

    @Override
    public String getHours() {
	String hours = Integer.parseInt(super.getHours()) + timeZone + "";
	return hours;
    }
}

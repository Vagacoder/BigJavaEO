package ch04;

public class Balloon {

	private double volume;
	private double area;
	private double radius;

	public Balloon(double amount) {

		volume = amount;

	}

	public void addAir(double amount) {

		volume = volume + amount;

	}

	public double getVolume() {

		return volume;

	}

	public double getRadius() {

		radius = Math.cbrt(3.0 * volume / 4.0 / Math.PI);
		return radius;
	}

	public double getSurfaceArea() {

		radius = Math.cbrt(3.0 * volume / 4.0 / Math.PI);
		area = 4.0 * Math.PI * radius * radius;
		return area;

	}
}

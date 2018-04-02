package BigJavaCh04;

public class BalloonTester {

	public static void main(String[] args) {

		Balloon b = new Balloon(100);

		System.out.println(b.getVolume());
		System.out.println(b.getSurfaceArea());
		System.out.println(b.getRadius());

		b.addAir(100);
		System.out.println(b.getVolume());
		System.out.println(b.getSurfaceArea());
		System.out.println(b.getRadius());

		System.out.println(4.0 / 3.0 * Math.PI * b.getRadius() * b.getRadius() * b.getRadius());
		System.out.println(4.0 * Math.PI * b.getRadius() * b.getRadius());

	}

}

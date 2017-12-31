package BigJavaCh10;

public class Person implements Measurable, Comparable {

	private String name;
	private double height;

	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}

	@Override
	public double getMeasure() {
		return height;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public int compareTo(Object o) {

		Person other = (Person) o;

		if (this.getHeight() < other.getHeight())
			{
				return -1;
			}
		else if (this.getHeight() > other.getHeight())
			{
				return 1;
			}
		else
			{
				return 0;
			}
	}
}

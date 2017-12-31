package BigJavaCh10;

/**
 * A country with a name and area.
 */
public class Country implements Measurable, Comparable {
	private String name;
	private double area;

	/**
	 * Constructs a country.
	 * 
	 * @param aName
	 *            the name of the country
	 * @param anArea
	 *            the area of the country
	 */
	public Country(String aName, double anArea) {
		name = aName;
		area = anArea;
	}

	/**
	 * Gets the country name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the area of the country.
	 * 
	 * @return the area
	 */
	public double getArea() {
		return area;
	}

	public double getMeasure() {
		return area;
	}

	@Override
	public int compareTo(Object o) {

		Country other = (Country) o;
		if (this.getArea() < other.getArea())
			{
				return -1;
			}
		else if (this.getArea() > other.getArea())
			{
				return 1;
			}
		else
			{
				return 0;
			}
	}
}

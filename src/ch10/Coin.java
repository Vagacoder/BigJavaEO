package ch10;

/**
 * A coin with a monetary value.
 */

public class Coin implements Comparable {
	private double value;
	private String name;

	/**
	 * Constructs a coin.
	 * 
	 * @param aValue
	 *            the monetary value of the coin
	 * @param aName
	 *            the name of the coin
	 */
	public Coin(double aValue, String aName) {
		value = aValue;
		name = aName;
	}

	/**
	 * Gets the coin value.
	 * 
	 * @return the value
	 */
	public double getValue() {
		return value;
	}

	/**
	 * Gets the coin name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Object o) {
		Coin other = (Coin) o;
		if (this.getValue() < other.getValue())
			{
				return -1;
			}
		else if (this.getValue() > other.getValue())
			{
				return 1;
			}
		else
			{
				return 0;
			}
	}
}

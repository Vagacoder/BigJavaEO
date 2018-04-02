<<<<<<< HEAD
package BigJavaCh05;

/**
 * A class that describes the effects of an earthquake.
 */
public class Earthquake {
	private double richter;

	/**
	 * Constructs an Earthquake object.
	 * 
	 * @param magnitude
	 *            the magnitude on the Richter scale
	 */
	public Earthquake(double magnitude) {
		richter = magnitude;
	}

	/**
	 * Gets a description of the effect of the earthquake.
	 * 
	 * @return the description of the effect
	 */
	public String getDescription() {
		String description;
		if (richter >= 8.0) {
			description = "Most structures fall";
		} else if (richter >= 7.0) {
			description = "Many buildings destroyed";
		} else if (richter >= 6.0) {
			description = "Many buildings considerably damaged, some collapse";
		} else if (richter >= 4.5) {
			description = "Damage to poorly constructed buildings";
		} else {
			description = "No destruction of buildings";
		}
		return description;
	}
}
=======
package BigJavaCh05;

/**
 * A class that describes the effects of an earthquake.
 */
public class Earthquake {
	private double richter;

	/**
	 * Constructs an Earthquake object.
	 * 
	 * @param magnitude
	 *            the magnitude on the Richter scale
	 */
	public Earthquake(double magnitude) {
		richter = magnitude;
	}

	/**
	 * Gets a description of the effect of the earthquake.
	 * 
	 * @return the description of the effect
	 */
	public String getDescription() {
		String description;
		if (richter >= 8.0) {
			description = "Most structures fall";
		} else if (richter >= 7.0) {
			description = "Many buildings destroyed";
		} else if (richter >= 6.0) {
			description = "Many buildings considerably damaged, some collapse";
		} else if (richter >= 4.5) {
			description = "Damage to poorly constructed buildings";
		} else {
			description = "No destruction of buildings";
		}
		return description;
	}
}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a

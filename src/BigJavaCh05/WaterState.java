/**
 * CS 105 Theory and Practice I
 * CRN: 38066
 * Assignment: WaterState
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Qirui Hu
 */

package BigJavaCh05;

/**
 * This class racks the state of water. The temperature String passed to the
 * constructor will be something like "100C" for 100 degrees Centigrade or
 * "-20F" for minus 20 degrees Fahrenheit.
 *
 */

public class WaterState {

	private boolean isCelsius;
	private double waterTemperature;
	private final double FRZOEN_CELSIUS = 0;
	private final double BOIL_CELSIUS = 100;
	private final double FRZOEN_FAHRENHEIT = 32;
	private final double BOIL_FAHRENHEIT = 212;
	private final double METER_CHANGE_PER_DEGREE_CELSIUS = 300;
	private final double FEET_CHANGE_PER_DEGREE_CELSIUS = 1000;

	/**
	 * Constructor, create a object of WaterState; decide whether in Celsius or
	 * Fahrenheit model.
	 * 
	 * @param temperature
	 *            input temperature in a string. Example: "100C" for 100 degrees
	 *            Centigrade or "-20F" for minus 20 degrees Fahrenheit.
	 */

	public WaterState(String temperature) {

		int length = temperature.length();
		char temperatureModel = temperature.charAt(length - 1);
		isCelsius = temperatureModel == 'C';
		waterTemperature = Double.parseDouble(temperature.substring(0, length - 1));

	}

	/**
	 * Return the state of WaterState object.
	 * 
	 * @return the state (GAS, LIQUID or SOLID) of WaterState object.
	 */
	public MatterState getState() {
		MatterState state = MatterState.GAS;
		if (isCelsius) {
			if (waterTemperature < 100 && waterTemperature > 0) {
				state = MatterState.LIQUID;
			} else if (waterTemperature <= 0) {
				state = MatterState.SOLID;
			}
		}

		else {
			if (waterTemperature < 212 && waterTemperature > 32) {
				state = MatterState.LIQUID;
			} else if (waterTemperature <= 32) {
				state = MatterState.SOLID;
			}
		}

		return state;
	}

}

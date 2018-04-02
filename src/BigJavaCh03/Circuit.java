<<<<<<< HEAD
package BigJavaCh03;

/**
 * Big Java Early Object 6th CH03 E3.5
 * 
 * Two switches (#1 and #2) control one light. Each switch can be up (1) or down
 * (0), and the light can be on (1) or off (0). Toggling either switch turns the
 * lamp on or off.
 * 
 * Requirements:
 * 
 * 1, use SINGLE method to call the one of states of 2 switches: public int
 * getSwitchState(int switch);
 * 
 * 2, use SINGLE method to toggle one of 2 switches: public void
 * toggleSwitch(int switch);
 * 
 * 3, Provide an implementation using only language features that have been
 * introduced (Chapter 1-3).
 * 
 * The challenge is to find a data representation from which to recover the
 * switch states.
 * 
 * @author Skuller
 *
 */

public class Circuit {

	private int firstSwitch;
	private int secondSwitch;
	private int combineSwitch;
	private int lampState;

	/**
	 * Constructor. Initialize a key variable: combineSwitch
	 */
	public Circuit() {

		firstSwitch = 0;
		secondSwitch = 0;
		combineSwitch = 0;
		lampState = 0;

	}

	/**
	 * Toggle one of 2 switches, based on parameter switchID: 1 = switch#1, 2 =
	 * switch#2.
	 * 
	 * @variable firstSwith store state of switch#1, 1 = on, 0 =off;
	 * @variable secondSwith store state of switch#2, 1 = on, 0 = off;
	 * @variable combineSwitch TWO figure number, tens store the state of switch#2,
	 *           digits store the state of switch #1;
	 * @variable lampState store state of lamp, 1 = on, 0 =off.
	 * 
	 * @param switchID
	 *            1 = switch#1, 2 = switch#2.
	 */

	public void toggleSwitch(int switchID) {

		firstSwitch = (firstSwitch + switchID) % 2;
		secondSwitch = (secondSwitch + switchID + 1) % 2;
		combineSwitch = firstSwitch + secondSwitch * 10;
		lampState = (lampState + 1) % 2;

	}

	/**
	 * Get the state of one of switches, based on switchID: 1 = switch#1, 2 =
	 * switch#2.
	 * 
	 * @param switchID
	 *            1 = switch#1, 2 = switch#2
	 * @return state of one of switches, based on switchID: 1 = switch#1, 2 =
	 *         switch#2.
	 */

	public int getSwtitchState(int switchID) {

		int power2 = (int) Math.pow(10, switchID);
		int power1 = (int) Math.pow(10, switchID - 1);

		int switchState = Math.floorDiv(combineSwitch % power2, power1);
		return switchState;

	}

	/**
	 * Get the state of Lamp: 1 = on, 0 = off.
	 * 
	 * @return the state of Lamp: 1 = on, 0 = off.
	 */

	public int getLampState() {

		return lampState;

	}

}
=======
package BigJavaCh03;

/**
 * Big Java Early Object 6th CH03 E3.5
 * 
 * Two switches (#1 and #2) control one light. Each switch can be up (1) or down
 * (0), and the light can be on (1) or off (0). Toggling either switch turns the
 * lamp on or off.
 * 
 * Requirements:
 * 
 * 1, use SINGLE method to call the one of states of 2 switches: public int
 * getSwitchState(int switch);
 * 
 * 2, use SINGLE method to toggle one of 2 switches: public void
 * toggleSwitch(int switch);
 * 
 * 3, Provide an implementation using only language features that have been
 * introduced (Chapter 1-3).
 * 
 * The challenge is to find a data representation from which to recover the
 * switch states.
 * 
 * @author Skuller
 *
 */

public class Circuit {

	private int firstSwitch;
	private int secondSwitch;
	private int combineSwitch;
	private int lampState;

	/**
	 * Constructor. Initialize a key variable: combineSwitch
	 */
	public Circuit() {

		firstSwitch = 0;
		secondSwitch = 0;
		combineSwitch = 0;
		lampState = 0;

	}

	/**
	 * Toggle one of 2 switches, based on parameter switchID: 1 = switch#1, 2 =
	 * switch#2.
	 * 
	 * @variable firstSwith store state of switch#1, 1 = on, 0 =off;
	 * @variable secondSwith store state of switch#2, 1 = on, 0 = off;
	 * @variable combineSwitch TWO figure number, tens store the state of switch#2,
	 *           digits store the state of switch #1;
	 * @variable lampState store state of lamp, 1 = on, 0 =off.
	 * 
	 * @param switchID
	 *            1 = switch#1, 2 = switch#2.
	 */

	public void toggleSwitch(int switchID) {

		firstSwitch = (firstSwitch + switchID) % 2;
		secondSwitch = (secondSwitch + switchID + 1) % 2;
		combineSwitch = firstSwitch + secondSwitch * 10;
		lampState = (lampState + 1) % 2;

	}

	/**
	 * Get the state of one of switches, based on switchID: 1 = switch#1, 2 =
	 * switch#2.
	 * 
	 * @param switchID
	 *            1 = switch#1, 2 = switch#2
	 * @return state of one of switches, based on switchID: 1 = switch#1, 2 =
	 *         switch#2.
	 */

	public int getSwtitchState(int switchID) {

		int power2 = (int) Math.pow(10, switchID);
		int power1 = (int) Math.pow(10, switchID - 1);

		int switchState = Math.floorDiv(combineSwitch % power2, power1);
		return switchState;

	}

	/**
	 * Get the state of Lamp: 1 = on, 0 = off.
	 * 
	 * @return the state of Lamp: 1 = on, 0 = off.
	 */

	public int getLampState() {

		return lampState;

	}

}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a

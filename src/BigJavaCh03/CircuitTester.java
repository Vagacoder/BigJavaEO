<<<<<<< HEAD
package BigJavaCh03;

public class CircuitTester {

	public static void main(String[] args) {

		Circuit light = new Circuit();

		light.toggleSwitch(1);
		light.toggleSwitch(2);
		// light.toggleSwitch(2);
		light.toggleSwitch(1);
		// light.toggleSwitch(1);

		System.out.println("Lamp state is:");
		System.out.println(light.getLampState());
		System.out.println("Switch#1 state is:");
		System.out.println(light.getSwtitchState(1));
		System.out.println("Switch#2 state is:");
		System.out.println(light.getSwtitchState(2));

	}

}
=======
package BigJavaCh03;

public class CircuitTester {

	public static void main(String[] args) {

		Circuit light = new Circuit();

		light.toggleSwitch(1);
		light.toggleSwitch(2);
		// light.toggleSwitch(2);
		light.toggleSwitch(1);
		// light.toggleSwitch(1);

		System.out.println("Lamp state is:");
		System.out.println(light.getLampState());
		System.out.println("Switch#1 state is:");
		System.out.println(light.getSwtitchState(1));
		System.out.println("Switch#2 state is:");
		System.out.println(light.getSwtitchState(2));

	}

}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a

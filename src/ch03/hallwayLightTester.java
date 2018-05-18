package ch03;

public class hallwayLightTester {

	public static void main(String[] args) {
		
		hallwayLight newLight = new hallwayLight();
		
		newLight.toggleFirstSwitch();
				
		System.out.println(newLight.getFirstSwitchState());
		System.out.println(newLight.getSecondSwitchState());
		System.out.println(newLight.getLampState());
		System.out.println("Expected 1" + "\n");

		newLight.toggleSecondSwitch();
		System.out.println(newLight.getFirstSwitchState());
		System.out.println(newLight.getSecondSwitchState());
		System.out.println(newLight.getLampState());
		System.out.println("Expected 0" + "\n");
		
		newLight.toggleFirstSwitch();
		
		System.out.println(newLight.getFirstSwitchState());
		System.out.println(newLight.getSecondSwitchState());
		System.out.println(newLight.getLampState());
		System.out.println("Expected 1" + "\n");
		
		newLight.toggleSecondSwitch();
		System.out.println(newLight.getFirstSwitchState());
		System.out.println(newLight.getSecondSwitchState());
		System.out.println(newLight.getLampState());
		System.out.println("Expected 0" + "\n");
		
		newLight.toggleSecondSwitch();
		System.out.println(newLight.getFirstSwitchState());
		System.out.println(newLight.getSecondSwitchState());
		System.out.println(newLight.getLampState());
		System.out.println("Expected 1" + "\n");
	}

}

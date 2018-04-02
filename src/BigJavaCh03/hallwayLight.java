<<<<<<< HEAD
package BigJavaCh03;

public class hallwayLight {
	
	private int firstSwitch;
	private int secondSwitch;
	private int lampState;
	
	public hallwayLight() {
		firstSwitch = 0;
		secondSwitch = 0;
		lampState = 0;
	}
	
	public void toggleFirstSwitch() {
		
		firstSwitch = (firstSwitch + 1)%2;		
		lampState = (lampState + 1)%2; 
	}
		
	public void toggleSecondSwitch() {
		
		secondSwitch = (secondSwitch + 1)%2;
		lampState = (lampState + 1)%2;
		
	}
	
	public int getFirstSwitchState() {
		
		return firstSwitch;
		
	}

	public int getSecondSwitchState() {
		
		return secondSwitch;
		
	}
	
	public int getLampState() {
		
		return lampState;
	}
	
	
}
=======
package BigJavaCh03;

public class hallwayLight {
	
	private int firstSwitch;
	private int secondSwitch;
	private int lampState;
	
	public hallwayLight() {
		firstSwitch = 0;
		secondSwitch = 0;
		lampState = 0;
	}
	
	public void toggleFirstSwitch() {
		
		firstSwitch = (firstSwitch + 1)%2;		
		lampState = (lampState + 1)%2; 
	}
		
	public void toggleSecondSwitch() {
		
		secondSwitch = (secondSwitch + 1)%2;
		lampState = (lampState + 1)%2;
		
	}
	
	public int getFirstSwitchState() {
		
		return firstSwitch;
		
	}

	public int getSecondSwitchState() {
		
		return secondSwitch;
		
	}
	
	public int getLampState() {
		
		return lampState;
	}
	
	
}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a

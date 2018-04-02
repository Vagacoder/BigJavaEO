package BigJavaCh03;

public class Microwave {
	
	private int timer;
	private int powerLevel;
	
	public Microwave() {
		
		timer = 0;
		powerLevel = 0;
		
	}

	public void addTime() {
		
		timer = timer + 30;
		
	}
	
	public void changePower() {
		
		powerLevel = (powerLevel + 1)%2;
		
	}
	
	public void reset() {
		timer = 0;
		powerLevel = 0;
		
	}
	public void start() {
		
		System.out.println("Cooking for " + timer +" seconds at level " + (powerLevel+1));
	}
}

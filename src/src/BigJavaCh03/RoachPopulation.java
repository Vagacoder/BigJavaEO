package BigJavaCh03;

public class RoachPopulation {
	
	private double population;

	public RoachPopulation(int startPopulation) {
		
		population = startPopulation;
			
	}
	
	public void breed() {
		
		population = population * 2;
	}
	
	public void spray(double byPercent) {
		
		population = population * (1 - (byPercent/100));
				
	}
	
	public double getRoach() {
		
		return population;
		
	}
	
	
}

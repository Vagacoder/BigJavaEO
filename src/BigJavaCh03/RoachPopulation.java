<<<<<<< HEAD
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
=======
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
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a

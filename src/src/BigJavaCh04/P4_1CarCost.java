package BigJavaCh04;

public class P4_1CarCost {
	
	private double newCarPrice;
	private double milePerYear;
	private double gasPrice;
	private double milePerGallon;
	private double resalePrice;
	
	
	public P4_1CarCost (double newCarPrice, double milePerYear, double gasPrice, 
			double milePerGallon, double resalePrice) {		
		
		this.newCarPrice = newCarPrice;
		this.milePerYear = milePerYear;
		this.gasPrice = gasPrice;
		this.milePerGallon = milePerGallon;
		this.resalePrice = resalePrice;
				
	}
	
	public double getCost() {
		
		double cost = newCarPrice + milePerYear/milePerGallon*gasPrice - resalePrice;
		return cost;
	}

}

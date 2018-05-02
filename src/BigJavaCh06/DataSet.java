package BigJavaCh06;

public class DataSet {
	
	private double min;
	private double max;
	private double sum;
	private double stDev;
	private double squareSum;
	private int count;
	
	public DataSet() {
		
	}
	
	public void add(double value) {
		
		sum += value;
		squareSum += value*value;
		if (count == 0) {min = value; max = value;}
		else 
		{
			if (value > max ) {max = value;}
			if (value < min ) {min = value;}
		}
		count ++;
	}
	
	public double getAverage() {
		
		double average = 0;
		if (count > 0) {average = sum/count;}
				
		return average;
		
	}
	
	public double getSmallest() {
		return min;
	}
	
	public double getLargest() {
		return max;
	}
	
	public double getRange() {
		return max-min;
	}
	
	public double getStandardDeviation() {
		stDev = Math.sqrt((squareSum - sum * sum/count)/(count-1));
		return stDev;
	}
}	



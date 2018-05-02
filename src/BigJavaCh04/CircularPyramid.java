package BigJavaCh04;

public class CircularPyramid {
	
	private double height;
	private double radius;
	
	public CircularPyramid(double height, double radius) {
		
		this.height = height;
		this.radius = radius;
				
	}

	public double getVolumn() {
		
		double volumn = Math.PI /3.0* radius * radius* height;
		return volumn;
		
	}
	
	public double getSurface() {
		
		double surface = Math.PI * radius * Math.sqrt(height* height + radius*radius);
		return surface;
	}
}


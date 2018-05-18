package ch04;

public class IceCreamCone {
	
	private double radius;
	private double height;
	
	public IceCreamCone(double radius, double height) {
		this.radius = radius;
		this.height = height;
				
	}
	
	public double getVolumn() {
		
		double volumn = Math.PI/3.0 * radius * radius *height;
		return volumn;
		
	}
	
	public double getSurface () {
		
		double surface = 2 * Math.PI *radius * Math.sqrt(radius*radius + height*height);
		return surface;
	}
}

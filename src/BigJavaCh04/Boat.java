package BigJavaCh04;

public class Boat {
	
	private double x;
	private double y;
	private double direction;
	
	public Boat() {
		
		x = 0;
		y =0;
		direction =0;
	}
	public void Turn(double degree) {
		
		direction += Math.toRadians(degree);
	}
	
	public void Move(double distance) {
		
		x += distance*Math.cos(direction);
		y += distance*Math.sin(direction);
		
	}
	
	public double getX() {
		
		return x;
	}
	public double getY() {
		
		return y;
	}
	
	public double getDirection() {
		
		return Math.toDegrees(direction);
	}
}

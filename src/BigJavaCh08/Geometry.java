<<<<<<< HEAD
package BigJavaCh08;

public class Geometry {
	
	public Geometry() {
		
	}

	public static double cubeVolume(double h) {
		
		double vol = h*h*h;
		return vol;
	}
	
	public static double cubeSurface(double h) {
		double area = h*h*6;
		return area;
	}
	
	public static double sphereVolume(double r) {
		double vol = 4*Math.PI*r*r*r/3;
		return vol;
	}
	
	public static double sphereSurface(double r) {
		double area = 4*Math.PI*r*r;
		return area;
	}
	public static double cylinderVolume(double r, double h) {
		double vol = Math.PI*r*r*h;
		return vol;
	}
	public static double cylinderSurface(double r, double h) {
		double area = 2*Math.PI*r*r + 2*Math.PI*r*h;
		return area;
	}
	public static double coneVolume(double r, double h) {
		double vol = Math.PI*r*r*h/3;
		return vol;
	}
	public static double coneSurface(double r, double h) {
		double area = Math.PI*r*(r+Math.sqrt(h*h + r*r));
		return area;
	}
}
=======
package BigJavaCh08;

public class Geometry {
	
	public Geometry() {
		
	}

	public static double cubeVolume(double h) {
		
		double vol = h*h*h;
		return vol;
	}
	
	public static double cubeSurface(double h) {
		double area = h*h*6;
		return area;
	}
	
	public static double sphereVolume(double r) {
		double vol = 4*Math.PI*r*r*r/3;
		return vol;
	}
	
	public static double sphereSurface(double r) {
		double area = 4*Math.PI*r*r;
		return area;
	}
	public static double cylinderVolume(double r, double h) {
		double vol = Math.PI*r*r*h;
		return vol;
	}
	public static double cylinderSurface(double r, double h) {
		double area = 2*Math.PI*r*r + 2*Math.PI*r*h;
		return area;
	}
	public static double coneVolume(double r, double h) {
		double vol = Math.PI*r*r*h/3;
		return vol;
	}
	public static double coneSurface(double r, double h) {
		double area = Math.PI*r*(r+Math.sqrt(h*h + r*r));
		return area;
	}
}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a

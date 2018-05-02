package BigJavaCh04;

public class Triangle {
	
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private double x3;
	private double y3;
	//private double dis1;
	//private double dis2;
	//private double dis3;
	
	public Triangle(Point point1, Point point2, Point point3) {

		x1 = point1.getX();
		y1 = point1.getY();
		x2 = point2.getX();
		y2 = point2.getY();
		x3 = point3.getX();
		y3 = point3.getY();
		
	}
	
	public double getLength1() {
		double dis1 = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2) *(y1-y2));
		return dis1;
		
	}
	public double getLength2() {
		double dis2 = Math.sqrt((x2-x3)*(x2-x3) + (y2-y3) *(y2-y3));
		return dis2;
	}
	
	public double getLength3() {
		double dis3 = Math.sqrt((x1-x3)*(x1-x3) + (y1-y3) *(y1-y3));
		return dis3;
	}

	public double getPerimeter() {
		
		double perimeter = this.getLength1() + this.getLength2() + this.getLength3();
		return perimeter;
	}
	
	public double getAngle3() {
		
		double angle3 = Math.acos((this.getLength1()*this.getLength1() + this.getLength2()*this.getLength2() 
		-this.getLength3()*this.getLength3())/(2.0*this.getLength1()*this.getLength2()));
		return angle3;
	}
	public double getAngle2() {
		
		double angle2 = Math.acos((this.getLength1()*this.getLength1() + this.getLength3()*this.getLength3() 
		-this.getLength2()*this.getLength2())/(2.0*this.getLength1()*this.getLength3()));
		return angle2;
	}
	
	public double getAngle1() {
		
		double angle1 = Math.acos((this.getLength3()*this.getLength3() + this.getLength2()*this.getLength2() 
		-this.getLength1()*this.getLength1())/(2.0*this.getLength3()*this.getLength2()));
		return angle1;
	}
	public double getArea() {
		
		double area = this.getLength1()*this.getLength2()*Math.sin(this.getAngle3())/2;
		return area;
	}
}

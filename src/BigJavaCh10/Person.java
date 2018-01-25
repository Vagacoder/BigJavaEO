package BigJavaCh10;

public class Person implements Measurable{

	String name;
	double height;

	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	
	public double getMeasure() {
		return height;
	}
	
	

}

package BigJavaCh03;

public class RoachTester {

	public static void main(String[] args) {
		
		RoachPopulation roach = new RoachPopulation(10);
		
		roach.breed();
		roach.breed();
		roach.spray(10);
		roach.breed();
		
		System.out.println(roach.getRoach());
		

	}

}

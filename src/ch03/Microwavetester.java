package ch03;

public class Microwavetester {

	public static void main(String[] args) {
		
		Microwave micro = new Microwave();
		
		micro.addTime();
		micro.addTime();
		micro.changePower();
		micro.changePower();
		micro.changePower();
		micro.reset();
		micro.start();

	}

}

package BigJavaCh03;

public class NewHelloWorldTester {

	public static void main(String[] args) {
	
		NewHelloWorld Dave = new NewHelloWorld("Dave");
		NewHelloWorld Mary = new NewHelloWorld("Mary");
		
		System.out.println(Dave.sayHello(Mary));
		System.out.println(Dave.sayGoodBye(Mary));
		System.out.println(Dave.refuseHelp(Mary));

	}

}

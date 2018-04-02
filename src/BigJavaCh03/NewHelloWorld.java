<<<<<<< HEAD
package BigJavaCh03;

public class NewHelloWorld {
	
	private String name;
	private String greet = "Hello";
	private String bye = "Goodbye";
	
	public NewHelloWorld(String name) {
		
		this.name = name;
	}
	
	
	public String sayHello(NewHelloWorld name) {
		
		return greet + ", " + name.name;
	}
	
	public String sayGoodBye(NewHelloWorld name) {
		
		return bye + ", " + name.name;
	}
	
	public String refuseHelp(NewHelloWorld name) {
		
		return "I am sorry, " +name.name +". I am afraid I can't do that.";
	}
}
=======
package BigJavaCh03;

public class NewHelloWorld {
	
	private String name;
	private String greet = "Hello";
	private String bye = "Goodbye";
	
	public NewHelloWorld(String name) {
		
		this.name = name;
	}
	
	
	public String sayHello(NewHelloWorld name) {
		
		return greet + ", " + name.name;
	}
	
	public String sayGoodBye(NewHelloWorld name) {
		
		return bye + ", " + name.name;
	}
	
	public String refuseHelp(NewHelloWorld name) {
		
		return "I am sorry, " +name.name +". I am afraid I can't do that.";
	}
}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a

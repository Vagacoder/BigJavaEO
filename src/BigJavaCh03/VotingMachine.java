<<<<<<< HEAD
package BigJavaCh03;

public class VotingMachine {

	private int demo;
	private int rep;
	
	public VotingMachine() {
		
		demo = 0;
		rep = 0;
		
	}
	
	public void voteDemo() {
		
		demo =demo +1;
	}
	
	public void voteRep() {
		
		rep = rep +1;
		
	}
	public void reset() {
		
		demo = 0;
		rep = 0;
	}
	
	public void getResults() {
		
		System.out.println("Democrat is: " + demo);
		System.out.println("Republican is: " + rep);
	}
	
}
=======
package BigJavaCh03;

public class VotingMachine {

	private int demo;
	private int rep;
	
	public VotingMachine() {
		
		demo = 0;
		rep = 0;
		
	}
	
	public void voteDemo() {
		
		demo =demo +1;
	}
	
	public void voteRep() {
		
		rep = rep +1;
		
	}
	public void reset() {
		
		demo = 0;
		rep = 0;
	}
	
	public void getResults() {
		
		System.out.println("Democrat is: " + demo);
		System.out.println("Republican is: " + rep);
	}
	
}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a

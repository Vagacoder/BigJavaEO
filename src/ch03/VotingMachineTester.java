package ch03;

public class VotingMachineTester {

	public static void main(String[] args) {

		VotingMachine VM1 = new VotingMachine();
				
		VM1.voteDemo();VM1.voteDemo();VM1.voteDemo();VM1.voteDemo();
		VM1.voteRep();VM1.voteRep();VM1.voteRep();
		
		VM1.getResults();
	}

}

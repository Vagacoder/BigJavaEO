package ch07;

public class DiceAnalyzer {
	public static void main(String[] args) {
		final int SIDES = 6;
		Dice dice = new Dice(SIDES);
		dice.countInputs();
		dice.printCounters();
	}
}

package BigJavaCh05;

public class Card {

	private String suit;
	private String number;
	private int length;

	public Card(String input) {

		length = input.length();
		suit = input.substring(length - 1, length);
		number = input.substring(0, length - 1);

	}

	public String getDesciption() {

		String suitFullName = "";
		String numberFullName = "";
		if (suit.equals("D")) {
			suitFullName = "Diamonds";
		} else if (suit.equals("H")) {
			suitFullName = "Hearts";
		} else if (suit.equals("S")) {
			suitFullName = "Spades";
		} else if (suit.equals("C")) {
			suitFullName = "Clubs";
		}

		if (number.equals("A")) {
			numberFullName = "Ace";
		} else if (number.equals("J")) {
			numberFullName = "Jack";
		} else if (number.equals("Q")) {
			numberFullName = "Queen";
		} else if (number.equals("K")) {
			numberFullName = "King";
		} else if (number.compareTo("1") > 0 && number.compareTo("9") <= 0) {
			numberFullName = number;
		} else if (number.equals("10")) {
			numberFullName = number;
		}

		String description = numberFullName + " of " + suitFullName;

		if (suitFullName.isEmpty() || numberFullName.isEmpty()) {
			description = "Unknown";
		}

		return description;
	}
}

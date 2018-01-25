package BigJavaCh05;

import java.util.*;

public class CardTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the card:");
		String input = in.next();
		Card newCard = new Card(input);
		System.out.println(newCard.getDesciption());

	}

}

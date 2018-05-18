package ch02;

import java.util.*;

public class DiceSimulator {

	public static void main(String[] args) {
		Random dice = new Random();
		System.out.print("Your first dice is: ");
		System.out.println(dice.nextInt(6) + 1);
		System.out.print("Your second dice is: ");
		System.out.println(dice.nextInt(6) + 1);

	}

}

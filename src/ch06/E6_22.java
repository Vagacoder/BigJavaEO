package ch06;

import java.util.*;

public class E6_22 {

	public static void main(String[] args) {

		int originChoice = 0;
		int changeChoice = 0;
		int car = 0;
		int player = 0;
		int host = 0;

		for (int i = 1; i <= 1000; i++) {
			car = new Random().nextInt(3) + 1;

			player = new Random().nextInt(3) + 1;

			do {
				host = new Random().nextInt(3) + 1;
			} while (!(host != car && host != player));

			if (player == car) {
				originChoice++;
			}
			if (player != car) {
				changeChoice++;
			}
		}

		System.out.printf("Player stick to orignial choice, win#: %d\n", originChoice);
		System.out.printf("Player switching to third door, win#: %d\n", changeChoice);

	}

}

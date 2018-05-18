package ch06;

import java.util.*;

public class R6_32 {

	public static void main(String[] args) {
		int friend;
		int california = 0;
		int nevada = 0;
		int utah = 0;
		for (int i = 1; i <= 100; i++) {
			friend = new Random().nextInt(15);
			if (friend >= 0 && friend < 10) {
				california++;
			} else if (friend >= 10 && friend < 13) {
				nevada++;
			} else if (friend >= 13 && friend < 15) {
				utah++;
			}
		}

		System.out.printf("The California is %.2f\n", california / 100.0);
		System.out.printf("The Nevada is %.2f\n", nevada / 100.0);
		System.out.printf("The Utah is %.2f\n", utah / 100.0);
	}

}

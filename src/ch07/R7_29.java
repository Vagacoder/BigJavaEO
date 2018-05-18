package ch07;

import java.util.*;

public class R7_29 {

	public static void main(String[] args) {
		int ROWS = 5;
		int COLUMNS = 6;
		int[][] table = new int[ROWS][COLUMNS];
		int sum = 0;

		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				table[i][j] = 0;
			}
		}

		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				table[i][j] = (i + j) % 2;
			}
		}
		for (int i = 0; i < ROWS; i++) {
			if (i == 0 || i == ROWS - 1) {
				for (int j = 0; j < COLUMNS; j++) {
					table[i][j] = 0;
				}
			}
		}

		// print table
		for (int i = 0; i < ROWS; i++) {
			System.out.println(Arrays.toString(table[i]));
		}

		// sum all
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				sum += table[i][j];
			}
		}
		System.out.println(sum);
	}

}

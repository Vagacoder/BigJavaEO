package ch07;

import java.util.*;

public class TableSumTester {

	public static void main(String[] args) {

		final int ROW = 6;
		final int COL = 5;

		TableSum t1 = new TableSum(ROW, COL);

		for (int i = 0; i < ROW; i++)
			{
				for (int j = 0; j < COL; j++)
					{
						t1.set(i, j, new Random().nextInt(100));
					}
			}

		System.out.println(t1.getNeighborAverage(1, 4));
		System.out.println(t1.sum(0, false));
	}

}

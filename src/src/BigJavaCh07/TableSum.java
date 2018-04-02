package BigJavaCh07;

import java.util.*;

public class TableSum {

	private int[][] values;

	public TableSum(int row, int column) {
		values = new int[row][column];
	}

	public void set(int i, int j, int n) {
		values[i][j] = n;
	}

	public double getNeighborAverage(int row, int column) {

		int sum = 0;
		int rowStartIndex = row - 1;
		int rowEndIndex = row + 1;
		int colStartIndex = column - 1;
		int colEndIndex = column + 1;
		int count = 0;

		if (row == 0)
			{
				rowStartIndex++;
			}
		if (row == values.length - 1)
			{
				rowEndIndex--;
			}
		if (column == 0)
			{
				colStartIndex++;
			}
		if (column == values[0].length - 1)
			{
				colEndIndex--;
			}

		for (int i = rowStartIndex; i <= rowEndIndex; i++)
			{
				for (int j = colStartIndex; j <= colEndIndex; j++)
					{
						sum += values[i][j];
						count++;
					}
			}

		for (int i = 0; i < values.length; i++)
			{
				System.out.println(Arrays.toString(values[i]));
			}
		System.out.println(sum);

		return sum * 1.0 / count;
	}

	public double sum(int i, boolean horizontal) {

		int sum = 0;

		if (horizontal)
			{
				for (int j = 0; j < values[0].length; j++)
					{
						sum += values[i][j];
					}

			}

		else
			{
				for (int row = 0; row < values.length; row++)
					{
						sum += values[row][i];
					}
			}
		return sum;
	}
}

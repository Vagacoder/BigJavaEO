package BigJavaCh07;

import java.util.*;

public class E7_18 {

	public static void main(String[] args) {

		ArrayList<Integer> numberList = new ArrayList<>();

		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number (Q for finish): ");
		while (in.hasNextInt())
			{
				int input = in.nextInt();
				numberList.add(input);
			}

		in.close();

		for (int i : numberList)
			{

				for (int j = 0; j < i; j++)
					{
						System.out.print("*");

					}
				System.out.println();
			}
	}

}

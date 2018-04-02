package BigJavaCh07;

import java.util.*;

public class E7_19 {

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

		int largest = numberList.get(0);

		for (int i : numberList)
			{
				if (i > largest)
					{
						largest = i;
					}
			}

		double starPerOne = 20.0 / largest;
		System.out.println(largest);

		for (int i = 20; i > 0; i--)
			{
				for (int j = 0; j < numberList.size(); j++)
					{
						if (numberList.get(j) * starPerOne >= i)
							{
								System.out.print("*");
							}
						else
							{
								System.out.print(" ");
							}

					}
				System.out.println();
			}
	}

}

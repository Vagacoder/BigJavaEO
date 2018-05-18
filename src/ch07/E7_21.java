package ch07;

import java.util.*;

public class E7_21 {

	public static void main(String[] args) {

		ArrayList<Integer> numberList = new ArrayList<>();
		ArrayList<String> nameList = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		Scanner in1 = new Scanner(System.in);
		System.out.print("Please enter a number (Q for finish): ");
		while (in.hasNextInt())
			{
				int input = in.nextInt();
				numberList.add(input);
			}

		in.next();
		System.out.print("Please enter a name (0 for finish): ");
		while (in.hasNext())
			{

				String input = in.next();
				if (input.equals("0"))
					{
						break;
					}
				nameList.add(input);
			}

		in.close();
		in1.close();

		for (int i = 0; i < numberList.size(); i++)
			{
				System.out.printf("%s: ", nameList.get(i));
				for (int j = 0; j < numberList.get(i); j++)
					{
						System.out.print("*");

					}
				System.out.println();
			}
	}

}

package Others;

import java.util.*;

public class RandomPrice {

	public static void main(String[] args) {
		double r1 = new Random().nextInt(96);
		//System.out.println(r1);
		double price1 = r1/100;
		double final_price = 10.0 + price1;
		System.out.println(final_price);

	}

}

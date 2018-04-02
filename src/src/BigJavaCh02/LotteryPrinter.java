package BigJavaCh02;

import java.awt.*;
import java.util.*;

public class LotteryPrinter {

	public static void main(String[] args) {
		
		System.out.println("Play this combination, it’ll make you rich!");
		System.out.println("The first number is: " + new LotteryRandom().random49());
		System.out.println("The second number is: " + new LotteryRandom().random49());
		System.out.println("The third number is: " + new LotteryRandom().random49());
		System.out.println("The fourth number is: " + new LotteryRandom().random49());
		System.out.println("The fifth number is: " + new LotteryRandom().random49());
		System.out.println("The sixth number is: " + new LotteryRandom().random49());
		
		
	}

}

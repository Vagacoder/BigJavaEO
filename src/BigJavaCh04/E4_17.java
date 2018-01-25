package BigJavaCh04;

import java.util.*;

public class E4_17 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("please enter the first time: ");
		int firstTime = in.nextInt();
		System.out.print("please enter the second time: ");
		int secondTime = in.nextInt();
		
		int time_difference = (new E4_17miliTime(secondTime)).readTime() - 
				(new E4_17miliTime(firstTime)).readTime();
		
		System.out.println(time_difference);
		
		int hour = (time_difference + 24*60)%(24*60)/60;
		int minute = (time_difference + 24*60)%(24*60) % 60;
		
		System.out.printf("%s hours %s minutes\n", hour, minute);
		
		in.close();
	}

}

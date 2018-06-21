package ch14;

import java.time.LocalTime;

public class Times {

	public static void main(String[] args) {
	
		long start = System.nanoTime();
		System.out.println(start);
		
		long anotherTime = System.currentTimeMillis();
		System.out.println(anotherTime);

		LocalTime start1 = java.time.LocalTime.now();
		System.out.println(start1);
	}

}

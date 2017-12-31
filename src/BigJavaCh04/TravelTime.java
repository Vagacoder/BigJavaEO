package BigJavaCh04;

import java.util.*;

public class TravelTime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Distance to item along x-axis: ");
		double xDistance = in.nextDouble();
		System.out.print("Distance to item along y-axis: ");
		double yDistance = in.nextDouble();
		System.out.print("Length of segment 1: ");
		double segment1Length = in.nextDouble();
		System.out.print("Speed along segment 1: ");
		double segment1Speed = in.nextDouble();
		System.out.print("Speed along segment 2: ");
		double segment2Speed = in.nextDouble();

		double segment1Time = segment1Length / segment1Speed;
		double segment2Length = Math.sqrt(Math.pow(xDistance - segment1Length, 2) + Math.pow(yDistance, 2));
		double segment2Time = segment2Length / segment2Speed;
		double totalTime = segment1Time + segment2Time;

		System.out.println("Total time: " + totalTime);
	}
}

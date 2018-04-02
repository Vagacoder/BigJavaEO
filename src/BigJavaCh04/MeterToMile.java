package BigJavaCh04;

import java.util.*;

public class MeterToMile {

	public static void main(String[] args) {

		final double MILE_TO_METER = 1609.34;
		final double FEET_TO_METER = 0.3048;
		final double INCH_TO_METER = 0.0254;

		System.out.print("Please enter meter: ");
		Scanner newIn = new Scanner(System.in);

		double inputMeter = newIn.nextDouble();

		System.out.printf("%.2f meters equal %.4f miles.\n", inputMeter, (inputMeter / MILE_TO_METER));
		System.out.printf("%.2f meters equal %.2f feet.\n", inputMeter, (inputMeter / FEET_TO_METER));
		System.out.printf("%.2f meters equal %.2f inches.\n", inputMeter, (inputMeter / INCH_TO_METER));

	}

}

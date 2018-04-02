package cs105finalQ8;

import java.util.*;

public class SumStrategy implements AggregationStrategy {

	@Override
	public double calculate(List<Double> data) {

		double sum = 0;
		for (double number : data) {
			sum += number;
		}

		return sum;
	}

}

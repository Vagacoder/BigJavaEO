package cs105finalQ8;

import java.util.*;

public class AverageStrategy implements AggregationStrategy {

	@Override
	public double calculate(List<Double> data) {

		double sum = 0;
		int count = 0;
		for (int i = 0; i < data.size(); i++) {
			sum += data.get(i);
			count++;
		}

		if (count == 0) {
			return 0;
		} else {
			return sum / count;
		}
	}

}

package cs105finalQ8;

import java.util.*;

public class Aggregator {

	AggregationStrategy aggregationStrategy;
	ArrayList<Double> numberSet;

	public Aggregator(AggregationStrategy strategy) {
		aggregationStrategy = strategy;
		numberSet = new ArrayList<Double>();
	}

	public void addDouble(double value) {

		numberSet.add(value);

	}

	public double getResult() {

		return aggregationStrategy.calculate(numberSet);

	}

}

package cs105finalQ8;

public class Program {

	public static void main(String[] args) {

		SumStrategy sum = new SumStrategy();
		AverageStrategy ave = new AverageStrategy();

		Aggregator agSum = new Aggregator(sum);
		Aggregator agAve = new Aggregator(ave);

		agSum.addDouble(10.9);
		agSum.addDouble(20.5);
		agSum.addDouble(59.5);
		System.out.printf("Expected: 90.9, Actual: %.1f\n", agSum.getResult());

		agAve.addDouble(40.1);
		agAve.addDouble(60.4);
		agAve.addDouble(100.3);
		System.out.printf("Expected: 66.933, Actual: %.3f\n", agAve.getResult());

		Aggregator agSum1 = new Aggregator(sum);
		System.out.printf("Expected: 0.0, Actual: %.1f\n", agSum1.getResult());

		Aggregator agAve1 = new Aggregator(ave);
		System.out.printf("Expected: 0.0, Actual: %.1f\n", agAve1.getResult());
	}

}

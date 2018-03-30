package BigJavaCh13;

public class EvaluatorTester {

    public static void main(String[] args) {
	// Evaluator ev = new Evaluator("3*4+5*12");
	// int value = ev.getExpressionValue();
	// System.out.println(value);

	Evaluator2 ev = new Evaluator2("2^3*4");
	int value = ev.getExpressionValue();
	System.out.println(value);
    }

}

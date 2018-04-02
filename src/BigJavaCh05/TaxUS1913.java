<<<<<<< HEAD
package BigJavaCh05;

public class TaxUS1913 {
	
	final double STEP1 = 50_000;
	final double STEP2 = 75_000;
	final double STEP3 = 100_000;
	final double STEP4 = 250_000;
	final double STEP5 = 500_000;
	
	final double RATE1 = 1;
	final double RATE2 = 2;
	final double RATE3 = 3;
	final double RATE4 = 4;
	final double RATE5 = 5;
	final double RATE6 = 6;
	
	private double income;
	private double tax;
	
	public TaxUS1913(double income) {
	
		this.income = income;
		
	}
	
	public double getTax()
	{
		if (income <= STEP1) {tax = income * RATE1/100;}
		else if (income <= STEP2) {tax = STEP1 * RATE1/100 + (income - STEP1) * RATE2/100;}
		else if (income <= STEP3) {tax = STEP1 * RATE1/100 + (STEP2 - STEP1) * RATE2/100 
				+ (income -STEP2) * RATE3/100 ;}
		else if (income <= STEP4) {tax = STEP1 * RATE1/100 + (STEP2 - STEP1) * RATE2/100 
				+ (STEP3 - STEP2) * RATE3/100 +(income -STEP3) * RATE4/100 ;}
		else if (income <= STEP5) {tax = STEP1 * RATE1/100 + (STEP2 - STEP1) * RATE2/100 
				+ (STEP3 - STEP2) * RATE3/100 +(STEP4 -STEP3) * RATE4/100 +
				(income- STEP4) * RATE5/100;}
		else if (income >STEP5) {tax = STEP1 * RATE1/100 + (STEP2 - STEP1) * RATE2/100 
				+ (STEP3 - STEP2) * RATE3/100 +(STEP4 -STEP3) * RATE4/100 +
				(STEP5- STEP4) * RATE5/100 + (income - STEP5) * RATE6/100;}
		return tax;
	}

}
=======
package BigJavaCh05;

public class TaxUS1913 {
	
	final double STEP1 = 50_000;
	final double STEP2 = 75_000;
	final double STEP3 = 100_000;
	final double STEP4 = 250_000;
	final double STEP5 = 500_000;
	
	final double RATE1 = 1;
	final double RATE2 = 2;
	final double RATE3 = 3;
	final double RATE4 = 4;
	final double RATE5 = 5;
	final double RATE6 = 6;
	
	private double income;
	private double tax;
	
	public TaxUS1913(double income) {
	
		this.income = income;
		
	}
	
	public double getTax()
	{
		if (income <= STEP1) {tax = income * RATE1/100;}
		else if (income <= STEP2) {tax = STEP1 * RATE1/100 + (income - STEP1) * RATE2/100;}
		else if (income <= STEP3) {tax = STEP1 * RATE1/100 + (STEP2 - STEP1) * RATE2/100 
				+ (income -STEP2) * RATE3/100 ;}
		else if (income <= STEP4) {tax = STEP1 * RATE1/100 + (STEP2 - STEP1) * RATE2/100 
				+ (STEP3 - STEP2) * RATE3/100 +(income -STEP3) * RATE4/100 ;}
		else if (income <= STEP5) {tax = STEP1 * RATE1/100 + (STEP2 - STEP1) * RATE2/100 
				+ (STEP3 - STEP2) * RATE3/100 +(STEP4 -STEP3) * RATE4/100 +
				(income- STEP4) * RATE5/100;}
		else if (income >STEP5) {tax = STEP1 * RATE1/100 + (STEP2 - STEP1) * RATE2/100 
				+ (STEP3 - STEP2) * RATE3/100 +(STEP4 -STEP3) * RATE4/100 +
				(STEP5- STEP4) * RATE5/100 + (income - STEP5) * RATE6/100;}
		return tax;
	}

}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a

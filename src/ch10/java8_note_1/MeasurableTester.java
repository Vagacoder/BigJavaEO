package ch10.java8_note_1;

/**
 * This program demonstrates a static method of the Measurable interface.
 */
public class MeasurableTester {
    public static void main(String[] args) {
	// Calling the static average method
	// with an array of BankAccount objects

	Measurable[] accounts = new Measurable[3];
	accounts[0] = new BankAccount(0);
	accounts[1] = new BankAccount(10000);
	accounts[2] = new BankAccount(2000);

	double averageBalance = Measurable.average(accounts);
	System.out.println("Average balance: " + averageBalance);
	System.out.println("Expected: 4000");

	// Calling the static average method
	// with an array of Country objects

	Measurable[] countries = new Measurable[3];
	countries[0] = new Country("Uruguay", 176220);
	countries[1] = new Country("Thailand", 513120);
	countries[2] = new Country("Belgium", 30510);

	double averageArea = Measurable.average(countries);
	System.out.println("Average area: " + averageArea);
	System.out.println("Expected: 239950");
    }
}

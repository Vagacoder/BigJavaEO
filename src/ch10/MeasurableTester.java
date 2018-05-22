package ch10;

/**
 * This program demonstrates the measurable BankAccount and Country classes.
 */
public class MeasurableTester {
	public static void main(String[] args) {
		// Calling the average method with an array of BankAccount objects
		Measurable[] accounts = new Measurable[3];
		accounts[0] = (Measurable) new BankAccount(0);
		accounts[1] = (Measurable) new BankAccount(10000);
		accounts[2] = (Measurable) new BankAccount(2000);

		double averageBalance = Data.average(accounts);
		System.out.println("Average balance: " + averageBalance);
		System.out.println("Expected: 4000");

		// Calling the average method with an array of Country objects
		Measurable[] countries = new Measurable[3];
		countries[0] = new Country("Uruguay", 176220);
		countries[1] = new Country("Thailand", 513120);
		countries[2] = new Country("Belgium", 30510);

		double averageArea = Data.average(countries);
		System.out.println("Average area: " + averageArea);
		System.out.println("Expected: 239950");

		System.out.println(Data.max(accounts).getMeasure());
		System.out.println(Data.max(countries).getMeasure());

		Measurable[] quiz = new Measurable[3];
		quiz[0] = new Quiz(90, "A");
		quiz[1] = new Quiz(66, "D");
		quiz[2] = new Quiz(80, "B");

		double averageScore = Data.average(quiz);
		System.out.println(averageScore);
		System.out.println(Data.max(quiz).getMeasure());

		Measurable[] persons = new Measurable[3];
		persons[0] = new Person("Alex", 1.90);
		persons[1] = new Person("Bob", 1.80);
		persons[2] = new Person("Dave", 1.85);

		System.out.println(Data.average(persons));
		System.out.println(Data.max(persons).getName());
	}
}

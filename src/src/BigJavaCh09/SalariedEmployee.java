package BigJavaCh09;

/**
 * A salaried employee is paid the same amount independent of the hours worked.
 */
public class SalariedEmployee extends Employee {
	private double annualSalary;

	/**
	 * Constructs a salaried employee with a given name and annual salary.
	 * 
	 * @param name
	 *            the name of this employee
	 * @param salary
	 *            the annual salary
	 */
	public SalariedEmployee(String name, double salary) {
		setName(name);
		annualSalary = salary;
	}

	public double weeklyPay(int hoursWorked) {
		final int WEEKS_PER_YEAR = 52;
		return annualSalary / WEEKS_PER_YEAR;
	}
}

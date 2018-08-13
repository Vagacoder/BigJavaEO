package ch15;

/*
 * This class shows step by step, how to turn a single function method to a multi-function method
 * by using inner class -> anonymous class -> lambda expression 
 */
import java.util.*;
import java.util.function.*;

public class RosterTest {

	interface CheckPerson {
		boolean test(Person p);
	}

	// Approach 1: Create Methods that Search for Persons that Match One
	// Characteristic
	// This approach can potentially make your application brittle, which is the
	// likelihood of an application not working because of the introduction of
	// updates (such as newer data types).

	public static void printPersonsOlderThan(List<Person> roster, int age) {
		for (Person p : roster) {
			if (p.getAge() >= age) {
				p.printPerson();
			}
		}
	}

	// Approach 2: Create More Generalized Search Methods. This is is more generic
	// than first one

	public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
		for (Person p : roster) {
			if (low <= p.getAge() && p.getAge() < high) {
				p.printPerson();
			}
		}
	}

	// Approach 3: Specify Search Criteria Code in a Local Class
	// Don't have to rewrite methods if we change the structure of the Person.
	// But still need write a new interface and a local class for each search

	public static void printPersons(List<Person> roster, CheckPerson tester) {
		for (Person p : roster) {
			if (tester.test(p)) {
				p.printPerson();
			}
		}
	}

	// Local class for approach 3
	class CheckPersonEligibleForSelectiveService implements CheckPerson {
		public boolean test(Person p) {
			return p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
		}
	}

	// when use this class,
	// call: printPersons(roster, new CheckPersonEligibleForSelectiveService());

	// Approach 4: Specify Search Criteria Code in an Anonymous Class
	// We could combine Local class, and call: printPerson() to an anonymous class
	// like below.
	// we call: printPersons(
	// roster, new CheckPerson() {
	// public boolean test(Person p) {
	// return p.getGender() == Person.Sex.MALE
	// && p.getAge() >= 18
	// && p.getAge() <= 25;
	// }
	// }
	// );

	// Doing above (anonymous class instead of inner class) reduces coding amount.
	// However, the syntax of anonymous classes is bulky considering that the
	// CheckPerson interface contains only one method.

	// Approach 5: Specify Search Criteria Code with a Lambda Expression
	//
	// printPersons(
	// roster, (Person p) -> p.getGender() == Person.Sex.MALE
	// && p.getAge() >= 18 && p.getAge() <= 25);

	// Approach 6: Use Standard Functional Interfaces with Lambda Expressions

	public static void printPersonsWithPredicate(List<Person> roster, Predicate<Person> tester) {
		for (Person p : roster) {
			if (tester.test(p)) {
				p.printPerson();
			}
		}
	}

	// Approach 7: Use Lambda Expressions Throughout Your Application

	public static void processPersons(List<Person> roster, Predicate<Person> tester, Consumer<Person> block) {
		for (Person p : roster) {
			if (tester.test(p)) {
				block.accept(p);
			}
		}
	}

	// Approach 7, second example

	public static void processPersonsWithFunction(List<Person> roster, Predicate<Person> tester,
			Function<Person, String> mapper, Consumer<String> block) {
		for (Person p : roster) {
			if (tester.test(p)) {
				String data = mapper.apply(p);
				block.accept(data);
			}
		}
	}

	// Approach 8: Use Generics More Extensively

	public static <X, Y> void processElements(Iterable<X> source, Predicate<X> tester, Function<X, Y> mapper,
			Consumer<Y> block) {
		for (X x : source) {
			if (tester.test(x)) {
				Y y = mapper.apply(x);
				block.accept(y);
			}
		}
	}

	public static void main(String... args) {

		List<Person> roster = Person.createRoster();

		for (Person p : roster) {
			p.printPerson();
		}

		// Approach 1: Create Methods that Search for Persons that Match One
		// Characteristic

		System.out.println("Persons older than 20:");
		printPersonsOlderThan(roster, 20);
		System.out.println();

		// Approach 2: Create More Generalized Search Methods

		System.out.println("Persons between the ages of 14 and 30:");
		printPersonsWithinAgeRange(roster, 14, 30);
		System.out.println();

		// Approach 3: Specify Search Criteria Code in a Local Class

		System.out.println("Persons who are eligible for Selective Service:");

		@SuppressWarnings("hiding")
		class CheckPersonEligibleForSelectiveService implements CheckPerson {
			public boolean test(Person p) {
				return p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
			}
		}

		printPersons(roster, new CheckPersonEligibleForSelectiveService());

		System.out.println();

		// Approach 4: Specify Search Criteria Code in an Anonymous Class

		System.out.println("Persons who are eligible for Selective Service " + "(anonymous class):");

		printPersons(roster, new CheckPerson() {
			public boolean test(Person p) {
				return p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
			}
		});

		System.out.println();

		// Approach 5: Specify Search Criteria Code with a Lambda Expression

		System.out.println("Persons who are eligible for Selective Service " + "(lambda expression):");

		printPersons(roster, (Person p) -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25);

		System.out.println();

		// Approach 6: Use Standard Functional Interfaces with Lambda
		// Expressions

		System.out.println("Persons who are eligible for Selective Service " + "(with Predicate parameter):");

		printPersonsWithPredicate(roster,
				q -> q.getGender() == Person.Sex.MALE && q.getAge() >= 18 && q.getAge() <= 25);

		System.out.println();

		// Approach 7: Use Lamba Expressions Throughout Your Application

		System.out.println(
				"Persons who are eligible for Selective Service " + "(with Predicate and Consumer parameters):");

		processPersons(roster, p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25,
				p -> p.printPerson());

		System.out.println();

		// Approach 7, second example

		System.out.println("Persons who are eligible for Selective Service "
				+ "(with Predicate, Function, and Consumer parameters):");

		processPersonsWithFunction(roster,
				p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25, p -> p.getEmailAddress(),
				email -> System.out.println(email));

		System.out.println();

		// Approach 8: Use Generics More Extensively

		System.out.println("Persons who are eligible for Selective Service " + "(generic version):");

		processElements(roster, x -> x.getGender() == Person.Sex.MALE && x.getAge() >= 18 && x.getAge() <= 25,
				x -> x.getEmailAddress(), email -> System.out.println(email));

		System.out.println();

		// Approach 9: Use Bulk Data Operations That Accept Lambda Expressions
		// as Parameters

		System.out.println("Persons who are eligible for Selective Service " + "(with bulk data operations):");

		roster.stream().filter(p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25)
				.map(p -> p.getEmailAddress()).forEach(email -> System.out.println(email));
	}
}

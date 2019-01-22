package ch08;

import static org.junit.Assert.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EarthquakeTester {

	private static double score = 0;

	@BeforeAll
	public static void beforeTest() {
		score = 0;
	}

	@AfterAll
	public static void afterTest() {
		System.out.println(score);
	}

	@Test
	public void eqTest() {

		Earthquake eq1 = new Earthquake(8.0);
		assertEquals("Test 8.0", "Most structures fall", eq1.getDescription());
		score += 2;
	}

	@Test
	public void eqTest1() {
		Earthquake eq2 = new Earthquake(7.0);
		assertEquals("Test 7.0", "Many buildings destroyed", eq2.getDescription());
		score += 1;
	}
}

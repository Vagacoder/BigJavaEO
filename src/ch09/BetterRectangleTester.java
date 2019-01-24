package ch09;

import static org.junit.Assert.*;

import org.junit.Test;
//import org.junit.jupiter.api.Test;

public class BetterRectangleTester {

	@Test
	public void test() {

		BetterRectangle rec1 = new BetterRectangle(10, 20, 50, 30);
		assertEquals(1500.0, rec1.getArea(), 10E-14);
		assertEquals(160.0, rec1.getPerimeter(), 10E-14);

		BetterRectangle1 rec2 = new BetterRectangle1(30, 40, 200, 100);
		assertEquals(20000.0, rec2.getArea(), 10E-14);
		assertEquals(600.0, rec2.getPerimeter(), 10E-14);
	}

}

package BigJavaCh08;

import static org.junit.Assert.*;

import org.junit.*;

public class TaxReturnTester {

	public static final double EPSILON = 10E-14;

	@Test
	public void test1() {

		TaxReturn tr1 = new TaxReturn(80000, 2);
		assertEquals(10400, tr1.getTax(), EPSILON);
	}

	@Test
	public void test2() {

		TaxReturn tr2 = new TaxReturn(32000, 1);
		assertEquals(3200, tr2.getTax(), EPSILON);
	}

}

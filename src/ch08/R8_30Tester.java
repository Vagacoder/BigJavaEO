package ch08;

import static org.junit.Assert.*;

import java.io.*;

import org.junit.Test;
//import org.junit.jupiter.api.Test;

public class R8_30Tester {

	@Test
	public void test1() throws FileNotFoundException {

		R8_30 t1 = new R8_30();

		assertEquals("a", t1.readFile());
	}

}

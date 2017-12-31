package BigJavaCh08;

import static org.junit.Assert.*;

import org.junit.*;

public class StudentTerst {

	public static final double EPSILON = 10E-14;

	@Test

	public void test1() {
		Student s1 = new Student(3);
		s1.addScore(99);
		s1.addScore(90);
		s1.addScore(91);
		assertEquals(280.0, s1.sum(), EPSILON);

	}

	@Test
	public void test2() {
		Student s2 = new Student(2);
		assertEquals(true, s2.addScore(81));
		assertEquals(true, s2.addScore(90));
		assertEquals(false, s2.addScore(91));
	}

	@Test
	public void test3() {
		Student s3 = new Student(4);
		s3.addScore(90);
		s3.addScore(80);
		s3.addScore(70);
		s3.addScore(60);
		assertEquals(60.0, s3.minimum(), EPSILON);
		assertEquals(240, s3.finalScore(), EPSILON);

	}
}

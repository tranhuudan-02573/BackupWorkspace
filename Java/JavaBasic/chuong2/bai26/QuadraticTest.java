package bai26;

import junit.framework.TestCase;

public class QuadraticTest extends TestCase {
	public void testQuadratic() {
		new Quadratic(1, 3, 4);
		new Quadratic(3, 4, 5);
	}
	public void testComputeDenta() {
		assertEquals(new Quadratic(0.0, 3.0, 4.0).computeDenta(), 9.0);
		assertEquals(new Quadratic(3.0, 4.0, 5.0).computeDenta(), -44.0);
	}
	public void testWhatKind() {
		assertEquals("degenerate", new Quadratic(0, 3, 4).whatKind());
		assertEquals("none", new Quadratic(3, 4, 5).whatKind());
	}

}

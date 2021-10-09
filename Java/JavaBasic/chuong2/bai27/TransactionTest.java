package bai27;

import junit.framework.TestCase;

public class TransactionTest extends TestCase {
	public void testInterest() {
		assertEquals(300.0, new Transaction("thuy", 6000, 2).interest(), 0.001);
		assertEquals(112.5, new Transaction("mai", 2500, 1).interest(), 0.001);
		assertEquals(67.5, new Transaction("nam", 1500, 2).interest(), 0.001);
		assertEquals(20.0, new Transaction("tien", 500, 2).interest(), 0.001);
	}
	public void testPayBack() {
		assertEquals(60.0, new Transaction("thuy", 6000, 2).payBack(), 0.001);
		assertEquals(18.75, new Transaction("mai", 2500, 1).payBack(), 0.001);
		assertEquals(7.5, new Transaction("nam", 1500, 2).payBack(), 0.001);
		assertEquals(1.25, new Transaction("tien", 500, 2).payBack(), 0.001);
	}

}

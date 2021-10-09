package bai5_5;

import junit.framework.TestCase;

public class IlogTest extends TestCase {
	public void testMiles() {
		Entry e1 = new Entry(new Date(5, 5, 2005), 5.0, 25, "Good");
		Entry e2 = new Entry(new Date(6, 6, 2005), 3.0, 24, "Tired");
		Entry e3 = new Entry(new Date(23, 6, 2005), 26.0, 156, "Great");
		ILog l0 = new MTLog();
		ILog l1 = new ConsLog(e1, l0);
		ILog l2 = new ConsLog(e2, l1);
		ILog l3 = new ConsLog(e3, l2);
		assertEquals(l0.miles(6, 2005), 0.0);
		assertEquals(l1.miles(6, 2005), 0.0);
		assertEquals(l2.miles(6, 2005), 3.0);
		assertEquals(l3.miles(6, 2005), 29.0);
	}

	public void testMaxDistance() {
		Entry e1 = new Entry(new Date(5, 5, 2005), 5.0, 25, "Good");
		Entry e2 = new Entry(new Date(6, 6, 2005), 3.0, 24, "Tired");
		Entry e3 = new Entry(new Date(23, 6, 2005), 26.0, 156, "Great");
		ILog l0 = new MTLog();
		ILog l1 = new ConsLog(e1, l0);
		ILog l2 = new ConsLog(e2, l1);
		ILog l3 = new ConsLog(e3, l2);
		assertEquals(l0.maxDistance(), 0.0);
		assertEquals(l1.maxDistance(), 5.0);
		assertEquals(l2.maxDistance(), 5.0);
		assertEquals(l3.maxDistance(), 26.0);
	}

}

package SGK;

import junit.framework.TestCase;

public class MilkTest extends TestCase {
	ManuFactor manu = new ManuFactor("abc", "viet nam");
	Specification spec = new Specification(5, 8);
	Date date1 = new Date(1, 2, 2019);
	Date date = new Date(2, 2, 2022);
	Date date2 = new Date(2, 6, 2021);
	Milk milk = new Milk("bcd", 0.25, 7.000, date1, date2, manu, spec);
	Milk milk1 = new Milk("bcf", 0.3, 10000, date, date2, manu, spec);
	public void testSameCompany() {
		assertTrue(milk.sameCompany(milk));
	}
	public void testVolumn() {
		assertEquals(milk.volumn(), 628.3, 0.1);
	}
	public void testGreaterThan() {
		assertFalse(milk.greaterThan(milk));
	}
	public void testAfter() {
		assertTrue(milk.after(milk1));
	}
	public void testIsExpired() {
		assertTrue(milk.isExpired());
	}
	public void testdiscout() {
		assertEquals(milk1.discount(), 10000.0, 0.1);
	}
}

package bai46;

import junit.framework.TestCase;

public class ItemsTest extends TestCase{
		AItems items = new Package("cocktail", 35000, 0.5, "dau tay", "fronzen" );
		AItems items1 = new Package1("kem xoan oc", 10000, 0.24, "cam", "sorbet" );
		AItems items2 = new Coffee("thai nguyen", 75000, 0.8, "decaffeinated");
	public void testUnitPrice() {
		assertEquals(items.unitPrice(), 70000, 0.01 );
		assertEquals(items2.unitPrice(), 93750, 0.01);
		assertEquals(items1.unitPrice(), 41666.6, 0.1);
	}
	public void testLowerPrice() {
		assertTrue(items.lowerPrice(80000));
		assertFalse(items1.lowerPrice(40000));
		assertTrue(items2.lowerPrice(100000));
	}
	public void testCheaperThan() {
		assertTrue(items.cheaperThan(items2));
		assertFalse(items2.cheaperThan(items1));
		assertFalse(items.cheaperThan(items1));	
	}
	

}

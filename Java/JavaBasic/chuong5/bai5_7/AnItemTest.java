package bai5_7;

import junit.framework.TestCase;

public class AnItemTest extends TestCase {

	public void testUnitPrice() {
		AAnItem ic1 = new IceCream("Hanoi", 300.0, 10000.0, "orange", "medium");
		AAnItem j1 = new Juice("Saigon", 400.0, 500000.0, "apple", "medium");
		AAnItem c1 = new Coffee("Hanoi", "Highlands", 30.0, 100000.0);
		assertEquals(ic1.unitPrice(), 33.33D, 0.01);
		assertEquals(j1.unitPrice(), 1250.0D, 0.01);
		assertEquals(c1.unitPrice(), 3333.33D, 0.01);
	}

	public void testLowerPrice() {
		AAnItem ic1 = new IceCream("Hanoi", 300.0, 10000.0, "orange", "medium");
		AAnItem j1 = new Juice("Saigon", 400.0, 500000.0, "apple", "medium");
		AAnItem c1 = new Coffee("Hanoi", "Highlands", 30.0, 100000.0);
		assertTrue(ic1.lowerPrice(50.0));
		assertFalse(j1.lowerPrice(1000.0));
		assertTrue(c1.lowerPrice(4000.0));
	}

	public void testCheaperThan() {
		AAnItem ic1 = new IceCream("Hanoi", 300.0, 10000.0, "orange", "medium");
		AAnItem j1 = new Juice("Saigon", 400.0, 500000.0, "apple", "medium");
		AAnItem c1 = new Coffee("Hanoi", "Highlands", 30.0, 100000.0);
		assertTrue(ic1.cheaperThan(c1));
		assertFalse(j1.cheaperThan(ic1));
		assertFalse(c1.cheaperThan(j1));
	}

	public void testHowMany() {
		AAnItem ic1 = new IceCream("Hanoi", 300.0, 10000.0, "orange", "medium");
		AAnItem j1 = new Juice("Saigon", 400.0, 500000.0, "apple", "medium");
		AAnItem c1 = new Coffee("Hanoi", "Highlands", 30.0, 100000.0D);
		IList empty = new MTList();
		ConsList l1 = new ConsList(ic1, empty);
		ConsList l2 = new ConsList(j1, l1);
		ConsList l3 = new ConsList(c1, l2);
		assertEquals(l3.howMany(), 3);
	}

	public void testBrandName() {
		AAnItem ic1 = new IceCream("Hanoi", 300.0, 10000.0, "orange", "medium");
		AAnItem j1 = new Juice("Saigon", 400.0, 500000.0, "apple", "medium");
		AAnItem c1 = new Coffee("Thai", "Highlands", 30.0, 100000.0);
		IList empty = new MTList();
		ConsList l1 = new ConsList(ic1, empty);
		ConsList l2 = new ConsList(j1, l1);
		ConsList l3 = new ConsList(c1, l2);
		assertEquals(l3.brandList().getName(), "Hanoi\nHighlands\nSaigon\n");
	}

	public void testHighestPrice() {
		AAnItem ic1 = new IceCream("Hanoi", 300.0, 10000.0, "orange", "medium");
		AAnItem j1 = new Juice("Saigon", 400.0, 500000.0, "apple", "medium");
		AAnItem c1 = new Coffee("Hanoi", "Highlands", 30.0, 100000.0);
		IList empty = new MTList();
		ConsList l1 = new ConsList(ic1, empty);
		ConsList l2 = new ConsList(j1, l1);
		ConsList l3 = new ConsList(c1, l2);
		assertEquals(l3.highestPrice(), 500000.0D, 0.001);
	}
}

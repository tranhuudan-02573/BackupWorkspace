package bai47;

import junit.framework.TestCase;

public class TaxiVehicleTest extends TestCase{
		ATaxiVehicle cab1 = new Cab(2, 8, 20000);
		ATaxiVehicle van1 = new Van(3, 4, 50000, false);
		ATaxiVehicle limo1 = new Limo(4, 10, 100000, 200000);
	public void testFare() {
		assertEquals(cab1.fare(2), 40000, 0.01);
		assertEquals(van1.fare(3), 230000, 0.01);
		assertEquals(limo1.fare(1), 200000, 0.01);
	}
	public void testLowerPrice() {
		assertTrue(cab1.lowerPrice(1, 50000));
		assertFalse(van1.lowerPrice(5, 200000));
		assertFalse(limo1.lowerPrice(3, 100000));
	}
	public void testCheaperThan() {
		assertTrue(cab1.cheaperThan(2, van1));
		assertFalse(limo1.cheaperThan(2, cab1));
		assertTrue(van1.cheaperThan(3, limo1));		
	}
}

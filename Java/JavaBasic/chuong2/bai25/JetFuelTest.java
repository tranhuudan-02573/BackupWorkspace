package bai25;

import junit.framework.TestCase;

public class JetFuelTest extends TestCase {
	public void testJetFuel() {
		new JetFuel(120000, "good", 15);
		new JetFuel(1000, "good", 15);
	}
	public void tesTotalCost() {
		assertEquals(new JetFuel(120000, "good", 15).totalCost(), 1800000.0, 0.01);
		assertEquals(new JetFuel(1000, "good", 15).totalCost(), 15000.0, 0.01);
	}
	public void testDiscountPrice() {
		assertEquals(new JetFuel(120000, "good", 15).discountPrice(), 1620000, 0.01 );
		assertEquals(new JetFuel(1000, "good", 15).discountPrice(), 15000.0, 0.01 );
	}
}

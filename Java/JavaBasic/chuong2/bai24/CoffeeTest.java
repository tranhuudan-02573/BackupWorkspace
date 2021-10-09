package bai24;

import junit.framework.TestCase;

public class CoffeeTest extends TestCase {
	public void testCoffee() {
		new Coffee("trungNguyen", 5, 4000);
		new Coffee("vinacafe", 10, 11000);
	}
	public void testSale() {
		assertEquals(new Coffee("trungNguyen", 500, 4000).sale(), 500, 0.01);
		assertEquals(new Coffee("vinacafe", 1050, 11000).sale(), 945, 0.01);
	}

}

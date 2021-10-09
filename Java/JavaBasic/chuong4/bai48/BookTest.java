package bai48;

import junit.framework.TestCase;

public class BookTest extends TestCase {
		ABook sale1 = new Sale("toan", "tran van a", 30000, 2000);
		ABook paper1 = new Paperback("xanh", "tran van b", 15000, 1990);
		ABook hard1 = new Hardcover("vang", "trann van c", 20000, 1995);
	public void testSalePrice() {
		assertEquals(sale1.salePrice(), 15000, 0.01);
		assertEquals(paper1.salePrice(), 15000, 0.01);
		assertEquals(hard1.salePrice(), 16000, 0.01);
	}
	public void testCheaperThan() {
		assertFalse(sale1.cheaperThan(paper1));
		assertFalse(hard1.cheaperThan(paper1));
		assertTrue(paper1.cheaperThan(hard1));
	}
	public void testSameAuthor() {
		assertTrue(sale1.sameAuthor(sale1));
		assertFalse(paper1.sameAuthor(hard1));
		assertFalse(hard1.sameAuthor(sale1));
	}

}

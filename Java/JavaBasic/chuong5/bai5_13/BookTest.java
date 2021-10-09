package bai5_13;

import junit.framework.TestCase;

public class BookTest extends TestCase {

	public void testListBook() {
		ABook b1 = new Hardcover("RobinsonCrusoe", 15.5, 1719.0, "Daniel Defoe");
		ABook b3 = new Sale("HeartofDarkness", 12.8, 1902.0, "Joseph Conrad");
		ABook b2 = new Paperback("BeachMusic", 9.5, 1996.0, "Pat Conroy");
		IBook empty = new MTBook();
		IBook l1 = new ConsBook(b3, empty);
		IBook l2 = new ConsBook(b2, l1);
		IBook l3 = new ConsBook(b1, l2);
		assertEquals(l3.sort().toString(), "title: BeachMusic title: HeartofDarkness title: RobinsonCrusoe ");
	}

	public void testThisAuthor() {
		ABook b1 = new Hardcover("Robinson Crusoe", 15.5, 1719.0, "Daniel Defoe");
		ABook b3 = new Sale("Heart of Darkness", 12.8, 1902.0, "Joseph Conrad");
		ABook b2 = new Paperback("Beach Music", 9.5, 1996.0, "Pat Conroy");
		IBook empty = new MTBook();
		IBook l1 = new ConsBook(b3, empty);
		IBook l2 = new ConsBook(b2, l1);
		IBook l3 = new ConsBook(b1, l2);
		assertEquals(l3.thisAuthor("Daniel Defoe").toString(), "title: Robinson Crusoe ");
	}

	public void testCompareTitle() {
		ABook b1 = new Hardcover("Robinson Crusoe", 15.5, 1719.0, "Daniel Defoe");
		ABook b3 = new Sale("Heart of Darkness", 12.8, 1902.0, "Joseph Conrad");
		ABook b2 = new Paperback("Beach Music", 9.5, 1996.0, "Pat Conroy");
		IBook empty = new MTBook();
		IBook l1 = new ConsBook(b3, empty);
		IBook l2 = new ConsBook(b2, l1);
		IBook l3 = new ConsBook(b1, l2);
//		assertEquals(l3.sortByTitle(b1), new ConsBook(b2, new ConsBook(b3, new ConsBook(b1, new MTBook()))));
		assertEquals(l1.sortByTitle(b1), new ConsBook(b3, new ConsBook(b1, new MTBook())));
	}
}

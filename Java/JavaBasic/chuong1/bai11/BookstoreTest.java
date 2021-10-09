package bai11;

import junit.framework.TestCase;

public class BookstoreTest extends TestCase{
	public void testBookstore() {
		new Bookstore("daniel Defoe", 1719, 15.50, "robinson crusoe" );
		new Bookstore("joseph Conrad", 1902, 12.80, "heart of Darkness");
		new Bookstore("pat controy", 1906, 9.50, "beach music");
	}

}

package bai5_2;

import junit.framework.TestCase;

public class BookStoreTest extends TestCase {
	public void testBookStore() {
		Book b1 = new Book("Daniel Defoe", "Robinson Crusoe", 1550, 1719);
		Book b2 = new Book("Joseph Conrad", "Heart of Darkness", 1280, 1902);
		Book b3 = new Book("Pat Conroy", "Beach Music", 950, 1996);

		IBookStore s1 = new MTBookStore();
		IBookStore s2 = new ConsBookStore(b1, s1);
		IBookStore s3 = new ConsBookStore(b2, s2);
		IBookStore s4 = new ConsBookStore(b3, s3);
		System.out.println("danh sach 1: " + s4);
		IBookStore s5 = new MTBookStore();
		IBookStore s6 = new ConsBookStore(b1, s5);
		IBookStore s7 = new ConsBookStore(b3, s6);
		System.out.println("danh sach 2 : " + s7);

	}
}

package bai32;

import junit.framework.TestCase;

public class BookStoreTest extends TestCase{
	    Author author1 = new Author("job", 1818);
		Author author2 = new Author("teven", 1990);
		BookStore bookstore1 = new BookStore("RobinsonCrusoe", 15.50, 2003, author1);
		BookStore bookstore2 = new BookStore("HeartOfDarkness", 12.80, 1902, author2);
	public void testCurrentBook() {
		assertTrue(bookstore1.currentBook());
		assertFalse(bookstore2.currentBook());	
	}
	public void testCurrentAuthor() {
		assertFalse(bookstore1.currentAuthor());
		assertTrue(bookstore2.currentAuthor());
	}
	public void testThisAuthor() {
		assertTrue(bookstore1.thisAuthor(author1));		
		assertFalse(bookstore1.thisAuthor(author2));
	}	
	public void testSameAuthor() {
		assertTrue(bookstore1.sameAuthor(bookstore1));
		assertFalse(bookstore1.sameAuthor(bookstore2));
	}
	public void testSameGeneration() {
		assertFalse(bookstore1.sameGeneration(bookstore2));
		assertFalse(bookstore1.sameGeneration(bookstore1));
	}
	
	
	
}

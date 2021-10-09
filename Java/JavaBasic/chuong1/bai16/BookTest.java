package bai16;

import junit.framework.TestCase;

public class BookTest extends TestCase {
	public void testAuthor() {
		new Author("job", 1818);
		new Author("teven", 1990);
	}
	public void testBook() {
		new Book("RobinsonCrusoe", 15.50, 1719, new Author("job", 1818));
		new Book("HeartOfDarkness", 12.80, 1902, new Author("teven", 1990));
	}

}

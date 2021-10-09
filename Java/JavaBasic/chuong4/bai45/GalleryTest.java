package bai45;
import junit.framework.TestCase;

public class GalleryTest extends TestCase {
		AGallery gallery1 = new Images("stored in flower.gif", 57.234, 100, 50, "medium");
		AGallery gallery2 = new Texts("stored in welcome.txt", 53.12, 830);
		AGallery gallery3 = new Sounds("stored in theme.mp3", 78.960, new PlayingTime(3, 20));	
	public void testTimeToDownload() {
		assertEquals(gallery1.timeToDownload(50), 1.14, 0.01 );
		assertEquals(gallery2.timeToDownload(100), 0.53, 0.01 );
		assertEquals(gallery3.timeToDownload(150), 0.52, 0.01);
	}
	public void smallerThan() {
		assertFalse(gallery1.smallerThan(40));
		assertTrue(gallery2.smallerThan(60));
		assertTrue(gallery3.smallerThan(80));
	}
	public void sameName() {
		assertFalse(gallery1.sameName("stored in welcome.txt"));
		assertTrue(gallery3.sameName("stored in theme.mp"));
		assertFalse(gallery2.sameName("stored in theme.mp3"));	
	}

}

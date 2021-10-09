package bai42;

import junit.framework.TestCase;

public class GalleryTest extends TestCase {
	public void testAGallery() {
		AGallery gallery1 = new Images("stored in flower.gif", 57.234, 100, 50, "medium");
		AGallery gallery2 = new Texts("stored in welcome.txt", 5312, 830);
		AGallery gallery3 = new Sounds("stored in theme.mp3", 40960, new PlayingTime(3, 20));
		
		
	}

}

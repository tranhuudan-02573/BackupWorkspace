package bai23;

import junit.framework.TestCase;

public class ImageTest extends TestCase{
	public void testImage() {
		new Image(20, 30, "hoaLy", "good");
	}
	public void testIsPortrait() {
		assertTrue(new Image(20, 30, "hoaLy", "good").isPortrait());
	}
	public void testSize() {
		assertEquals(new Image(20, 30, "hoaLy", "good").size(), 600);
	}
	public void testIsLager() {
		assertFalse(new Image(20, 30, "hoaLy", "good").isLarger(new Image(40, 30, "hoaHong", "good")));
	}
	public void testSizeString() {
		assertEquals(new Image(20, 30, "hoaLy", "good").sizeString(), "small");
	}
}

package bai5_10;

import junit.framework.TestCase;

public class ShapeTest extends TestCase {

	public void testArea() {
		CartPt loc1 = new CartPt(3, 4);
		AShape c1 = new Circle(loc1, 4);
		AShape s1 = new Square(loc1, 6);
		AShape r1 = new Rectangles(loc1, 10, 20);
		AShape d1 = new Dot(loc1);
		assertEquals(c1.area(), 50.265, 0.001);
		assertEquals(s1.area(), 36.0, 0.001);
		assertEquals(r1.area(), 200.0, 0.001);
		assertEquals(d1.area(), 0.0, 0.01);
	}

	public void testDistanceToO() {
		CartPt loc1 = new CartPt(3, 4);
		AShape c1 = new Circle(loc1, 4);
		assertEquals(c1.distanceToO(), 5.0, 0.001);
	}

	public void testContains() {
		CartPt loc1 = new CartPt(3, 4);
		CartPt loc2 = new CartPt(5, 3);
		AShape c1 = new Circle(loc1, 4);
		assertFalse(c1.contains(loc2));
	}

	public void testBoundingBox() {
		IShape s1 = new Square(new CartPt(4, 3), 40);
		CartPt loc1 = new CartPt(6, 9);
		AShape c1 = new Circle(loc1, 10);
		assertEquals(c1.boundingBox(), new Rectangles(loc1, 20, 20));
		assertEquals(s1.boundingBox(), new Rectangles(new CartPt(4, 3), 40, 40));
	}

	public void testPerimeter() {
		CartPt loc1 = new CartPt(3, 4);
		AShape c1 = new Circle(loc1, 4);
		AShape s1 = new Square(loc1, 6);
		AShape r1 = new Rectangles(loc1, 10, 20);
		AShape d1 = new Dot(loc1);
		assertEquals(c1.perimeter(), 25.132D, 0.001);
		assertEquals(s1.perimeter(), 24.0D, 0.001);
		assertEquals(r1.perimeter(), 60.0D, 0.001);
		assertEquals(d1.perimeter(), 1.0D, 0.01);
	}
}

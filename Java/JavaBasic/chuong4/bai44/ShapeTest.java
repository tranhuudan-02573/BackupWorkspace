package bai44;

import junit.framework.TestCase;

public class ShapeTest extends TestCase {
		CartPt cart1 = new CartPt(5, 2);
		CartPt cart2 = new CartPt(3, 4);
		IShape dot1 = new Dot(cart1);
		IShape dot2 = new Dot(cart2);
		IShape circle1 = new Circle(cart1, 2);
		IShape circle2 = new Circle(cart2, 3);
		IShape square1 = new Square(cart1, 4);
		IShape square2 = new Square(cart2, 5);
		IShape rec1 = new Rectangle(cart1, 4, 5);
		IShape rec2 = new Rectangle(cart2, 1, 2);
	public void testArea(){
		assertEquals(square1.area(), 16, 0.01);
		assertEquals(square2.area(), 25, 0.01);
		assertEquals(circle1.area(), 12.56, 0.01);
		assertEquals(circle2.area(), 28.27, 0.01);
		assertEquals(dot1.area(), 0, 0.01);
		assertEquals(dot2.area(), 0, 0.01);
		assertEquals(rec1.area(), 20, 0.01);
		assertEquals(rec2.area(), 2, 0.001);
	}
	public void testDistanceToO(){
		assertEquals(dot1.distanceToO(), 5.38, 0.01);
		assertEquals(dot2.distanceToO(), 5, 0.01);
		assertEquals(circle1.distanceToO(), 5.38, 0.01);
		assertEquals(circle2.distanceToO(), 5, 0.01);
		assertEquals(square1.distanceToO(), 5.38, 0.01);
		assertEquals(square2.distanceToO(), 5, 0.01);
		assertEquals(rec1.distanceToO(), 5.38, 0.01);
		assertEquals(rec2.distanceToO(), 5, 0.01);
	}
	public void testContains(){
		assertFalse(dot1.contains(cart2));
		assertTrue(circle1.contains(cart1));
		assertFalse(square1.contains(cart2));
		assertTrue(rec1.contains(cart1));
		assertFalse(rec2.contains(cart1));
	}
	public void testBoundingBox(){
		assertEquals(square1.boundingBox(), new Square(cart1, 4));
		assertEquals(rec1.boundingBox(), new Square(cart1, 4));
		assertEquals(rec2.boundingBox(), new Square(cart2, 1));
		assertEquals(dot1.boundingBox(), new Square(cart1, 0));
		assertEquals(dot2.boundingBox(), new Square(cart2, 0));
		assertEquals(circle1.boundingBox(), new Square(new CartPt(3, 0), 4));
		assertEquals(circle2.boundingBox(), new Square(new CartPt(0, 1), 6));
		assertEquals(square2.boundingBox(), new Square(cart2, 5));
	}
	public void testBoundingBoxx() {
		assertEquals(square1.boundingBoxx(), new Rectangle(cart1, 4, 4));
		assertEquals(square2.boundingBoxx(), new Rectangle(cart2, 5, 5));
		assertEquals(rec1.boundingBoxx(), new Rectangle(cart1, 4, 5));
		assertEquals(rec2.boundingBoxx(), new Rectangle(cart2, 1, 2));
		assertEquals(dot1.boundingBoxx(), new Rectangle(cart1, 0, 0));
		assertEquals(dot2.boundingBoxx(), new Rectangle(cart2, 0, 0));
		assertEquals(circle1.boundingBoxx(),  new Rectangle(cart1, 4, 4));
		assertEquals(circle2.boundingBoxx(),  new Rectangle(cart2, 6, 6));
	}
	public void testPerimeter() {
		assertEquals(dot1.perimeter(), 1, 0.01);
		assertEquals(dot2.perimeter(), 1, 0.01);
		assertEquals(circle1.perimeter(), 12.56, 0.01);
		assertEquals(circle2.perimeter(), 18.84, 0.01);
		assertEquals(square1.perimeter(), 16, 0.01);
		assertEquals(square2.perimeter(), 20, 0.01);
		assertEquals(rec1.perimeter(), 18, 0.01);
		assertEquals(rec2.perimeter(), 6, 0.01);
	}
	
}



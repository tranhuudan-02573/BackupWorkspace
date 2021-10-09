package restUnion3;

import junit.framework.TestCase;

public class ShapeTest extends TestCase{
	public void testContructor() {
		IShape s2 = new Square(new CartPt(3, 4), 50);
		IShape s1 = new Square(new CartPt(4, 3), 40);
		IShape c1 = new Circle(new CartPt(0, 0), 20);
		IShape c2 = new Circle(new CartPt(12, 5), 20);
		IShape d1 = new Dot(new CartPt(12, 5));
		IShape d2 = new Dot(new CartPt(22, 1));
		
		IShape u1 = new CompositeShape(d1, c2);
		IShape u2 = new CompositeShape(s2, u1);
		IShape u3 = new CompositeShape(s1, u2);
		IShape u4 = new CompositeShape(s2, u3);
		IShape u5 = new CompositeShape(c1, new CompositeShape(d2, u4));
		System.out.println(u5);
	}

}

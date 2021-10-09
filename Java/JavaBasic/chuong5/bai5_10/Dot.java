package bai5_10;



public class Dot extends AShape {
	// constructor
	public Dot(CartPt loc) {
		super(loc);
	}

	public double area() {
		return 0.0;
	}

	public double distanceToO() {
		return this.loc.distanceToO();
	}

	public boolean contains(CartPt point) {
		return this.loc.getX() == point.getX() && this.loc.getY() == point.getX();
	}

	public Rectangles boundingBox() {
		return new Rectangles(this.loc, 0, 0);
	}

	public double perimeter() {
		return 1.0;
	}
	
}

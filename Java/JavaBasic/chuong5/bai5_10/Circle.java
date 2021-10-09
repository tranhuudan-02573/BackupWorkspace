package bai5_10;



public class Circle extends AShape {
	private int radius;

	// constructor
	public Circle(CartPt loc, int radius) {
		super(loc);
		this.radius = radius;
	}

	// getter and setter
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getThisX() {
		return thisX;
	}

	public void setThisX(int thisX) {
		this.thisX = thisX;
	}

	public int getThisY() {
		return thisY;
	}

	public void setThisY(int thisY) {
		this.thisY = thisY;
	}

	public double area() {
		return (this.radius * this.radius) * Math.PI;
	}

	public double distanceToO() {
		return this.loc.distanceToO();
	}

	private int thisX = this.loc.getX();
	private int thisY = this.loc.getY();

	public boolean contains(CartPt point) {

		return isBetween1(point) && isBetween2(point);
	}

	public boolean isBetween2(CartPt point) {
		return ShapeUtils.between(point.getY(), thisY, thisY + this.radius);
	}

	public boolean isBetween1(CartPt point) {
		return ShapeUtils.between(point.getX(), thisX, thisX + this.radius);
	}

	public Rectangles boundingBox() {
		return new Rectangles(this.loc, this.radius * 2, this.radius * 2);
	}

	public double perimeter() {
		return (this.radius * 2) * Math.PI;
	}
	public boolean equals(Object o) {
		if (o == null || !(o instanceof Circle)) {
			return false;
		} else {
			Circle tmp = (Circle) o;
			return this.radius==(tmp.radius) ;
		}
	}
}

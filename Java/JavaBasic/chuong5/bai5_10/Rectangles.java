
package bai5_10;

public class Rectangles extends AShape {
	private int height;
	private int width;

	// constructor
	public Rectangles(CartPt loc, int height, int width) {
		super(loc);
		this.height = height;
		this.width = width;
	}

	// getter and setter
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

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return this.height;
	}

	public int getWidth() {
		return this.width;
	}

	public double area() {
		return (double) (this.height * this.width);
	}

	public double distanceToO() {
		return this.loc.distanceToO();
	}

	int thisX = this.loc.getX();
	int thisY = this.loc.getY();

	public boolean contains(CartPt point) {

		return isBetween1(point) && isBetween2(point);
	}

	public boolean isBetween2(CartPt point) {
		return ShapeUtils.between(point.getY(), thisY, thisY + this.height);
	}

	public boolean isBetween1(CartPt point) {
		return ShapeUtils.between(point.getX(), thisX, thisX + this.width);
	}

	public Rectangles boundingBox() {
		return new Rectangles(this.loc, this.height, this.width);
	}

	public double perimeter() {
		return  ((this.height + this.width) * 2);
	}
	public boolean equals(Object o) {
		if (o == null || !(o instanceof Rectangles)) {
			return false;
		} else {
			Rectangles tmp = (Rectangles) o;
			return this.height==(tmp.height) && this.width==(tmp.width);
		}
	}

}

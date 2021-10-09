package bai5_10;



public class Square extends AShape {
	private int size;
	// constructor
	public Square(CartPt loc, int size) {
		super(loc);
		this.size = size;
	}
	// getter and setter
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double area() {
		return (double) (this.size * this.size);
	}

	public double distanceToO() {
		return this.loc.distanceToO();
	}

	public boolean contains(CartPt point) {
		return isBetween1(point) && isBetween2(point);
	}

	public boolean isBetween2(CartPt point) {
		return ShapeUtils.between(point.getY(), this.loc.getY(), this.loc.getY());
	}

	public boolean isBetween1(CartPt point) {
		return ShapeUtils.between(point.getX(), this.loc.getX(), this.loc.getX() + this.size);
	}

	public Rectangles boundingBox() {
		return new Rectangles(this.loc, this.size, this.size);
	}

	public double perimeter() {
		return  (this.size * 4);
	}
	public boolean equals(Object o) {
		if (o == null || !(o instanceof Square)) {
			return false;
		} else {
			Square tmp = (Square) o;
			return this.size==(tmp.size) ;
		}
	}
}
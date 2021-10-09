
package bai5_10;

public abstract class AShape implements IShape {
	// constructor
	protected CartPt loc;
	
	// getter and setter
	public CartPt getLoc() {
		return loc;
	}

	public void setLoc(CartPt loc) {
		this.loc = loc;
	}

	public AShape(CartPt loc) {
		this.loc = loc;
	}

	public abstract double area();

	public abstract double distanceToO();

	public abstract boolean contains(CartPt var1);

	public abstract Rectangles boundingBox();

	public abstract double perimeter();
}

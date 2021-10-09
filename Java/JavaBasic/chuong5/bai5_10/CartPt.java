package bai5_10;



public class CartPt {
	private int x;
	private int y;

	// constructor
	public CartPt(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// getter and setter
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public double distanceToO() {
		return Math.sqrt((double) (this.x * this.x + this.y * this.y));
	}

	public double distanceTo(CartPt that) {
		return Math.sqrt(((this.x - that.x) * (this.x - that.x) + (this.y - that.y) * (this.y - that.y)));
	}

	public void translate(int dx, int dy) {
		
	}
	public boolean equals(Object o) {
		if (o == null || !(o instanceof CartPt)) {
			return false;
		} else {
			CartPt tmp = (CartPt) o;
			return this.x==(tmp.x) && this.y==(tmp.y);
		}
	}

}

package restUnion3;

public class CartPt {
	private int x;
	private int y;
	public CartPt(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String toString() {
		return "location: " + "(" + this.x + "," + this.y + ")";
	}

}

package bai44;

public class CartPt {// tọa độ
	private int x;
	private int y;
	// contructor
	public CartPt(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	// getter and setter
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
	// tính tọa độ từ 1 hình đến gốc tọa độ
	public double distanceToO() {
		return Math.sqrt(this.x*this.x + this.y*this.y);
	}
	//tính tọa độ từ 1 hình vừa dịch chuyển đến gốc tọa độ
	public double distanceTo(CartPt that) {
		double diffX = Math.abs(this.x-that.x);
		double diffY = Math.abs(this.y-that.y);
		return Math.sqrt(diffX*diffX + diffY*diffY);
	}
	// dịch chuyển tọa độ 1 điểm
	public CartPt translate(int dX, int dY) {
		return new CartPt(this.x + dX, this.y + dY);
	}
	// kiểm tra đối tượng đó có rỗng hay không phải là tọa độ không
	public boolean equals(Object obj) {
		if (null==obj || !(obj instanceof CartPt))
			return false;
		else {
			CartPt that = (CartPt) obj;
			return (this.x == that.x) && (this.y == that.y);
		}
	}
}

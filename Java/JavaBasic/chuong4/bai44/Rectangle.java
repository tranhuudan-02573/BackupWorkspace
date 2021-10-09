package bai44;

public class Rectangle extends AShape {// hình chữ nhật 
	private int width;// chiều dài 
	private int height;// chiều rộng
	// contructor
	public Rectangle(CartPt loc, int width, int height) {
		super(loc);
		this.width = width;
		this.height = height;
	}
	// getter and setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	// tính diện tích của hình chữ nhật 
	public double area() {
		return this.width * this.height;
	}
	// tính khoảng cách từ hình chữ nhật tới gốc tọa độ
	public double distanceToO() {
		return this.loc.distanceToO();
	}
	// kiểm tra 1 giá trị có nằm trong 1 khoảng không
	private boolean between(int value, int low, int hight) { 
		return (low <= value) && (value <= hight);
	}
	// kiểm tra xem 1 điểm có nằm trong hình chữ nhật không
	public boolean contains(CartPt point) {
		int thisX = this.loc.getX();
		int thisY = this.loc.getY();
		return this.between(point.getX(), thisX, thisX + this.width) && this.between(point.getY(), thisY, thisY + this.height);
	}
	// tạo 1 hình chữ nhật bỏ hình chữ nhật đó vào 
	public Rectangle boundingBoxx() {
		return new Rectangle(this.loc, this.width, this.height);
	}
	// tính chu vi hình chữ nhật
	public double perimeter() {
		return (this.width + this.height)*2;
	}
	// tạo 1 hình vuông bỏ hình chữ nhật đó vào 
	public Square boundingBox() {
		return new Square(this.loc, this.width);
	}
	// // kiểm tra đối tượng đó có rỗng hay không phải là hình chữ nhật không
	public boolean equals(Object obj) {
		if (null==obj || !(obj instanceof Rectangle))
			return false;
		else {
			Rectangle that = (Rectangle) obj;
			return (this.loc.equals(that.loc))
					&& (this.width == that.width)
					&& (this.height == that.height);
		}
	}
	
}

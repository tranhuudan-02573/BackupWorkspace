package bai44;

public class Circle extends AShape{// hình tròn 
	private int radius;// bán kính 
	// contructor
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
	// tính diện tính hình tròn
	public double area() {
		return this.radius*this.radius*Math.PI;
	}
	// tính khoảng cách từ hình tròn tới gốc tọa độ
	public double distanceToO() {
		return this.loc.distanceToO();
	}
	// kiểm tra 1 điểm có nằm trong hình tròn không
	public boolean contains(CartPt point) {
		return this.loc.distanceTo(point) <= this.radius;
	}
	// tạo 1 hình vuông bỏ hình tròn vào 
	public Square boundingBox() {
		return new Square(this.loc.translate(-this.radius, -this.radius), this.radius*2);
	}
	// tính chu vi hình tròn 
	public double perimeter() {
		return this.radius * 2 * Math.PI;
	}
	// tạo 1 hình chữ nhật bỏ hình tròn vào
	public Rectangle boundingBoxx() {
		return new Rectangle(this.loc, this.radius*2 , this.radius*2);
	}
	
}

package bai44;

public class Dot extends AShape{// điểm
	// contructor
	public Dot(CartPt loc) {
		super(loc);
	}
	// diện tích của 1 điểm bằng 0
	public double area() {
		return 0;
	}
	// tính khoảng cách từ điểm đó tới gốc tạo độ
	public double distanceToO() {
		return this.loc.distanceToO();
	}
	// 1 điểm không thể chứa điểm khác được
	public boolean contains(CartPt point) {
		return this.loc.distanceTo(point) == 0;
	}
	// tạo 1 hình vuông bỏ điểm đó vào cũng chính là điểm đó luôn
	public Square boundingBox() {
		return new Square(this.loc, 0);
	}
	// tính chu vi điểm đó bằng 1 
	public double perimeter() {
		return 1.0;
	}
	// tạo 1 hình chữ nhật bỏ điểm đó vào 
	public Rectangle boundingBoxx() {
		return new Rectangle(this.loc, 0, 0);
	}
	


}

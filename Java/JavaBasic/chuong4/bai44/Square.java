package bai44;

public class Square extends AShape {// hình vuông 
	private int size;// chiều dài, rộng 
	// contructor
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
	// tính diện tích hình vuông đó 
	public double area() {
		return this.size*this.size;
	}
	// tính khoảng cách từ hình vuông đó đến gốc tọa độ
	public double distanceToO() {
		return this.loc.distanceToO();
	}
	// kiểm tra 1 giá trị có nằm trong 1 khoảng không
	private boolean between(int value, int low, int hight) { 
		return (low <= value) && (value <= hight);
	}
	// kiểm tra 1 điểm có nằm trong hình vuông đó không
	public boolean contains(CartPt point) {
		int x = this.loc.getX();
		int y = this.loc.getY();
		return this.between(point.getX(), x , x + this.size) && this.between(point.getY(), y, y + this.size);	
	}
	// tạo 1 hình vuông bỏ hình vuông đó vào 
	public Square boundingBox() {
		return new Square(this.loc, this.size);
	}
	// tính chu vi hình vuông 
	public double perimeter() {
		return this.size * 4;
	}
	// tạo 1 hình chữ nhật bỏ hình vuông đó vào 
	public Rectangle boundingBoxx() {
		return new Rectangle(this.loc, size, size);
	}
	// kiểm tra đối tượng đó có rỗng hay không phải là hình vuông không
	public boolean equals(Object obj) {
		if (null==obj || !(obj instanceof Square))
			return false;
		else {
			Square that = (Square) obj;
			return (this.loc.equals(that.loc))
					&& this.size == that.size;
		}
	}

	
}

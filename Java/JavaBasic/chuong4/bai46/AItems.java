package bai46;

public abstract class AItems implements IItems {// các mặt hàng trong cửa hàng tạp hóa 
	protected String name;// tên 
	protected int price;// giá bán 
	protected double weight;// trọng lượng 
	// contructor
	public AItems(String name, int price, double weight) {
		super();
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
	// tính tiền 
	public double unitPrice() {
		return this.price/this.weight;
	}
	// so sánh xem đơn giá đó có nhỏ hơn 1 số tiền nhất định không
	public boolean lowerPrice(double amount) {
		return this.unitPrice() < amount;
	}
	//so sánh xem 2 sản phẩm có đơn giá nào bé hơn 
	public boolean cheaperThan(AItems that) {
		return this.unitPrice() < that.unitPrice();
	}


}

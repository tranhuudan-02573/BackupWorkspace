package bai48;

public class Sale extends ABook {// sách giảm giá
	// contructor
	public Sale(String title, String author, double price, int publicationYear) {
		super(title, author, price, publicationYear);
	}
	// tính tiền
	public double salePrice() {
		return this.price * 0.5;
	}

}

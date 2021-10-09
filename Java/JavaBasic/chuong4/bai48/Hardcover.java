package bai48;

public class Hardcover extends ABook {// bìa cứng 
	// contructor
	public Hardcover(String title, String author, double price, int publicationYear) {
		super(title, author, price, publicationYear);
	}
	// tính tiền 
	public double salePrice() {
		return this.price * 0.8;
	}

}

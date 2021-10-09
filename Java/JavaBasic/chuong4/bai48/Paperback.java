package bai48;

public class Paperback extends ABook {// bìa mềm 
	// contructor
	public Paperback(String title, String author, double price, int publicationYear) {
		super(title, author, price, publicationYear);
	}
	// tính tiền
	public double salePrice() {
		return this.price ;
	}
	
}

package bai48;

public abstract class ABook implements IBook {// hiệu sách 
	protected String title;// tên sách 
	protected String author;// tên tác giả 
	protected double price;// giá tiền 
	protected int publicationYear;// năm xuất bản
	// conttructor
	public ABook(String title, String author, double price, int publicationYear) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publicationYear = publicationYear;
	}
	// getter and setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	public abstract double salePrice();
	// kiểm tra xem cuốn sách này có rẻ hơn cuốn sách kia không
	public boolean cheaperThan(ABook that) {
		return this.salePrice() < that.salePrice();
	}
	// kiểm tra xem sách này có được viết bởi 1 tác giả đã viết sách khác không
	public boolean sameAuthor(ABook that) {
		return this.author.equals(that.author);
	}
	
}

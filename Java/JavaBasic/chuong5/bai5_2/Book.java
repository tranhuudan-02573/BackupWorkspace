package bai5_2;

public class Book {
	private String title;
	private int price;
	private int year;
	private String nameAuthor;

	// constructor
	public Book(String nameAuthor, String title, int price, int year) {
		super();
		this.title = title;
		this.price = price;
		this.year = year;
		this.nameAuthor = nameAuthor;
	}

	// getter and setter
	public String getTitle() {
		return title;
	}

	public void setTittle(String tittle) {
		this.title = tittle;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getNameAuthor() {
		return nameAuthor;
	}

	public void setNameAuthor(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}

	// toString
	public String toString() {
		return "\ntitle: " + this.title + "\nprice: " + this.price + "\nyear: " + this.year + "\nnameAuthor: "
				+ this.nameAuthor;

	}

}

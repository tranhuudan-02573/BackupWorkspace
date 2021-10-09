package bai11;

public class Bookstore { // nhà sách
	private String bookTitle; // tên sách 
	private int year; // năm xuất bản 
	private double price; // giá sách
	private String name; // tên tác giả
	// contructor
	public Bookstore(String bookTitle, int year, double price, String name) { 
		super();
		this.bookTitle = bookTitle;
		this.year = year;
		this.price = price;
		this.name = name;
	}
	// getter and setter
	public String getBookTitle() { 
		return bookTitle; 
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

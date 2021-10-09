package bai32;

public class BookStore { // sách
	private String title; // tên sách 
	private double price; // giá bán
	private int year; // năm xuất bản
	private Author author; // tác giả
	// contructor
	public BookStore(String title, double price, int year, Author author) {
		this.title = title;
		this.price = price;
		this.year = year;
		this.author = author;
	}
	// getter and setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
			this.year = year;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	// kiểm tra xem sách được xuất bản trong năm 2003 hay 2004 
	public boolean currentBook() { 
		return (this.year == 2004) || (this.year == 2003); 
	}
	// kiểm tra sách này được viết bởi tác giả sinh trước năm 1940 không
	public boolean currentAuthor() { 
		return this.author.currentAuthor();
	}	
	// kiểm tra 1 sách được viết bởi 2 tác giả không
	public boolean thisAuthor(Author same) { 
		return this.author.same(same);
	}	
	// kiểm tra 2 sách được viết cùng 1 tác giả không
	public boolean sameAuthor(BookStore that) { 
		return this.author.same(that.author);
	}	
	// so sánh 2 sách được viết bởi 2 tác giả có độ tuổi chêch lệch nhau quá 10 không
	public boolean sameGeneration(BookStore same) { 
		return this.author.sameGeneration(same.author);
	}
	
	
}
	
	
	


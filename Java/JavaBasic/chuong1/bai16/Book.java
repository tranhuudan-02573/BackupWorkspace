package bai16;

public class Book { // sách
	private String title; // tên sách
	private double price; // giá bán
	private int year; // năm xuất bản
	private Author author; // tác giả
	// contructor
	public Book(String title, double price, int year, Author author) {
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
	
	
}

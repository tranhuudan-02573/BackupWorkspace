package bai5_4;

public class Parents {
	private String name;
	private int year;
	// constructor
	public Parents(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}
	// getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	// toString
	public String toString() {
		return this.name + "\nyear: " + this.year;
	}
	
}

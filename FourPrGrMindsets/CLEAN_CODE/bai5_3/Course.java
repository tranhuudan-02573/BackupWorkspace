package bai5_3;

public class Course {
	private int number;
	private String title;
	private int credits;
	// constructor
	public Course(int number, String title, int credits) {
		super();
		this.number = number;
		this.title = title;
		this.credits = credits;
	}
	// getter and setter
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
//	// toString
//	public String toString() {
//		return "\nnumber: " + this.number + "\ntitle: " + this.title + "\ncredits: " + this.credits;
//	}
	@Override
	public String toString() {
		return "[number=" + number + ", title=" + title + ", credits=" + credits + "]";
	}
	
	


}

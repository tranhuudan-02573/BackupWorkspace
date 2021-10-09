package bai5_9;

public class Course {
	private int number;
	private String title;
	private int credit;
	// constructor
	public Course(int number, String title, int credit) {
		this.number = number;
		this.title = title;
		this.credit = credit;
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

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getCredits() {
		return this.credit;
	}
}

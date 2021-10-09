package cau4_Swing;

public class Date {
	int day;
	int month;
	int year;

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return day + "/" + month + "/" + year;
	}
}

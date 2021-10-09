package bai5_11;

public class Date {
	private int day;
	private int month;
	private int year;
	// constructor
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	// getter and setter
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean compareDate(Date that) {
		if (compareYear1(that)) {
			return true;
		} else {
			if (compareYear2(that)) {
				if (compareMonth(that)) {
					return true;
				}

				if (compareDay(that)) {
					return true;
				}
			}

			return false;
		}
	}

	public boolean compareDay(Date that) {
		return this.month == that.month && this.day > that.day;
	}

	public boolean compareMonth(Date that) {
		return this.month > that.month;
	}

	public boolean compareYear2(Date that) {
		return this.year == that.year;
	}

	public boolean compareYear1(Date that) {
		return this.year > that.year;
	}

	public String getDate() {
		return this.day + "/" + this.month + "/" + this.year;
	}
}

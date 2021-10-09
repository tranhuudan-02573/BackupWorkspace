package bai5_5;

public class Date {
	private int day;
	private int month;
	private int year;
	// contructor

	public Date(int day, int month, int year) {
		super();
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

	// equals
	public boolean equals(Object o) {
		if (o == null || !(o instanceof Date)) {
			return false;
		} else {
			Date tmp = (Date) o;
			if (this.day == tmp.day && this.month == tmp.month && this.year == tmp.year) {
				return true;
			} else
				return false;
		}
	}

	// toString
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

	public boolean sameMonthInAyear(int month, int year) {
		if (isSameMonthAndYear(month, year))
			return true;
		else
			return false;
	}

	public boolean isSameMonthAndYear(int month, int year) {
		return this.month == month && this.year == year;
	}

}

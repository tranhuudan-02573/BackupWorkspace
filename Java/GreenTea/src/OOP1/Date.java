package OOP1;

public class Date {
	private int day;
	private int month;
	private int year;

	// constructor
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

	public String toString() {
		return "\ndate: " + this.day + "/" + this.month + "/" + this.year;
	}

	// equals
	public boolean equals(Object o) {
		if (o == null || !(o instanceof Date)) {
			return false;
		} else {
			Date tmp = (Date) o;
			return this.day == tmp.day && this.month == tmp.month && this.year == tmp.year;
		}
	}

}

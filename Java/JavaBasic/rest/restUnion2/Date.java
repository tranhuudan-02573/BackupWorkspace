package restUnion2;

public class Date {
	private int day;
	private int month;
	private int year;
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
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
		return this.day + "/" + this.month + "/" + this.year;
	}
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Date))
			return false;
		else {
			Date that = (Date) obj;
			return this.day == that.day && this.month == that.month && this.year == that.year;
		}
	}
}

package OOP5;

public class HiredDate {
	private int day;
	private int month;
	private int year;

	public HiredDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public boolean workingAfter(HiredDate that) {
		if (this.year > that.year)
			return true;
		if (this.year < that.year)
			return false;
		if (this.month > that.month)
			return true;
		if (this.month < that.month)
			return false;
		if (this.day > that.day)
			return true;
		return false;
	}

	public int workingYears(int toYear) {
		if (toYear > this.year) {
			return toYear - this.year;
		} else
			return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HiredDate other = (HiredDate) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[" + day + "/" + month + "/" + year + "]";
	}

}

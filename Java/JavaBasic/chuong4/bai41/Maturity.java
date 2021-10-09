package bai41;

public class Maturity { // thời gian gửi tiền 
	private int day; // ngày 
	private String month;// tháng 
	private int year;// năm
	// contructor
	public Maturity(int day, String month, int year) {
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
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	

}

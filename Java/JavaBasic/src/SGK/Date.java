package SGK;

public class Date {
	private int day;// ngày 
	private int month;// tháng 
	private int year;// năm
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
	// kiểm tra xem năm này có nhỏ hơn năm kia tháng này có nhỏ hơn tháng kia ngày này có nhỏ hơn ngày kia không
	public boolean after(Date that) {
		return (this.year <= that.year) && (this.month <= that.month) && (this.day <= that.day);
	}
	// so sánh 1 hộp sữa có hết hạn từ ngày 7 tháng 11 năm 2020 chưa
	public boolean isExpired() {
		return (this.year >2020) || (this.month > 11) || (this.day > 7);
	}
	// kiểm tra xem ngày tháng năm có nhỏ hơn 1 số cụ thể không
	public boolean compare() {
		return  ((this.year < 2018) && (this.month < 1) && (this.day < 1));	
	} 
	// kiểm tra xem ngày tháng năm có nhỏ hơn và lớn hơn 1 số cụ thể không
	public boolean comparee() {
		return ((this.year < 2019) && (this.month < 6) && (this.day < 1));
	} 
	// kiểm tra xem ngày tháng năm có lớn hơn 1 số cụ thể không
	public boolean compareee() {
		return ((this.year >= 2019) && (this.month >= 6) && (this.day >= 1));
	}
	

	

}

package bai34;

public class ClockTime { // thời gian
	private int hours; // giờ
	private int minutes; // phút
	// contructor
	public ClockTime(int hous, int minutes) {
		super();
		this.hours = hours;
		this.minutes = minutes;
	}
	// getter and setter
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	// so sánh xem giờ và phút ở thời điểm xuất phát này có bằng với giờ và phút ở thời điểm xuất phát kia không
	public boolean  timeStart(ClockTime that) { 
		return ((this.hours == that.hours) && (this.minutes == that.minutes));
	}
	// tính khoảng thời gian di chuyển
	public int howLong() { 
			return (this.hours - this.minutes/60);
		}
	

}
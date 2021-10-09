package bai18;

public class Time { // thời gian
	private int hour; // giờ
	private int minutes; // phút 
	// contructor
	public Time(int hour, int minutes) {
		this.hour = hour;
		this.minutes = minutes;
	}
	// getter and setter
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
		

}

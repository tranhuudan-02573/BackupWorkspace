package bai14;

public class Time { // thời gian
	private int hours; // giờ
	private int minutes; // phút 
	private int second; // giây
	// contructor
	public Time(int hours, int minutes, int second) {
		this.hours = hours;
		this.minutes = minutes;
		this.second = second;
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
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	
}

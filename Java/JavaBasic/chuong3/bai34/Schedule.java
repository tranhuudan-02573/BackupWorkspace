package bai34;

public class Schedule { // lịch trình
	private ClockTime timeLeaves; // thời điểm xuất phát 
	private ClockTime timeArrives; // thời điểm kết thúc
	// contructor
	public Schedule(ClockTime timeLeaves, ClockTime timeArrives) {
		super();
		this.timeLeaves = timeLeaves;
		this.timeArrives = timeArrives;
	}
	// getter and setter
	public ClockTime getTimeLeaves() { 
		return timeLeaves;
	}
	public void setTimeLeaves(ClockTime timeLeaves) {
		this.timeLeaves = timeLeaves;
	}
	public ClockTime getTimeArrives() {
		return timeArrives;
	}
	public void setTimeArrives(ClockTime time_arrives) {
		this.timeArrives = time_arrives;
	}
	// so sánh thời điểm xuất phát này có bằng với thời điểm xuất phát kia không
	public boolean timeStart(Schedule that) { 
		return ((this.timeLeaves) == (that.timeLeaves));
	}
	// tính khoảng thời gian đi được của chuyến tàu
	public int howLong() { 
		return Math.abs(this.timeArrives.howLong() - this.timeLeaves.howLong());
	}
	

	
}

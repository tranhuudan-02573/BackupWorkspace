package bai18;

public class Schedule { // lich trinh
	private Time timeLeaves; // thoi gian bat dau di
	private Time timeArrives; // thoi gian luc den
	// contructor
	public Schedule(Time timeLeaves, Time timeArrives) {
		super();
		this.timeLeaves = timeLeaves;
		this.timeArrives = timeArrives;
	}
	// getter and setter
	public Time getTimeLeaves() {
		return timeLeaves;
	}
	public void setTimeLeaves(Time timeLeaves) {
		this.timeLeaves = timeLeaves;
	}
	public Time getTimeArrives() {
		return timeArrives;
	}
	public void setTimeArrives(Time timeArrives) {
		this.timeArrives = timeArrives;
	}
	

	
	
}

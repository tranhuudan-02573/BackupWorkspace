package bai18;

public class Train { // chuyến tàu
	private Route route; // lộ trình
	private Schedule schedule; // lịch trình
	private boolean local; // địa phương nơi tàu đến
	// contructor
	public Train(Route route, Schedule schedule, boolean local) {
		super();
		this.route = route;
		this.schedule = schedule;
		this.local = local;
	}
	// getter and setter
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	public boolean isLocal() {
		return local;
	}
	public void setLocal(boolean local) {
		this.local = local;
	}
	
	
	

	
}

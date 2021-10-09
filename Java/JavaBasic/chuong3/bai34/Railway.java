package bai34;

public class Railway { // chuyến tàu
	private Route route; // lộ trình 
	private Schedule schedule; // lịch trình
	private boolean local; // địa phương mà tàu đó đến
	// contructor
	public Railway(Route route, Schedule schedule, boolean local) {
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
//  so sánh 2 lộ trình có giống nhau không
	public boolean destination(Railway that) {
		return this.route.equals(that.route);
	}	
	// so sánh 2 lịch trình có giống nhau không
	public boolean timeStart(Railway that) { 
		return ((this.schedule) == (that.schedule));
	}	
	// tính khoảng thời gian di chuyển từ lúc bắt đầu đến lúc kết thúc trong lịch trình 
	public int howLong() { 
		return this.schedule.howLong();
	}
	


}

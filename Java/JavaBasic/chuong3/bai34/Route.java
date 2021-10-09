package bai34;

public class Route { // lo trinh
	private String origin; // ga xuat phat
	private String destination; // ga dich
	// contructor
	public Route(String origin, String destination) {
		this.origin = origin;
		this.destination = destination;
	}
	// getter and setter
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	// so sánh xem ga đến của chuyến tàu này có trùng với ga đến của chuyến tàu kia hay không
	public boolean destination(Route that) { 
		return this.destination.equals(that.destination);
	}
	
}

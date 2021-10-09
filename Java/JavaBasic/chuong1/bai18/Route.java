package bai18;

public class Route { // lộ trình
	private String origin; // ga xuất phát
	private String destination; // ga đích
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
	
	
}

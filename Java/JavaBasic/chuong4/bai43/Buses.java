package bai43;

public class Buses extends AVehicle {// xe bus
	private String station;// bến của xe bus
	// contructor
	public Buses(String color, int chair, String station) {
		super(color, chair);
		this.station = station;
	}
	// getter and setter
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	
	

}

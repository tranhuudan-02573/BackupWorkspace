package bai5_14;

public class Mouth {
	private Location location;
	private ARiver river;
	// constructor
	public Mouth(Location location, ARiver river) {
		this.location = location;
		this.river = river;
	}
	// getter and setter
	public Location getLocation() {
		return this.location;
	}

	public ARiver getRiver() {
		return river;
	}

	public void setRiver(ARiver river) {
		this.river = river;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
}

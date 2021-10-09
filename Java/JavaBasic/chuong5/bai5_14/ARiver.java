package bai5_14;

public abstract class ARiver {
	protected Location location;
	protected double length;

	public ARiver(Location location, double length) {
		this.location = location;
		this.length = length;
	}

	public double getLength() {
		return this.length;
	}

	public abstract int countConfluence();

	public Location getLocation() {
		return this.location;
	}
}

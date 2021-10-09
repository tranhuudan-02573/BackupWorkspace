package bai5_14;

public class ConsListLocation implements IListLocation {
	private Location first;
	private IListLocation rest;
	// constructor
	public ConsListLocation(Location first, IListLocation rest) {
		this.first = first;
		this.rest = rest;
	}
	// getter and setter
	public Location getFirst() {
		return first;
	}
	public void setFirst(Location first) {
		this.first = first;
	}
	public IListLocation getRest() {
		return rest;
	}
	public void setRest(IListLocation rest) {
		this.rest = rest;
	}
	
}

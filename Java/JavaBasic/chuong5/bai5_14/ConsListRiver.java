package bai5_14;

public class ConsListRiver implements IListRiver {
	private ARiver first;
	private IListRiver rest;

	// constructor
	public ConsListRiver(ARiver first, IListRiver rest) {
		this.first = first;
		this.rest = rest;
	}

	// getter and setter
	public ARiver getFirst() {
		return first;
	}

	public void setFirst(ARiver first) {
		this.first = first;
	}

	public IListRiver getRest() {
		return rest;
	}

	public void setRest(IListRiver rest) {
		this.rest = rest;
	}

	public double maxLength() {
		return Math.max(this.first.getLength(), this.rest.maxLength());
	}

	public int confluences() {
		return this.first.countConfluence() + this.rest.confluences();
	}

	public IListLocation getLocation() {
		return new ConsListLocation(this.first.getLocation(), this.rest.getLocation());
	}
}

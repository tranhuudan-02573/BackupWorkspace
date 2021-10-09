package bai5_1;

public class ConsEstate implements IEstate {
	private House first;
	private IEstate rest;
	// constructor
	public ConsEstate(House first, IEstate rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	// getter and setter
	public House getFirst() {
		return first;
	}
	public void setFirst(House first) {
		this.first = first;
	}
	public IEstate getRest() {
		return rest;
	}
	public void setRest(IEstate rest) {
		this.rest = rest;
	}
	// toString
	public String toString() {
		return this.first.toString() + this.rest.toString();
	}
	

}

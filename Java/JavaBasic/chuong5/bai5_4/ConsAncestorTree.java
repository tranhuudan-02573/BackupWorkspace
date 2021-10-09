package bai5_4;

public class ConsAncestorTree implements IAncestorTree{
	private Person first;
	private IAncestorTree rest;
	// constructor
	public ConsAncestorTree(Person first, IAncestorTree rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	// getter and setter
	public Person getFirst() {
		return first;
	}
	public void setFirst(Person first) {
		this.first = first;
	}
	public IAncestorTree getRest() {
		return rest;
	}
	public void setRest(IAncestorTree rest) {
		this.rest = rest;
	}
	// toString
	public String toString() {
		return this.first.toString() + this.rest.toString();
	}
	
}

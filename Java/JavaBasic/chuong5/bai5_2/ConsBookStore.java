package bai5_2;

public class ConsBookStore implements IBookStore {
	private Book first;
	private IBookStore rest;

	// constructor
	public ConsBookStore(Book first, IBookStore rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	// getter and setter
	public Book getFirst() {
		return first;
	}

	public void setFirst(Book first) {
		this.first = first;
	}

	public IBookStore getRest() {
		return rest;
	}

	public void setRest(IBookStore rest) {
		this.rest = rest;
	}

	// toString
	public String toString() {
		return this.first.toString() + this.rest.toString();
	}

}

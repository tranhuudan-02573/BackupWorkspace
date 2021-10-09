package bai5_13;

public class ConsBook implements IBook {
	private ABook first;
	private IBook rest;

	// constructor
	public ConsBook(ABook first, IBook rest) {
		this.first = first;
		this.rest = rest;
	}

	// getter and setter
	public ABook getFirst() {
		return first;
	}

	public void setFirst(ABook first) {
		this.first = first;
	}

	public IBook getRest() {
		return rest;
	}

	public void setRest(IBook rest) {
		this.rest = rest;
	}

	public String toString() {
		return this.first.toString() + " " + this.rest.toString();
	}

	public IBook sort() {
		return this.rest.sort().sortByTitle(this.first);
	}

	public IBook thisAuthor(String thatName) {
		return (this.first.compareString(thatName) == 0 ? new ConsBook(this.first, this.rest.thisAuthor(thatName))
				: this.rest.thisAuthor(thatName));
	}

	public IBook sortByTitle(ABook that) {
		if (isCompareTitleGreater(that)) {
			return new ConsBook(that, this.rest.sortByTitle(this.first));

		} else if (isCompareTitleLess(that)) {
			return new ConsBook(this.first, this.rest.sortByTitle(that));
		}

		return this.rest.sortByTitle(that);
	}

	public boolean isCompareTitleGreater(ABook that) {
		return this.first.compareTitle(that) > 0;
	}

	public boolean isCompareTitleLess(ABook that) {
		return this.first.compareTitle(that) < 0;
	}

	public boolean equals(Object o) {
		if (o == null || !(o instanceof ConsBook)) {
			return false;
		} else {
			ConsBook tmp = (ConsBook) o;
			return this.first.equals(tmp.first) && this.rest.equals(tmp.rest);
		}
	}

}

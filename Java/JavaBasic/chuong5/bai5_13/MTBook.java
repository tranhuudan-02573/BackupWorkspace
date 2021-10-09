package bai5_13;

public class MTBook implements IBook {

	public IBook sort() {
		return new MTBook();
	}

	public IBook thisAuthor(String that) {
		return new MTBook();
	}

	public String toString() {
		return "";
	}

	public IBook sortByTitle(ABook that) {
		return new ConsBook(that, this.sort());
	}
}

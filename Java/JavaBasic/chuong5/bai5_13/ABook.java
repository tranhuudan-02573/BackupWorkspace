package bai5_13;


public abstract class ABook {
	protected String title;
	protected double price;
	protected double yearOfPublication;
	protected String authorName;
	// constructor
	public ABook(String title, double price, double yearOfPublication, String authorName) {
		this.title = title;
		this.price = price;
		this.yearOfPublication = yearOfPublication;
		this.authorName = authorName;
	}
	
	public int compareString(String that) {
		return this.authorName.compareTo(that);
	}

	public int compareTitle(ABook that) {
		return this.title.compareTo(that.title);
	}
	// toString
	public String toString() {
		return "title: " + this.title;
	}
	public boolean equals(Object o) {
		if (o == null || !(o instanceof ABook)) {
			return false;
		} else {
			ABook tmp = (ABook) o;
			return this.title.equals(tmp.title) && this.price==(tmp.price) && this.yearOfPublication == tmp.yearOfPublication && this.authorName.equals(tmp.authorName);
		}
	}
	
}
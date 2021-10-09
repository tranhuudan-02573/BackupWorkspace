package bai5_7;

public class ConsList implements IList {
	private AAnItem first;
	private IList rest;

	// constructor
	public ConsList(AAnItem first, IList rest) {
		this.first = first;
		this.rest = rest;
	}

	// getter and setter
	public AAnItem getFirst() {
		return first;
	}

	public void setFirst(AAnItem first) {
		this.first = first;
	}

	public IList getRest() {
		return rest;
	}

	public void setRest(IList rest) {
		this.rest = rest;
	}

	public int howMany() {
		return 1 + this.rest.howMany();
	}

	public IList brandList() {
		return this.rest.brandList().sortName(this.first);
	}

	public IList sortName(AAnItem that) {
		return this.first.compareString(that) > 0 ? new ConsList(that, this.rest.sortName(this.first))
				: new ConsList(this.first, this.rest.sortName(that));
	}

	public String getName() {
		return this.first.getName() + "\n" + this.rest.getName();
	}

	public double highestPrice() {
		return Math.max(this.first.getPrice(), this.rest.highestPrice());
	}
}

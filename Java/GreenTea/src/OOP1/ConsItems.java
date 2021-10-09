package OOP1;

public class ConsItems implements IItems {
	private AItem first;
	private IItems rest;

	// constructor
	public ConsItems(AItem first, IItems rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	// getter and setter
	public AItem getFirst() {
		return first;
	}

	public void setFirst(AItem first) {
		this.first = first;
	}

	public IItems getRest() {
		return rest;
	}

	public void setRest(IItems rest) {
		this.rest = rest;
	}

	// toString
	public String toString() {
		return this.first.toString() + this.rest.toString();
	}

	public String listProducts() {
		return (this.first + this.rest.listProducts());
	}

	@Override
	public boolean isSupplied(AItem that) {
		if (isName(that) && isPrice(that) && isNameProducer(that) && isDate(that)) {
			return true;
		} else
			return this.rest.isSupplied(that);
	}

	public boolean isDate(AItem that) {
		return this.first.getDate() == (that.getDate());
	}

	public boolean isNameProducer(AItem that) {
		return this.first.getNameProducer().equals(that.nameProducer);
	}

	public boolean isPrice(AItem that) {
		return this.first.getPrice() == that.price;
	}

	public boolean isName(AItem that) {
		return this.first.getName().equals(that.name);
	}

	// so sánh
	public IItems sortByName() {
		return (this.rest.sortByName()).insertNameOrder(this.first);
	}

	public IItems insertNameOrder(AItem that) {
		if (that.hasNameThan(this.first))
			return new ConsItems(that, this.rest);
		else
			return new ConsItems(this.first, this.rest.insertNameOrder(that));
	}

	// equals
	public boolean equals(Object o) {
		if (o == null || !(o instanceof ConsItems)) {
			return false;
		} else {
			ConsItems tmp = (ConsItems) o;
			return this.first.equals(tmp.first) && this.rest.equals(tmp.rest);
		}
	}

	@Override
	public IItems domestic() {
		// TODO Auto-generated method stub
		return this.first.equals(first) ? new ConsItems(this.first, this.rest.domestic())
				: new ConsItems(this.first, new MTItems());
	}

	@Override
	public boolean sameProduct(AItem item) {
		// TODO Auto-generated method stub
		if (this.first.same(item))
			return true;
		else
			return this.rest.sameProduct(item);
	}

	@Override
	public double minPrice() {
		return (Math.min(this.first.getPrice(), this.rest.minPrice()));
	}

}

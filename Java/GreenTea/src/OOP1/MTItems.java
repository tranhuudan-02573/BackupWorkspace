package OOP1;

public class MTItems implements IItems {
	// toString
	public String toString() {
		return "";
	}

	@Override
	public String listProducts() {
		return "";
	}

	@Override
	public boolean isSupplied(AItem that) {
		return false;
	}

	@Override
	public IItems insertNameOrder(AItem that) {
		return new ConsItems(that, new MTItems());
	}

	@Override
	public IItems sortByName() {
		return new MTItems();
	}

	// equals
	public boolean equals(Object o) {
		if (o == null || !(o instanceof MTItems))
			return false;
		return true;
	}

	@Override
	public IItems domestic() {
		return new MTItems();
	}

	@Override
	public boolean sameProduct(AItem item) {
		return false;
	}

	@Override
	public double minPrice() {
		return 0;
	}

}

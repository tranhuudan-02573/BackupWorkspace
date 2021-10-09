package OOP1;

public class ConsSuperMarket implements ISuperMarket {
	private ISuperMarket rest;
	private Producers first;

	// constructor
	public ConsSuperMarket(Producers first, ISuperMarket rest) {
		super();
		this.rest = rest;
		this.first = first;
	}

	// getter and setter
	public ISuperMarket getRest() {
		return rest;
	}

	public void setRest(ISuperMarket rest) {
		this.rest = rest;
	}

	public Producers getProducers() {
		return first;
	}

	public void setProducers(Producers first) {
		this.first = first;
	}

	@Override
	public IItems domestic() {
		return null;
	}

	@Override
	public double minprice() {
		return Math.min(this.first.getItems().minPrice(), this.rest.minprice());
	}

	// equals
	public boolean equals(Object o) {
		if (o == null || !(o instanceof ConsSuperMarket)) {
			return false;
		} else {
			ConsSuperMarket tmp = (ConsSuperMarket) o;
			return this.first.equals(tmp.first) && this.rest.equals(tmp.rest);
		}
	}

}

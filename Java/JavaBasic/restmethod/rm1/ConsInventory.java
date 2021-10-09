package rm1;

public class ConsInventory implements IInventory {
	private Toy first;
	private IInventory rest;
	// constructor
	public ConsInventory(Toy first, IInventory rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	// getter and setter
	public Toy getFirst() {
		return first;
	}
	public void setFirst(Toy first) {
		this.first = first;
	}
	public IInventory getRest() {
		return rest;
	}
	public void setRest(IInventory rest) {
		this.rest = rest;
	}
	public boolean contains(String toyname) {
		if (first.isName(toyname))
			return true;
		else
			return rest.contains(toyname);
	}
	@Override
	public boolean isBelow(double threshold) {
		// TODO Auto-generated method stub
		return this.first.isPriceBelow(threshold)
				&& this.rest.isBelow(threshold);
	}
	@Override
	public int howMany() {
		// TODO Auto-generated method stub
		return (1 + this.rest.howMany());
	}
	// immutable ko thể update
	@Override
	public IInventory raisePrice(double rate) {
		// TODO Auto-generated method stub
		Toy aToy = this.first.copyWithRaisePrice(rate);
		return new ConsInventory(aToy, this.rest.raisePrice(rate));
	}
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsInventory))
			return false;
		else {
			ConsInventory that = (ConsInventory) obj;
			return this.first.equals(that.first) && this.rest.equals(that.rest);
		}
	}
	// mutable có thể update
	@Override
	public void raisePriceMutable(double rate) {
		// TODO Auto-generated method stub
		this.first.setNewPrice(rate);
		this.rest.raisePriceMutable(rate);
	}


	
	
}

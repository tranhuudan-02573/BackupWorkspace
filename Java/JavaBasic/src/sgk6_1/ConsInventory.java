package sgk6_1;

public class ConsInventory implements Inventory {
	private Toy first;
	private Inventory rest;

	public ConsInventory(Toy first, Inventory rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	public Toy getFirst() {
		return first;
	}

	public void setFirst(Toy first) {
		this.first = first;
	}

	public Inventory getRest() {
		return rest;
	}

	public void setRest(Inventory rest) {
		this.rest = rest;
	}

	public String toString() {
		return this.first.toString() + "\n" + this.rest.toString();
	}

	public double averagePrice() {
		return totalPrice() / NumberOfToy();
	}

	public double totalPrice() {
		return (this.first.getPrice() + this.rest.totalPrice());

	}

	public int NumberOfToy() {
		return 1 + this.rest.NumberOfToy();
	}

	public Inventory replaceName() {
		return new ConsInventory(this.first.replace(), this.rest.replaceName());
		

	}

	public Inventory eliminate(String toyOfName) {
		if (this.first.getName().equals(toyOfName))
			return this.rest.eliminate(toyOfName);
		return new ConsInventory(first, this.rest.eliminate(toyOfName));
	}

}

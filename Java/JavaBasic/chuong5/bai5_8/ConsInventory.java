package bai5_8;

public class ConsInventory implements Inventory {
	private Toy first;
	private Inventory rest;

	// constructor
	public ConsInventory(Toy first, Inventory rest) {
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

	public Inventory getRest() {
		return rest;
	}

	public void setRest(Inventory rest) {
		this.rest = rest;
	}

	public String getName() {
		return this.first.getName() + "\n" + this.rest.getName();
	}

	public int quantityToys() {
		return 1 + this.rest.quantityToys();
	}

	public double sumPrice() {
		return this.first.getPrice() + this.rest.sumPrice();
	}

	public double averagePrice() {
		return this.sumPrice() / (double) this.quantityToys();
	}

	public Inventory eliminate(String toyOfName) {
		return (Inventory) (this.first.eliminate(toyOfName)
				? new ConsInventory(this.first, this.rest.eliminate(toyOfName))
				: this.rest.eliminate(toyOfName));
	}

	public void replaceName() {
		this.first.replaceName();
		this.rest.replaceName();
	}
}
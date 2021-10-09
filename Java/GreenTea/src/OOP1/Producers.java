package OOP1;

public class Producers {
	private String name;
	private String address;
	private int contact;
	private IItems items;

	// constructor
	public Producers(String name, String address, int contact, IItems items) {
		super();
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.items = items;
	}

	// getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public IItems getItems() {
		return items;
	}

	public void setItems(IItems items) {
		this.items = items;
	}

	// toString
	public String toString() {
		return this.items.toString() + "\naddress: " + this.address + "\ncontact: " + this.contact;

	}

	public String listProducts() {
		return this.items.listProducts();
	}

	public boolean isSupplied(AItem that) {
		return this.items.isSupplied(that);
	}

	public boolean sameProduct(Producers that, AItem thing) {
		return this.items.sameProduct(thing) && that.items.sameProduct(thing);
	}

	public IItems domestic() {
		return this.items.domestic();
	}

	// equals
	public boolean equals(Object o) {
		if (o == null || !(o instanceof Producers)) {
			return false;
		} else {
			Producers tmp = (Producers) o;
			return this.name.equals(tmp.name) && this.address.equals(tmp.address) && this.contact == tmp.contact
					&& this.items.equals(tmp.items);
		}
	}
}

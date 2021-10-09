package OOP1;

public abstract class AItem {
	protected String name;
	protected double price;
	protected String nameProducer;
	protected double tax;

	// constructor
	public AItem(String name, double price, String namePro, double tax) {
		super();
		this.name = name;
		this.price = price;
		this.nameProducer = nameProducer;
		this.tax = tax;
	}

	// getter and setter
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getNameProducer() {
		return nameProducer;
	}

	public void setNameProducer(String nameProducer) {
		this.nameProducer = nameProducer;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public abstract Date getDate();

	public abstract double price();

	protected abstract boolean hasNameThan(AItem first);

	protected boolean same(AItem item) {
		return this.name.equals(item.name) && this.price == item.price && this.nameProducer.equals(item.nameProducer);
	}
	// equals
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof HouseWare)) {
			return false;
		} else {
			HouseWare tmp = (HouseWare) obj;
			return this.name.equals(tmp.name) && this.price == tmp.price && this.nameProducer.equals(tmp.nameProducer)
					&& this.tax == tmp.tax;
		}
	}

}

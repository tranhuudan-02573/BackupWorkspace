package OOP1;

public class HouseWare extends AItem {

	// constructor

	public HouseWare(String name, double price, String nameProducer, double tax) {
		super(name, price, nameProducer, tax);
	}

	public double price() {
		return this.price + this.tax + 0.2 * this.price;
	}

	// toString
	public String toString() {
		return "\nname: " + this.name + "\nprice: " + this.price + "\ntax: " + this.tax + "\nnameProducer: "
				+ this.nameProducer;
	}

	@Override
	protected boolean hasNameThan(AItem first) {
		return (this.name.length() < first.name.length());
	}

	// equals
	public boolean equals(Object o) {
		if (o == null || !(o instanceof HouseWare)) {
			return false;
		} else {
			HouseWare tmp = (HouseWare) o;
			return (this.name.equals(tmp.name) && this.price == tmp.price && this.nameProducer.equals(tmp.nameProducer)
					&& this.tax == tmp.tax);

		}
	}

	@Override
	public Date getDate() {
		return null;
	}

}

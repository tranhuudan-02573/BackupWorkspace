package OOP1;

public class Food extends AItem {
	private Date date;

	// constructor
	public Food(String name, double price, String nameProducer, double tax, Date date) {
		super(name, price, nameProducer, tax);
		this.date = date;
	}

	public double price() {
		return this.price + this.tax + this.price * 0.2;
	}

	// toString
	public String toString() {
		return "\nname: " + this.name + this.date.toString() + "\nprice: " + this.price + "\ntax: " + this.tax
				+ "\nnameProducer: " + this.nameProducer;
	}

	@Override
	protected boolean hasNameThan(AItem first) {
		return (this.name.length() < first.name.length());
	}

	// equals
	public boolean equals(Object o) {
		if (o == null || !(o instanceof Food)) {
			return false;
		} else {
			Food tmp = (Food) o;
			return (this.date.equals(tmp.date) && this.name.equals(tmp.name) && this.price == tmp.price
					&& this.nameProducer.equals(tmp.nameProducer) && this.tax == tmp.tax);

		}
	}

	public Date getDate() {
		return this.date;
	}

}

package bai5_12;

public abstract class AAnItem {
	protected String branchName;
	protected double weight;
	protected double price;
	// constructor
	public AAnItem(String branchName, double weight, double price) {
		this.branchName = branchName;
		this.weight = weight;
		this.price = price;
	}

	public double unitPrice() {
		return this.price / this.weight;
	}

	public boolean lowerPrice(double amount) {
		return this.unitPrice() < amount;
	}

	public boolean cheaperThan(AAnItem that) {
		return this.unitPrice() < that.unitPrice();
	}

	public int compareString(AAnItem that) {
		return this.branchName.compareTo(that.branchName);
	}

	public double getPrice() {
		return this.price;
	}

	public String getName() {
		return this.branchName;
	}
}

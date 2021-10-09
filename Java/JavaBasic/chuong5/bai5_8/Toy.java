package bai5_8;

public class Toy {
	private String name;
	private double price;
	private boolean avaiable;

	// constructor
	public Toy(String name, double price, boolean avaiable) {
		this.name = name;
		this.price = price;
		this.avaiable = avaiable;
	}

	// getter and setter
	public boolean isAvaiable() {
		return avaiable;
	}

	public void setAvaiable(boolean avaiable) {
		this.avaiable = avaiable;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public void replaceName() {
		if (this.name.equals("robot")) {
			this.name = "r2d2";
		}

	}

	public boolean eliminate(String thatName) {
		return this.name.equals(thatName);
	}
}

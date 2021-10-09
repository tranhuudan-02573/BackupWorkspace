package sgk6_1;

/**
 * @author DELL
 *
 */
public class Toy {
	private String name;
	private double price;
	private int available;
	public Toy(String name, double price, int available) {
		super();
		this.name = name;
		this.price = price;
		this.available = available;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", price=" + price + ", available=" + available + "]";
	}
	public Toy replace() {
		if (this.name.equals("robot"))
		return new Toy("r2d2", this.price, this.available);
		return this;
	}

	
	

}

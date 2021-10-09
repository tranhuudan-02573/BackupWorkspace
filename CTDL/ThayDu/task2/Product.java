package task2;

public abstract class Product {
	protected String id;
	protected String name;
	protected double price;

	public Product(String id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public abstract boolean isDomesticProduct();

	public abstract boolean isImportedProduct();

	public abstract String getCountrys();
}

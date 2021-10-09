package OOP3;

public class ProductionStaff extends AStaff {
	private static final int unitPricePerProduct = 200000;
	private int products;

	public ProductionStaff(String id, String name, Birthday date, boolean gender, int products) {
		super(id, name, date, gender);
		this.products = products;
	}

	public int getProducts() {
		return products;
	}

	public void setProducts(int products) {
		this.products = products;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + products;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductionStaff other = (ProductionStaff) obj;
		if (products != other.products)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProductionStaff [products=" + products + super.toString() + "]";
	}

	@Override
	public int wage() {
		if (this.products > 50)
			return (int) (((50 - this.products) * unitPricePerProduct * 1.2) + 50 * unitPricePerProduct);
		return this.products * unitPricePerProduct;
	}

}

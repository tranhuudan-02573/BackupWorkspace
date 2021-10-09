package demo;

public class ProductionStaff extends Staff {
	private int products;

	

	public ProductionStaff(String id, String name, Date birthday, boolean gT, int products) {
		super(id, name, birthday, gT);
		this.products = products;
	}

	public int getProducts() {
		return products;
	}

	public void setProducts(int products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return " [products=" + products + super.toString() + "]";
	}

	@Override
	public double wage() {
		// TODO Auto-generated method stub
		if (this.products >= 50) 
				return (this.products -50 ) * 1.2 * 200 + 50 * 200;
		return this.products * 200;
	}
	

}

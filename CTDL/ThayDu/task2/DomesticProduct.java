package task2;

public class DomesticProduct extends Product {

	public DomesticProduct(String id, String name, double price) {
		super(id, name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isDomesticProduct() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isImportedProduct() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "DomesticProduct(" + this.id + " " + this.name + " " + this.price + ")";
	}

	@Override
	public String getCountrys() {
		// TODO Auto-generated method stub
		return "";
	}

}

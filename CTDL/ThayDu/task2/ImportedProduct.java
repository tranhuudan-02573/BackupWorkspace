package task2;

public class ImportedProduct extends Product {
	private String country;

	public ImportedProduct(String id, String name, double price, String country) {
		super(id, name, price);
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public boolean isDomesticProduct() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isImportedProduct() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String toString() {
		return "ImportedProduct(" + this.id + " " + this.name + " " + this.price + " " + this.country + ")";
	}

	@Override
	public String getCountrys() {
		// TODO Auto-generated method stub
		return this.country;
	}
}

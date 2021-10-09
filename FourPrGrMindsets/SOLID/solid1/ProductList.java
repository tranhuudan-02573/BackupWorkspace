package solid1;

public class ProductList {
	private final int MAX_CAPACITY = 100;
	private Product[] products;
	private int count;
	public ProductList(Product[] products, int count) {
		super();
		this.products = products;
		this.count = count;
	}
	public Product[] getProducts() {
		return products;
	}
	public void setProducts(Product[] products) {
		this.products = products;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getMAX_CAPACITY() {
		return MAX_CAPACITY;
	}
	public ProductList() { this.products = new Product[MAX_CAPACITY];}
	
	public boolean add(Product product) {
		if(this.count < this.MAX_CAPACITY) {
			this.products[this.count] = product;
			this.count++;
			return true;
		}
		return false;
	}
	public void sort(ProductCompare productCompare) {
		for(int i = 0; i <this.count; i++) {
			for(int j = 0; j < this.count - i - 1; j++) {
				if(productCompare.compare(products[j], products[j + 1]) > 0) {
					Product temp = this.products[j];
					this.products[j] = this.products[j + 1];
					this.products[j + 1 ] = temp;
				}
			}
		}
	}
	public  Product get(int index) {
		if(index >= 0 && index < this.count) {
			return this.products[index];
			
		}
		return null;
	}

}

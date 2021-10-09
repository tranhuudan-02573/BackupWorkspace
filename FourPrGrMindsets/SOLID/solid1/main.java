package solid1;

public class main {
	public static void main(String[] args) {
		ProductList productList = new ProductList();
		productList.add(new Product("HP", 10));
		productList.add(new Product("Lenovo", 6));
		productList.add(new Product("Mac", 50));
		productList.add(new Product("Dell", 70));

		printProductList(productList);
		productList.sort(new ProductPriceCompare());
		System.out.println("----------");
		printProductList(productList);
		productList.sort(new ProductNameCompare());
		System.out.println("----------");
		printProductList(productList);

	}
	
	public static void printProductList(ProductList productList) {
		for(int i = 0; i < productList.getCount(); i++) {
			Product product = productList.get(i);
			System.out.println(product.getName() + " " + product.getPrice());
		}
	}

}

package task2;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Product product = new ImportedProduct("13a", "laptop", 10, "tq");
		Product product1 = new ImportedProduct("13ab", "laptop2", 5, "tq");
		Product product2 = new ImportedProduct("13av", "laptop3", 20, "usa");
		Product product3 = new DomesticProduct("13abvv", "tivi", 5);
		Product product4 = new DomesticProduct("13aa", "tivi2", 10);
		Product product5 = new DomesticProduct("13abs", "tivi3", 5);
		Product[] listProduct = { product, product1, product2, product3, product4, product5 };
		ProductManagement PM = new ProductManagement(listProduct);
		System.out.println("method filter: " + Arrays.toString(PM.filterProductsByPrice(8)));
		System.out.println("method howMany: " + PM.howManyDomesticProducts());
		System.out.println("method getCountry: " + PM.getCountryHavingMostImportedProducts());
	}

}

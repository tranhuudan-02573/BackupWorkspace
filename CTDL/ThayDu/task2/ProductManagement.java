package task2;

import java.util.Iterator;

public class ProductManagement {
	private Product[] products;

	public ProductManagement(Product[] products) {
		this.products = products;
	}

	// How many domestic products?
	public int howManyDomesticProducts() {
		// TODO
		int result = 0;
		for (int i = 0; i < products.length; i++) {
			if (products[i].isDomesticProduct())
				result++;
		}
		return result;
	}

	public int count(String value) {
		int count = 0;
		for (int i = 0; i < products.length; i++) {
			if (products[i].isImportedProduct()) {
				if (value.equals(products[i].getCountrys()))
					count++;
			}
		}
		return count;
	}

	// Get the country name which most products are imported from
	public String getCountryHavingMostImportedProducts() {
		// TODO
		int save = 0;
		String output = "";
		for (int i = 0; i < products.length; i++) {
			int count = count(products[i].getCountrys());
			if (count > save) {
				save = count;
				output = products[i].getCountrys();

			}

		}

		return output;
	}

	// Filter products having prices higher than a given price
	public Product[] filterProductsByPrice(double price) {
		// TODO

		Product[] product = new Product[this.products.length];
		int index = 0;
		for (int i = 0; i < products.length; i++) {
			if (products[i].price > price) {
				product[index] = products[i];
				index++;
			}
		}

		return product;
	}
}

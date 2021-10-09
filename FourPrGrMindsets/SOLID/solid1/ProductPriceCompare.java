package solid1;

public class ProductPriceCompare implements ProductCompare{

	@Override
	public int compare(Product product1, Product product2) {
		// TODO Auto-generated method stub
		return product1.getPrice() - product2.getPrice();
	}
	

}

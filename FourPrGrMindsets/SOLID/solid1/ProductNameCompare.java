package solid1;

public class ProductNameCompare implements ProductCompare{

	@Override
	public int compare(Product product1, Product product2) {
		// TODO Auto-generated method stub
		return product1.getName().compareTo(product2.getName());
	}
	

}

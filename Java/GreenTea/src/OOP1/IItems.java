package OOP1;

public interface IItems {
	public String listProducts();

	public boolean isSupplied(AItem that);

	public IItems insertNameOrder(AItem that);

	public IItems sortByName();

	public boolean sameProduct(AItem item);

	public IItems domestic();

	public double minPrice();

}

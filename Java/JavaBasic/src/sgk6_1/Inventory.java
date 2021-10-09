package sgk6_1;

public interface Inventory {

	public double totalPrice();

	public int NumberOfToy();

	public Inventory replaceName();
	public double averagePrice();

	public Inventory eliminate(String toyOfName);

}

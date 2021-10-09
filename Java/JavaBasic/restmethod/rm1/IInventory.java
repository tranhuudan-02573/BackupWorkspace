package rm1;

public interface IInventory {
	public boolean contains(String toyname);
	public boolean isBelow(double threshold);
	public int howMany();
	public IInventory raisePrice(double rate);
	public void raisePriceMutable(double rate);
	
}

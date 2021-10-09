package sgk6_1;



public class MTInventory implements Inventory {
	public String toString() {
		return "";
	}

	@Override
	public double totalPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int NumberOfToy() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Inventory replaceName() {
		// TODO Auto-generated method stub
		return new MTInventory();
	}

	@Override
	public double averagePrice() {
		// TODO Auto-generated method stub
		return 0;
	}


	public Inventory eliminate(String toyOfName) {
		// TODO Auto-generated method stub
		return new MTInventory();
	}
	
}

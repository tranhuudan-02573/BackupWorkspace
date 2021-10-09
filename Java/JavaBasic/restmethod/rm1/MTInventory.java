package rm1;

public class MTInventory implements IInventory {

	@Override
	public boolean contains(String toyname) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBelow(double threshold) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int howMany() {
		// TODO Auto-generated method stub
		return 0;
	}
	// immutable ko thể update
	@Override
	public IInventory raisePrice(double rate) {
		// TODO Auto-generated method stub
		return new MTInventory();
	}
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTInventory))
			return false;
		return true;
	}
	// mutable có thể update
	@Override
	public void raisePriceMutable(double rate) {
		// TODO Auto-generated method stub
		
	}


	
}

package bai5_8;

public class MTInventory implements Inventory {
	
	public int quantityToys() {
		return 0;
	}

	public Inventory eliminate(String toyOfName) {
		return new MTInventory();
	}

	public void replaceName() {
	}

	public double sumPrice() {
		return 0.0D;
	}

	public String getName() {
		return "";
	}
}

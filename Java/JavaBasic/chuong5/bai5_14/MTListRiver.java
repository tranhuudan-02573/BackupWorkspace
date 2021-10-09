package bai5_14;

public class MTListRiver implements IListRiver {
	
	public double maxLength() {
		return 0.0;
	}

	public int confluences() {
		return 0;
	}

	public IListLocation getLocation() {
		return new MTListLocation();
	}
}

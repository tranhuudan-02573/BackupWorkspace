package bai5_14;

public class Confluence extends ARiver {
	private ARiver left;
	private ARiver right;

	public Confluence(Location location, double length, ARiver left, ARiver right) {
		super(location, length);
		this.left = left;
		this.right = right;
	}

	public int countConfluence() {
		return 1;
	}
}

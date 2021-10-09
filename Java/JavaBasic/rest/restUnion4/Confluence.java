package restUnion4;

public class Confluence extends ARiver {
	private ARiver left;
	private ARiver right;
	public Confluence(Location loccation, double length, ARiver left, ARiver right) {
		super(loccation, length);
		this.left = left;
		this.right = right;
	}
	public ARiver getLeft() {
		return left;
	}
	public void setLeft(ARiver left) {
		this.left = left;
	}
	public ARiver getRight() {
		return right;
	}
	public void setRight(ARiver right) {
		this.right = right;
	}
	public String toString() {
		return this.left.toString() + this.right.toString() + super.toString() ;
			
	}
	
	
}

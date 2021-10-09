package restUnion3;

public class Square extends ASingleShape {
	private int size;

	

	public Square(CartPt location, int size) {
		super(location);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	public String toString() {
		return super.toString() + ", size: " + this.size;
	}
	
	
	
}

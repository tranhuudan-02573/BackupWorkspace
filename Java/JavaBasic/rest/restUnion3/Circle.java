package restUnion3;

public class Circle extends ASingleShape {
	
	private int radius;

	

	public Circle(CartPt location, int radius) {
		super(location);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public String toString() {
		return super.toString() + ", radius: " +this.radius;
	}
	
	
}

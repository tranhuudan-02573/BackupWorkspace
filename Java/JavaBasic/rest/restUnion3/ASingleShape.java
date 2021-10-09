package restUnion3;

public abstract class ASingleShape implements IShape {
	protected CartPt location;

	public ASingleShape(CartPt location) {
		super();
		this.location = location;
	}
	public String toString() {
		return this.location.toString();
	}
}

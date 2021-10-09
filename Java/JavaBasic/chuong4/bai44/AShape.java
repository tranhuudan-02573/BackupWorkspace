package bai44;

public abstract class AShape implements IShape {// hình dạng phẳng
	protected CartPt loc;// tọa độ của hình đó 
	// contructor
	public AShape(CartPt loc) {
		super();
		this.loc = loc;
	}			
	public abstract double area();
	public abstract double distanceToO();
	public abstract boolean contains(CartPt point);
	public abstract Square boundingBox();
	public abstract Rectangle boundingBoxx();
	public abstract double perimeter();

}

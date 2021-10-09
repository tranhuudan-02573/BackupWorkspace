package restUnion3;

public class CompositeShape implements IShape {
	protected IShape top;
	protected IShape bottom;
	public CompositeShape(IShape top, IShape bottom) {
		super();
		this.top = top;
		this.bottom = bottom;
	}
	public String toString() {
		return this.top.toString() + "\n" + this.bottom.toString();
	}
	
}	

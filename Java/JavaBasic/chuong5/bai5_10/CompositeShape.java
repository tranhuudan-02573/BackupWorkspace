
package bai5_10;

public class CompositeShape implements IShape {
	private IShape top;
	private IShape bottom;

	// constructor
	public CompositeShape(IShape top, IShape bottom) {
		this.top = top;
		this.bottom = bottom;
	}

	// getter and setter
	public IShape getTop() {
		return top;
	}

	public void setTop(IShape top) {
		this.top = top;
	}

	public IShape getBottom() {
		return bottom;
	}

	public void setBottom(IShape bottom) {
		this.bottom = bottom;
	}

	public Rectangles getBbTop() {
		return bbTop;
	}

	public void setBbTop(Rectangles bbTop) {
		this.bbTop = bbTop;
	}

	public Rectangles getBbBottom() {
		return bbBottom;
	}

	public void setBbBottom(Rectangles bbBottom) {
		this.bbBottom = bbBottom;
	}

	public double distanceToO() {
		return Math.min(this.top.distanceToO(), this.bottom.distanceToO());
	}

	public boolean contains(CartPt point) {
		return this.top.contains(point) || this.bottom.contains(point);
	}

	private Rectangles bbTop = this.top.boundingBox();
	private Rectangles bbBottom = this.bottom.boundingBox();

	public Rectangles boundingBox() {

		int X1 = locX1();
		int Y1 = locY1();
		int X2 = locX2();
		int Y2 = locY2();
		return new Rectangles(new CartPt(X1, Y1), X2 - X1, Y2 - Y1);
	}

	public int locY2() {
		return Math.max(bbTop.loc.getY() + bbTop.getHeight(), bbBottom.loc.getY() + bbBottom.getHeight());
	}

	public int locX2() {
		return Math.max(bbTop.loc.getX() + bbTop.getWidth(), bbBottom.loc.getX() + bbBottom.getWidth());
	}

	public int locY1() {
		return Math.min(bbTop.loc.getY(), bbBottom.loc.getY());
	}

	public int locX1() {
		return Math.min(bbTop.loc.getX(), bbBottom.loc.getX());
	}
}
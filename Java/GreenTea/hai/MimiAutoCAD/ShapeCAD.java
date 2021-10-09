package MimiAutoCAD;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;

public abstract class ShapeCAD {
	protected Point p1;
	protected Point p2;
	protected Color color;
	protected boolean select;
	protected boolean highlights;
	protected boolean taget;

	public ShapeCAD(Point p1, Point p2, Color color, boolean select, boolean highlights, boolean taget) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.color = color;
		this.select = select;
		this.highlights = highlights;
		this.taget = taget;
	}

	public abstract void draw(Graphics g);

	public abstract void drawIfSelect(Graphics g);

	public abstract Shape getBounds();

	public abstract void drawHighlights(Graphics g);

	public abstract int resizeCode(Point p);

	public abstract void reSize(int resizeCode, Point p);

	public abstract boolean isMove(Point p);

	public abstract void move(Point p);

	public boolean isTaget() {
		return taget;
	}

	public void setTaget(boolean taget) {
		this.taget = taget;
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean isSelect() {
		return select;
	}

	public void setSelect(boolean select) {
		this.select = select;
	}

	public boolean isHighlights() {
		return highlights;
	}

	public void setHighlights(boolean highlights) {
		this.highlights = highlights;
	}

}

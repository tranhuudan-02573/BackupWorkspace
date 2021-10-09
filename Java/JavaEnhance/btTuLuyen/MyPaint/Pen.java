package MyPaint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.util.ArrayList;

public class Pen extends AShape {
	public Pen(int x, int y, Color color, BasicStroke stroke) {
		super(x, y, color, stroke);
		listPoint = new ArrayList<Point>();
		next = new Point(x, y);
		// TODO Auto-generated constructor stub
	}

	private ArrayList<Point> listPoint = new ArrayList<Point>();
	Point next;

	@Override
	public void setSecondPoint(int x, int y) {
		// TODO Auto-generated method stub
		next = new Point(x, y);
		listPoint.add(next);

	}

	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub

		if (listPoint.size() < 2)
			return;
		Point fp, lp;
		for (int i = 0; i < listPoint.size() - 1; i++) {
			g.setColor(color);
			g.setStroke(stroke);
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_DEFAULT);
			fp = listPoint.get(i);
			lp = listPoint.get(i + 1);
			g.drawLine(fp.x, fp.y, lp.x, lp.y);
		}
	}

	@Override
	public boolean contains(Point p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void fill(Graphics2D g) {
		// TODO Auto-generated method stub

	}

	@Override
	public int perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setCommand(StatusBar statusBar) {
		// TODO Auto-generated method stub

	}

	@Override
	public void move(Point end) {
		// TODO Auto-generated method stub
		location.x = end.x;
		location.y = end.y;
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Point center() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void select(Graphics2D g) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean round(Point p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean center(Point p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void scale(int x, int y) {
		// TODO Auto-generated method stub

	}

}

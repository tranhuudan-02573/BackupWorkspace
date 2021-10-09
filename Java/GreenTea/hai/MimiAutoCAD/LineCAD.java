package MimiAutoCAD;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class LineCAD extends ShapeCAD {
	Rectangle2D rec1, rec2, centerRec;
	int centerPointX, centerPointY;

	public LineCAD(Point p1, Point p2, Color color, boolean select, boolean highlights, boolean taget) {
		super(p1, p2, color, select, highlights, taget);
		// TODO Auto-generated constructor stub
		doSomething();

	}

	private void doSomething() {
		// TODO Auto-generated method stub
		centerPointX = (p1.x + p2.x) / 2;
		centerPointY = (p1.y + p2.y) / 2;
		centerRec = new Rectangle2D.Double(centerPointX - 4, centerPointY - 4, 9, 9);
		rec1 = new Rectangle2D.Double(p1.x - 4, p1.y - 4, 9, 9);
		rec2 = new Rectangle2D.Double(p2.x - 4, p2.y - 4, 9, 9);
	}

	public void drawSelect(Graphics g) {
		// TODO Auto-generated method stub

	}

	public boolean contains() {
		// TODO Auto-generated method stub

		return false;
	}

	public void drawHighlights(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(4.0f));
		g2d.setColor(Color.PINK);
		Line2D line2D = new Line2D.Double(p1, p2);
		g2d.draw(line2D);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(color);
		g2d.setStroke(new BasicStroke(2.0f));
		Line2D line2D = new Line2D.Double(p1, p2);
		g2d.draw(line2D);
//	g2d.drawLine(p1.x, p1.y, p2.x, p2.y);

	}

	@Override
	public void drawIfSelect(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(color.BLUE);
		int distance = (int) p1.distance(p2);
		g2d.fill(centerRec);
		g2d.setColor(color.green);
		g2d.fill(rec1);
		g2d.setColor(color.red);

		g2d.fill(rec2);

	}

	@Override
	public Shape getBounds() {
		// TODO Auto-generated method stub
		return new Line2D.Double(p1, p2);
	}

	@Override
	public int resizeCode(Point p) {
		// TODO Auto-generated method stub
		if (rec1.contains(p))
			return 1;
		if (rec2.contains(p))
			return 2;
		return 0;
	}

	@Override
	public void reSize(int resizeCode, Point movePoint) {
		// TODO Auto-generated method stub
		if (resizeCode == 1) {
			p1 = movePoint;
			doSomething();
		}
		if (resizeCode == 2) {
			p2 = movePoint;
			doSomething();
		}
	}

	@Override
	public boolean isMove(Point p) {
		// TODO Auto-generated method stub
		return centerRec.contains(p);
	}

	@Override
	public void move(Point click) {
		// TODO Auto-generated method stub
		int tempX = centerPointX - click.x;
		int tempY = centerPointY - click.y;
		p1.x -= tempX;
		p1.y -= tempY;
		p2.x -= tempX;
		p2.y -= tempY;
		doSomething();
	}
}

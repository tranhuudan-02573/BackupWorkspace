package MimiAutoCAD;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class CircleCAD extends ShapeCAD {
	int radius;
	Ellipse2D ellip;
	Rectangle2D rectCenter;
	Rectangle2D rectTop;
	Rectangle2D rectBot;
	Rectangle2D rectLeft;
	Rectangle2D rectRight;

	public CircleCAD(Point p1, Point p2, Color color, boolean select, boolean highlights, boolean taget) {
		super(p1, p2, color, select, highlights, taget);
		// p1 is circle center ; radius = distance from p1 and p2
		doSomething();
	}

	private void doSomething() {
		// TODO Auto-generated method stub
		radius = (int) Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
		ellip = new Ellipse2D.Double(p1.x - radius, p1.y - radius, 2 * radius, 2 * radius);
		double transX = p1.x - 3;
		double transY = p1.y - 3;
		rectCenter = new Rectangle2D.Double(transX, transY, 8, 8);
		rectTop = new Rectangle2D.Double(transX, transY - radius, 8, 8);
		rectBot = new Rectangle2D.Double(transX, transY + radius, 8, 8);
		rectLeft = new Rectangle2D.Double(transX - radius, transY, 8, 8);
		rectRight = new Rectangle2D.Double(transX + radius, transY, 8, 8);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(color);
		g2d.setStroke(new BasicStroke(2.0f));
		g.drawOval(p1.x - radius, p1.y - radius, 2 * radius, 2 * radius);
	}

	@Override
	public void drawIfSelect(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(color.blue);
		g2d.fill(rectCenter);

		g2d.setColor(color.red);
		g2d.fill(rectTop);

		g2d.setColor(color.green);
		g2d.fill(rectBot);

		g2d.setColor(color.yellow);
		g2d.fill(rectLeft);

		g2d.setColor(color.magenta);
		g2d.fill(rectRight);
	}

	@Override
	public Shape getBounds() {
		// TODO Auto-generated method stub
		return new Ellipse2D.Double(p1.x - radius, p1.y - radius, 2 * radius, 2 * radius);
	}

	@Override
	public void drawHighlights(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(4.0f));
		g2d.setColor(Color.PINK);
		g2d.draw(ellip);
	}

	@Override
	public int resizeCode(Point p) {
		// TODO Auto-generated method stub
		if (rectTop.contains(p))
			return 1;
		if (rectRight.contains(p))
			return 1;
		if (rectBot.contains(p))
			return 1;
		if (rectLeft.contains(p))
			return 1;
		return 0;
	}

	@Override
	public void reSize(int resizeCode, Point movePoint) {
		// TODO Auto-generated method stub
		if (resizeCode == 1) {
			p2 = movePoint;
			doSomething();
		}

	}

	@Override
	public boolean isMove(Point p) {
		// TODO Auto-generated method stub
		return rectCenter.contains(p);
	}

	@Override
	public void move(Point click) {
		// TODO Auto-generated method stub
		int tempX = p1.x - click.x;
		int tempY = p1.y - click.y;
		p1 = click;
		p2.x -= tempX;
		p2.y -= tempY;
		doSomething();
	}

}

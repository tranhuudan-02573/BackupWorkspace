package MimiAutoCAD;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class RectangeCAD extends ShapeCAD {
	Rectangle2D rec;
	Rectangle2D rectCenter;
	Rectangle2D rectTopL;
	Rectangle2D rectTopR;
	Rectangle2D rectBotL;
	Rectangle2D rectBotR;
	public int[] recX, recY;
	int w, h, oriX, oriY;
	Polygon poly;

	public RectangeCAD(Point p1, Point p2, Color color, boolean select, boolean highlights, boolean taget) {
		super(p1, p2, color, select, highlights, taget);

		doSomething();
	}

	private void doSomething() {
		recX = new int[4];
		recY = new int[4];
		oriX = Math.min(p1.x, p2.x);
		oriY = Math.min(p1.y, p2.y);
		w = Math.abs(p1.x - p2.x);
		h = Math.abs(p1.y - p2.y);
		rec = new Rectangle2D.Double(oriX, oriY, w, h);

		int tranX = (int) rec.getCenterX();
		int tranY = (int) rec.getCenterY();

		rectCenter = new Rectangle2D.Double(tranX - 4, tranY - 4, 8, 8);

		recX[0] = (int) tranX - w / 2;
		recY[0] = (int) tranY - h / 2;

		recX[1] = (int) tranX + w / 2;
		recY[1] = (int) tranY - h / 2;

		recX[2] = (int) tranX + w / 2;
		recY[2] = (int) tranY + h / 2;

		recX[3] = (int) tranX - w / 2;
		recY[3] = (int) tranY + h / 2;
		rectTopL = new Rectangle2D.Double(recX[0] - 4, recY[0] - 4, 8, 8);
		rectTopR = new Rectangle2D.Double(recX[1] - 4, recY[1] - 4, 8, 8);
		rectBotL = new Rectangle2D.Double(recX[2] - 4, recY[2] - 4, 8, 8);
		rectBotR = new Rectangle2D.Double(recX[3] - 4, recY[3] - 4, 8, 8);
		poly = new Polygon(recX, recY, 4);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(color);
		g2d.setStroke(new BasicStroke(2.0f));
//	       g2d.translate(rec.getCenterX(), rec.getCenterY());

//			g2d.rotate(Math.toRadians(45));
		Polygon poly = new Polygon(recX, recY, 4);
//	       g2d.drawPolygon(poly);
		g2d.draw(rec);
//	       g2d.translate(0, 0);
	}

	@Override
	public void drawIfSelect(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(color.blue);
		g2d.fill(rectCenter);

		g2d.setColor(color.red);
		g2d.fill(rectTopL);

		g2d.setColor(color.green);
		g2d.fill(rectTopR);

		g2d.setColor(color.yellow);
		g2d.fill(rectBotL);

		g2d.setColor(color.MAGENTA);
		g2d.fill(rectBotR);

	}

	@Override
	public Shape getBounds() {
		// TODO Auto-generated method stub
		return rec;
	}

	@Override
	public void drawHighlights(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(4.0f));
		g2d.setColor(Color.PINK);
//		g2d.rotate(Math.toRadians(45));
//		g2d.drawPolygon(poly);

		g2d.draw(rec);
	}

	@Override
	public int resizeCode(Point p) {
		// resizeCode mang giá trị từ 1-4 đại diện cho 4 điểm resize của hình, trả về 0
		// nếu không chấm xanh nào dc chọn
		if (rectTopL.contains(p))
			return 1;
		if (rectTopR.contains(p))
			return 2;
		if (rectBotL.contains(p))
			return 3;
		if (rectBotR.contains(p))
			return 4;
		return 0;
	}

	@Override
	public void reSize(int resizeCode, Point movePoint) {
		// TODO Auto-generated method stub
		if (resizeCode != 0) {
			if (resizeCode == 1) {
				p1 = movePoint;
				p2 = p2;
				doSomething();

			}
			if (resizeCode == 2) {
				p1.x = p1.x;
				p1.y = movePoint.y;
				p2.x = movePoint.x;
				p2.y = p2.y;
				doSomething();

			}
			if (resizeCode == 3) {

				p1 = p1;
				p2 = movePoint;
				doSomething();
				System.out.println(p1);
				System.out.println("coooooo");
				System.out.println(p2);

			}
			if (resizeCode == 4) {
				p1.y = p1.y;
				p1.x = movePoint.x;
				p2.y = movePoint.y;
				p2.x = p2.x;
				doSomething();

			}
		}

	}

	@Override
	public boolean isMove(Point p) {
		// trả về true nếu click vào điểm move( điểm xanh ở tâm)
		return rectCenter.contains(p);
	}

	@Override
	public void move(Point click) {
		// TODO Auto-generated method stub
		p1.x = click.x - w / 2;
		p1.y = click.y - h / 2;
		p2.x = p1.x + w;
		p2.y = p1.y + h;
		doSomething();
	}

}

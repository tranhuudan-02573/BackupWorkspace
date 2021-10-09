package MyPaint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;

public class Oval extends AShape {

	int width;
	int height;
	int x, iX, iY;
	int y;
	int xx, yy;

	public Oval(int x, int y, Color color, BasicStroke stroke) {
		super(x, y, color, stroke);
		width = 1;
		height = 1;
		// TODO Auto-generated constructor stub

	}

	@Override
	public void setSecondPoint(int x, int y) {
		// TODO Auto-generated method stub
		width = Math.abs(location.x - x);
		height = Math.abs(location.y - y);
		this.x = Math.min(location.x, x);
		this.y = Math.min(location.y, y);

	}

	@Override
	public void move(Point end) {
		// TODO Auto-generated method stub
		x = end.x - width / 2;
		y = end.y - height / 2;
		xx = x + width / 2;
		yy = y + height / 2;
	}

	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.setStroke(stroke);
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.drawOval(x, y, width, height);
	}

	@Override
	public boolean contains(Point p) {
		// TODO Auto-generated method stub

		return ((Math.pow(Math.abs(p.x - (this.x + width / 2)), 2) / (Math.pow(width / 2, 2))
				+ Math.pow(Math.abs(p.y - (this.y + height / 2)), 2) / (Math.pow(height / 2, 2))) < 1);
	}

	@Override
	public void fill(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.fillOval(x, y, width, height);
	}

	@Override
	public int perimeter() {
		// TODO Auto-generated method stub
		return (int) (Math.PI * (3 * (width / 2 + height / 2)
				- Math.sqrt((3 * width / 2 + height / 2) * (width / 2 + 3 * height / 2))));
	}

	
	@Override
	public void setCommand(StatusBar statusBar) {
		// TODO Auto-generated method stub

		statusBar.command1.setText(statusBar.command1.getText()
				
				+ "-Ellipse: center(" + center().x + ";" + center().y + ")" + " ||width: " + width + " ||height: "
				+ height + " ||perimeter: " + perimeter() + " ||area: " + area() + " ~~Finish\n");
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return (int) Math.PI * width / 2 * height / 2;
	}

	@Override
	public Point center() {
		// TODO Auto-generated method stub
		return new Point(location.x + width / 2, location.y + height / 2);
	}

	@Override
	public void select(Graphics2D g) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {
			double t = 2 * Math.PI * i / 4;
			int x = (int) Math.round((this.x + width / 2) + width / 2 * Math.cos(t));
			int y = (int) Math.round((this.y + height / 2) + height / 2 * Math.sin(t));
			g.setColor(Color.BLUE);
			g.fillRect(x - 10, y - 10, (int) (10 + stroke.getLineWidth()), (int) (10 + stroke.getLineWidth()));
		}
		g.fillRect(x + width / 2 - 10, y + height / 2 - 10, (int) (10 + stroke.getLineWidth()),
				(int) (10 + stroke.getLineWidth()));
	}

	@Override
	public boolean round(Point p) {
		// TODO Auto-generated method stub
		if (x + width / 2 - 20 < p.x && x + width / 2 + 20 + (int) (10 + stroke.getLineWidth()) > p.x
				&& y + height / 2 - 20 < p.y && y + height / 2 + 20 + (int) (10 + stroke.getLineWidth()) > p.y) {
			return false;
		}

		return true;
	}

	@Override
	public boolean center(Point p) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {
			double t = 2 * Math.PI * i / 4;
			int x = (int) Math.round((this.x + width / 2) + width / 2 * Math.cos(t));
			int y = (int) Math.round((this.y + height / 2) + height / 2 * Math.sin(t));
			if (x - 20 < p.x && x + 20 + (int) (10 + stroke.getLineWidth()) > p.x && y - 20 < p.y
					&& y + 20 + (int) (10 + stroke.getLineWidth()) > p.y) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void scale(int x, int y) {
		// TODO Auto-generated method stub
		width = Math.abs(xx - x);
		height = Math.abs(yy - y);
		this.x = Math.min(xx, x);
		this.y = Math.min(yy, y);

	}

}

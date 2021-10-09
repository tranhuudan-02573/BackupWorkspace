package MyPaint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;

public class Rectangle extends AShape {
	private int width;
	private int height;
	private int x;
	private int y;
	int xx, yy;

	public Rectangle(int x, int y, Color color, BasicStroke stroke) {
		super(x, y, color, stroke);
		width = 2;
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
		xx = this.x;
		yy = this.y;
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(color);
		g.setStroke(stroke);
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.drawRect(x, y, width, height);
	}

	@Override
	public void move(Point end) {
		// TODO Auto-generated method stub
		this.x = end.x - width / 2;
		this.y = end.y - height / 2;
		xx = this.x;
		yy = this.y;
	}

	@Override
	public boolean contains(Point p) {
		// TODO Auto-generated method stub
		if (x < p.x && x + width > p.x && y < p.y && y + height > p.y) {
			return true;
		}
		return false;
	}

	@Override
	public void fill(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.fillRect(x, y, width, height);
	}

	@Override
	public int perimeter() {
		// TODO Auto-generated method stub
		return (int) (width + height) / 2;
	}


	@Override
	public void setCommand(StatusBar statusBar) {
		// TODO Auto-generated method stub

		statusBar.command1.setText(statusBar.command1.getText()
				
				+ "-Rectangle: center(" + center().x + ";" + center().y + ")" + " ||width: " + width + " ||height: "
				+ height + " ||perimeter: " + perimeter() + " ||area: " + area() + " ~~Finish\n");
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public Point center() {
		// TODO Auto-generated method stub
		return new Point(location.x + width / 2, location.y + height / 2);
	}

	@Override
	public void select(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLUE);
		g.fillRect(x - 10, y - 10, (int) (10 + stroke.getLineWidth()), (int) (10 + stroke.getLineWidth()));
		g.fillRect(x - 10 + width, y + height - 10, (int) (10 + stroke.getLineWidth()),
				(int) (10 + stroke.getLineWidth()));
		g.fillRect(x - 10 + width, y - 10, (int) (10 + stroke.getLineWidth()), (int) (10 + stroke.getLineWidth()));
		g.fillRect(x - 10, y + height - 10, (int) (10 + stroke.getLineWidth()), (int) (10 + stroke.getLineWidth()));
		g.fillRect(x + width / 2 - 10, y + height / 2 - 10, (int) (10 + stroke.getLineWidth()),
				(int) (10 + stroke.getLineWidth()));
		g.setColor(color);
	}

	@Override
	public boolean round(Point p) {
		// TODO Auto-generated method stub

//		}

		if (x - 20 < p.x && x + 20 + (int) (10 + stroke.getLineWidth()) > p.x && y - 20 < p.y
				&& y + 20 + (int) (10 + stroke.getLineWidth()) > p.y) {
			return true;
		}

		if (x - 20 + width < p.x && x + 20 + width + (int) (10 + stroke.getLineWidth()) > p.x && y + height - 20 < p.y
				&& y + height + 20 + (int) (10 + stroke.getLineWidth()) > p.y) {
			return true;
		}
		if (x - 20 + width < p.x && x + 20 + width + (int) (10 + stroke.getLineWidth()) > p.x && y - 20 < p.y
				&& y + 20 + (int) (10 + stroke.getLineWidth()) > p.y) {
			return true;
		}
		if (x - 20 < p.x && x + 20 + (int) (10 + stroke.getLineWidth()) > p.x && y + height - 20 < p.y
				&& y + height + 20 + (int) (10 + stroke.getLineWidth()) > p.y) {
			return true;
		}
		return false;
	}

	@Override
	public boolean center(Point p) {
		// TODO Auto-generated method stub

		if (x + width / 2 - 20 < p.x && x + width / 2 + 20 + (int) (10 + stroke.getLineWidth()) > p.x
				&& y + height / 2 - 20 < p.y && y + height / 2 + 20 + (int) (10 + stroke.getLineWidth()) > p.y) {
			return true;
		}
		return false;
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

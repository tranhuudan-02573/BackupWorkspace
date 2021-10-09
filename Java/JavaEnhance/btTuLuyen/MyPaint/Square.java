package MyPaint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;

public class Square extends AShape {
	int size;
	private int x;
	private int y;
	int xx, yy;

	public Square(int x, int y, Color color, BasicStroke stroke) {
		super(x, y, color, stroke);
		size = 1;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setSecondPoint(int x, int y) {
		// TODO Auto-generated method stub
		size = Math.abs(y - location.y);
		size = Math.abs(x - location.x);
		this.x = Math.min(location.x, x);
		this.y = Math.min(location.y, y);
		xx=this.x;
		yy=this.y;
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(color);
		g.setStroke(stroke);
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.drawRect(x, y, size, size);
	}

	@Override
	public boolean contains(Point p) {
		// TODO Auto-generated method stub
		if (x < p.x && x + size > p.x && y < p.y && y + size > p.y) {
			return true;
		}
		return false;
	}

	@Override
	public void fill(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.fillRect(x, y, size, size);
	}

	@Override
	public int perimeter() {
		// TODO Auto-generated method stub
		return (int) size * 4;
	}

	

	@Override
	public void setCommand(StatusBar statusBar) {
		// TODO Auto-generated method stub

		statusBar.command1.setText(statusBar.command1.getText()
				
				+ "-Square: center( " + center().x + ";" + center().y + ")" + " ||size: " + size + " ||perimeter: "
				+ perimeter() + " ||area: " + area() + " ~~Finish\n");
	}

	@Override
	public void move(Point end) {
		// TODO Auto-generated method stub

		this.x = end.x - size / 2;
	
		this.y = end.y - size / 2;
		xx = this.x ;
		yy = this.y ;

	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return size * size;
	}

	@Override
	public Point center() {
		// TODO Auto-generated method stub
		return new Point(location.x + size / 2, location.y + size / 2);
	}

	@Override
	public void select(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLUE);
		g.fillRect(x - 10, y - 10, (int) (10 + stroke.getLineWidth()), (int) (10 + stroke.getLineWidth()));
		g.fillRect(x - 10 + size, y + size - 10, (int) (10 + stroke.getLineWidth()),
				(int) (10 + stroke.getLineWidth()));
		g.fillRect(x - 10 + size, y - 10, (int) (10 + stroke.getLineWidth()), (int) (10 + stroke.getLineWidth()));
		g.fillRect(x - 10, y + size - 10, (int) (10 + stroke.getLineWidth()), (int) (10 + stroke.getLineWidth()));
		g.fillRect(x + size / 2 - 10, y + size / 2 - 10, (int) (10 + stroke.getLineWidth()),
				(int) (10 + stroke.getLineWidth()));
		g.setColor(color);
	}

	@Override
	public boolean round(Point p) {
		// TODO Auto-generated method stub
		if (x + size / 2 - 20 < p.x && x + size / 2 + 20 + (int) (10 + stroke.getLineWidth()) > p.x
				&& y + size / 2 - 20 < p.y && y + size / 2 + 20 + (int) (10 + stroke.getLineWidth()) > p.y) {
			return false;
		}

		return true;

	}

	@Override
	public boolean center(Point p) {
		// TODO Auto-generated method stub
//		

		if (x - 20 < p.x && x + 20 + (int) (10 + stroke.getLineWidth()) > p.x && y - 20 < p.y
				&& y + 20 + (int) (10 + stroke.getLineWidth()) > p.y) {
			return false;
		}

		if (x - 20 + size < p.x && x + 20 + size + (int) (10 + stroke.getLineWidth()) > p.x && y + size - 20 < p.y
				&& y + size + 20 + (int) (10 + stroke.getLineWidth()) > p.y) {
			return false;
		}
		if (x - 20 + size < p.x && x + 20 + size + (int) (10 + stroke.getLineWidth()) > p.x && y - 20 < p.y
				&& y + 20 + (int) (10 + stroke.getLineWidth()) > p.y) {
			return false;
		}
		if (x - 20 < p.x && x + 20 + (int) (10 + stroke.getLineWidth()) > p.x && y + size - 20 < p.y
				&& y + size + 20 + (int) (10 + stroke.getLineWidth()) > p.y) {
			return false;
		}

		return true;
	}

	@Override
	public void scale(int x, int y) {
		// TODO Auto-generated method stub
		size = Math.abs(y - yy);
		size = Math.abs(x - xx);
		this.x = Math.min(xx, x);
		System.out.println(xx);
		this.y = Math.min(yy, y);
	}

}

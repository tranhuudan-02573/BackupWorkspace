package MyPaint;

import java.awt.Graphics2D;
import java.awt.Point;

public interface IShape {
	public void setSecondPoint(int x, int y);

	public void draw(Graphics2D g);

	public boolean contains(Point p);

	public void fill(Graphics2D g);

//
	public int perimeter();

	public int area();

	public Point center();


	public void move(Point end);

	public void setCommand(StatusBar statusBar);

	public void select(Graphics2D g);

	public boolean round(Point p);

	public boolean center(Point p);

	public void scale(int x, int y);

}

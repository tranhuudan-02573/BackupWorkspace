package pain;

import java.awt.Point;
import java.io.BufferedWriter;

public class Line {
	int x, y, x2, y2;

	public Line(int x, int y, int x2, int y2) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.x2 = x2;
		this.y2 = y2;
	}

	public int getStartX() {
		// TODO Auto-generated method stub
		return x;
	}

	public int getStartY() {
		// TODO Auto-generated method stub
		return y;
	}

	public int getEndX() {
		// TODO Auto-generated method stub
		return x2;
	}

	public int getEndY() {
		// TODO Auto-generated method stub
		return y2;
	}

	public boolean contains(int x, int y) {
		// độ dài AB
		double AB = Math.round(distance(this.x, this.y, x2, y2) * 100) / 100;

		// độ dài AC
		double AC = Math.round(distance(this.x, this.y, x, y) * 100) / 100;

		// độ dài CB
		double CB = Math.round(distance(x, y, x2, y2) * 100) / 100;

		return AB == (AC + CB);
	}

	// tính độ dài
	public double distance(int x, int y, int x2, int y2) {
		return Math.sqrt(Math.pow(x - x2, 2) + Math.pow(y - y2, 2));

	}

}

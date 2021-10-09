package Test;

import java.awt.Rectangle;

public class Sprite {
	protected int x;
	protected int y;
	protected int width;
	protected int height;

	public Sprite(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Rectangle getBound() {
		return new Rectangle(x, y, width, height);
	}
}

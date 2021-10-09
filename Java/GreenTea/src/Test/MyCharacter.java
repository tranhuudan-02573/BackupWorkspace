package Test;

import java.awt.event.MouseEvent;

public class MyCharacter extends Sprite {
	private int mx;
	private int my;

	public MyCharacter(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	public void move() {
		x = mx-width/2;
		y = my-height/2;
	}

	public void mouseMoved(MouseEvent e) {
		mx = e.getX();
		my = e.getY();
	}
}

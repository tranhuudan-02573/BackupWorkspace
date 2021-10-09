package Test;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JPanel;
import javax.swing.Timer;

public class CollisionDetection extends JPanel implements ActionListener {
	private MyCharacter myChar;
	private Enemy enemy;
	private final int DELAY = 1;
	private Timer timer;

	public CollisionDetection() {
		myChar = new MyCharacter(50, 50, 50, 50);
		enemy = new Enemy(100, 100, 50, 50);
		addMouseMotionListener(new MyAdapter());
		timer = new Timer(DELAY, this);
		timer.start();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(myChar.getX(), myChar.getY(), myChar.getWidth(), myChar.getHeight());
		g.drawRect(enemy.getX(), enemy.getY(), enemy.getWidth(), enemy.getHeight());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		checkCollision();
		myChar.move();
		repaint();
	}

	public void checkCollision() {
		Rectangle myCharBound = myChar.getBound();
		Rectangle enemyBound = enemy.getBound();
		if (myCharBound.intersects(enemyBound)) {
			System.out.println("Va cham");
		}
	}

	private class MyAdapter extends MouseMotionAdapter {
		@Override
		public void mouseMoved(MouseEvent e) {
			myChar.mouseMoved(e);
		}
	}
}

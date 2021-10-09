package Paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class SketchMouseFrame extends JFrame {
	public SketchMouseFrame() {
		setTitle("MouseEvent Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(new MousePanel());
		setSize(600, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SketchMouseFrame();
	}

	class MousePanel extends JPanel {
		Color color = Color.RED;
		Point lastPoint;
		boolean started = false;
		List<Point> points = new ArrayList<Point>();

		public MousePanel() {
			setFocusable(true);
			MouseAdapter mouse = new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent event) {
					if (event.getButton() == event.BUTTON1) { // left click
						started = true;
					} else if (event.getButton() == event.BUTTON3) { // right click
						started = false;
					}
				}

				@Override
				public void mouseMoved(MouseEvent event) {
					if (!started)
						return;
					lastPoint = new Point(event.getX(), event.getY());
					points.add(lastPoint);
					repaint();
				}
			};

			addMouseListener(mouse);
			addMouseMotionListener(mouse);

			addKeyListener(new KeyListener() {

				@Override
				public void keyTyped(KeyEvent e) {
				}

				@Override
				public void keyReleased(KeyEvent e) {

				}

				@Override
				public void keyPressed(KeyEvent e) {
					int code = e.getKeyCode();
					System.out.println(code);
					if (e.isControlDown()) {
						switch (code) {
						case KeyEvent.VK_R:
							color = Color.RED;
							break;
						case KeyEvent.VK_G:
							color = Color.GREEN;
							break;
						case KeyEvent.VK_B:
							color = Color.BLUE;
							break;
						}
					}
				}
			});
		}

		@Override
		public void paintComponent(Graphics g) {
			setBackground(Color.white);
			super.paintComponent(g);
			g.setColor(color);
			if (points.size() < 2)
				return;
			Point fp, lp;
			for (int i = 0; i < points.size() - 1; i++) {
				fp = points.get(i);
				lp = points.get(i + 1);
				g.drawLine(fp.x, fp.y, lp.x, lp.y);
			}
		}
	}
}

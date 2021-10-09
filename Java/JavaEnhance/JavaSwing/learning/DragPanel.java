package learning;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DragPanel extends JPanel {
	ImageIcon image = new ImageIcon(
			new ImageIcon("./src/learning/rocketIcon.png").getImage().getScaledInstance(200, 200, 50));
	final int WIDTH = image.getIconWidth();
	final int HEIGHT = image.getIconHeight();
	Point imageCorner;
	Point prevPt;
	JFrame frame = new JFrame();

	public DragPanel() {

		imageCorner = new Point(0, 0);
		ClickListener clickListener = new ClickListener();
		DragListener dragListener = new DragListener();
		this.addMouseListener(clickListener);
		this.addMouseMotionListener(dragListener);

		frame.add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setTitle("drag and drog demo");
		frame.setVisible(true);

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		image.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY());
	}

	private class ClickListener extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			prevPt = e.getPoint();
		}
	}

	private class DragListener extends MouseMotionAdapter {
		public void mouseDragged(MouseEvent e) {
			Point currentPt = e.getPoint();
			imageCorner.translate((int) (currentPt.getX() - prevPt.getX()), (int) (currentPt.getY() - prevPt.getY()));
			prevPt = currentPt;
			repaint();
		}
	}

	public static void main(String[] args) {
		new DragPanel();
	}

}

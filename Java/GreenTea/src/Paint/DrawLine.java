package Paint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawLine extends MainArea {
	private MouseHandler mouseHandler = new MouseHandler();
	static Point p1 = new Point(0, 0);
	static Point p2 = new Point(0, 0);
	private boolean drawing;

	// Store lines in an arraylist
	private ArrayList<Line> lines = new ArrayList<>();

	public DrawLine() {
		content.addMouseListener(mouseHandler);
		content.addMouseMotionListener(mouseHandler);
	}

	private class MouseHandler extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			drawing = true;
			p1 = e.getPoint();
			p2 = p1;
			content.repaint();
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			drawing = false;
			p2 = e.getPoint();
			content.repaint();
			lines.add(new Line(p1, p2));
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			if (drawing) {
				p2 = e.getPoint();
				content.repaint();
			}
		}
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.black);
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setStroke(new BasicStroke(8, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL));
		g.drawLine(p1.x, p1.y, p2.x, p2.y);
		// draw all previous lines
		for (int i = 0; i < lines.size(); i++) {
			g.drawLine(lines.get(i).p1.x, lines.get(i).p1.y, lines.get(i).p2.x, lines.get(i).p2.y);
		}
	}

	public class Line {
		Point p1;
		Point p2;

		public Line(Point p1, Point p2) {
			this.p1 = p1;
			this.p2 = p2;
		}
	}
}

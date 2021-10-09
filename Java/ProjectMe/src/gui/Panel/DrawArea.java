package gui.Panel;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Line2D;

import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class DrawArea extends JComponent implements ChangeListener {

	// Image in which we're going to draw
	private Image image;
	// Graphics2D object ==> used to draw on
	private Graphics2D g2;
	private Graphics g;
	// Mouse coordinates
	private int currentX, currentY, oldX, oldY;
	private Color color;
	JColorChooser colorChooser;

	public DrawArea() {

		setDoubleBuffered(false);
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				// save coord x,y when mouse is pressed
				oldX = e.getX();
				oldY = e.getY();
			}
		});

		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				// coord x,y when drag mouse
				currentX = e.getX();
				currentY = e.getY();

				if (g2 != null) {
					// draw line if g2 context not null
					g2.drawLine(oldX, oldY, currentX, currentY);
					// refresh draw area to repaint
					repaint();
					// store current coords x,y as olds x,y
					oldX = currentX;
					oldY = currentY;
				}
			}
		});
	}

	protected void paintComponent(Graphics g) {
		if (image == null) {
			// image to draw null ==> we create
			image = createImage(getSize().width, getSize().height);
			g2 = (Graphics2D) image.getGraphics();
			// enable antialiasing
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			// clear draw area
			clear();
		}

		g.drawImage(image, 0, 0, null);
	}

	// now we create exposed methods
	public void clear() {
		g2.setPaint(Color.white);
		// draw white on entire draw area to clear
		g2.fillRect(0, 0, getSize().width, getSize().height);
		repaint();
	}

	public void pencil() {
		g2.setPaint(Color.black);
		g2.setPaint(color);
		g2.setStroke(new BasicStroke(MainPanel.slider.getValue(), BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL));
		MainPanel.slider.addChangeListener(this);
		// khu rang cua
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	}

	public void color() {
		colorChooser = new JColorChooser();
		color = new JColorChooser().showDialog(null, "pick a color", Color.white);
	}

	public void noPencil() {
		g2.setPaint(Color.white);

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		g2.setStroke(new BasicStroke(MainPanel.slider.getValue()));
	}

}


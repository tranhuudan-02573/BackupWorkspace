package _2DGraphic;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	Image image;

	public MyPanel() {
		image = new ImageIcon("./src/_2DGraphic/sky2.png").getImage();
		// TODO Auto-generated constructor stub
		this.setPreferredSize(new Dimension(500, 500));

	}

	public void paint(Graphics g) {

		Graphics2D g2D = (Graphics2D) g;
		g2D.drawImage(image, 70, 70, null);
		g2D.setPaint(Color.blue);
		// do day cua hinh duoc ve
//		g2D.setStroke(new BasicStroke(5));
		g2D.drawLine(0, 0, 500, 500);
		g2D.drawRect(0, 0, 100, 200);

		g2D.fillRect(200, 200, 100, 200);

		g2D.drawOval(300, 300, 100, 100);

		g2D.fillOval(400, 400, 100, 100);
		g2D.setPaint(Color.red);
		g2D.drawArc(500, 500, 100, 100, 0, 180);
		g2D.fillArc(500, 500, 100, 100, 0, 180);
		g2D.setPaint(Color.white);
		g2D.fillArc(500, 500, 100, 100, 180, 180);

		int[] xPoints = { 150, 250, 350 };
		int[] yPoints = { 300, 150, 300 };
		g2D.setPaint(Color.yellow);
		g2D.drawPolygon(xPoints, yPoints, 3);

		g2D.fillPolygon(xPoints, yPoints, 3);

		g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
		g2D.drawString("U  R A  WINNER! ", 50, 50);

	}
}

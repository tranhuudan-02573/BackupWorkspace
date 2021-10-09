package Paint;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class MyPanel extends JPanel {

	@Override
	public void paintComponent(Graphics canvas) {
		setBackground(Color.white);
		super.paintComponent(canvas);
		canvas.setColor(Color.red);
		canvas.drawLine(0, 0, getWidth(), getHeight());
		canvas.setColor(Color.GREEN);
		canvas.drawRect(100, 100, 200, 100);
	}


}

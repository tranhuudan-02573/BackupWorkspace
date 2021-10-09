package Paint;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class MouseButton extends JFrame {
	class MyButton extends JButton {
		Color bgColor;

		public MyButton(String text) {
			super(text);
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					bgColor = getBackground();
					setBackground(Color.GREEN);
				}

				@Override
				public void mouseExited(MouseEvent e) {
					setBackground(bgColor);
				}
			});
		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawLine(0, 0, getWidth(), getHeight());
		}

	}

	public MouseButton() {
		MyButton button = new MyButton("Test Button");

		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(button);

		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new MouseButton();

	}

}

package learning;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyKeyListener extends JFrame implements java.awt.event.KeyListener {
	JLabel label;
	ImageIcon icon;

	public MyKeyListener() {
		icon = new ImageIcon(new ImageIcon("./JavaSwing/learning/rocketIcon.png").getImage().getScaledInstance(50, 50,
				Image.SCALE_DEFAULT));

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addKeyListener(this);
		this.setLayout(null);
		this.setSize(500, 500);
		label = new JLabel();

		label.setBounds(0, 0, 250, 250);
//		label.setBackground(Color.red);
//		label.setOpaque(true);
		label.setIcon(icon);
		this.add(label);
		this.getContentPane().setBackground(Color.black);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyChar()) {
		case 'a':
			label.setLocation(label.getX() - 10, label.getY());
			break;
		case 'w':
			label.setLocation(label.getX(), label.getY() - 10);
			break;
		case 's':
			label.setLocation(label.getX(), label.getY() + 10);
			break;
		case 'd':
			label.setLocation(label.getX() + 10, label.getY());
			break;
		}
		// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
		case 37:

			label.setLocation(label.getX() - 10, label.getY());
			break;
		case 38:

			label.setLocation(label.getX(), label.getY() - 10);
			break;
		case 40:

			label.setLocation(label.getX(), label.getY() + 10);
			break;
		case 39:

			label.setLocation(label.getX() + 10, label.getY());
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

		System.out.println("you released key code: " + e.getKeyCode());
		System.out.println("you released key char: " + e.getKeyChar());
	}

	public static void main(String[] args) {
		new MyKeyListener();
	}
}

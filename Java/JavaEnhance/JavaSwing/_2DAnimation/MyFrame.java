package _2DAnimation;

import javax.swing.JFrame;


public class MyFrame extends JFrame {
	MyPanel panel;

	public MyFrame() {
		panel = new MyPanel();
		this.add(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.pack();
		this.setVisible(true);
	}
	
}

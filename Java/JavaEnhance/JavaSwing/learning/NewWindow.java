package learning;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	JFrame frame = new JFrame();
	JLabel label = new JLabel("hello!");

	public NewWindow() {

		label.setBounds(0, 0, 100, 50);
		label.setFont(new Font(null, Font.PLAIN, 25));
		frame.add(label);
		// TODO Auto-generated constructor stub
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}

package _4;

import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingApplication extends JFrame {
	private static String labelPrefix = "Number of button clicks: ";
	private int numClicks = 0;

	public SwingApplication(String title) {
		super(title);
		// Setting up a button and label
		final JLabel label = new JLabel(labelPrefix + "0    ");
		JButton button = new JButton("I'm a Swing button!");
		button.setMnemonic(KeyEvent.VK_I);
		// Handling event
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numClicks++;

				label.setText(labelPrefix + numClicks);
			}
		});
		JPanel pan = new JPanel();
		// Adding borders around components
		pan.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		// Setting up the layout
		pan.setLayout(new GridLayout(0, 1));
		// Adding components to container
		pan.add(button);
		pan.add(label);
		// Setting up the top-level container
		this.add(pan);
		// Handling event
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Calculating a frame size
		this.pack();

	};

	public static void main(String[] args) {
		SwingApplication s1 = new SwingApplication("vd");
		s1.setVisible(true);
//		s1.setSize(400, 300);
	}

}

package Test;

import java.awt.Dimension;
import javax.swing.*;

public class BoxLayoutFixedSizedElement extends JFrame {

	public BoxLayoutFixedSizedElement() {
		super("Fix Width");

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JButton button = new JButton("ABCD");
		button.setPreferredSize(new Dimension(100, 40));
		button.setMaximumSize(new Dimension(100, 40));
		panel.add(button);

		button = new JButton("ABCD 123456");
		button.setPreferredSize(new Dimension(100, 40));
		button.setMaximumSize(new Dimension(100, 40));
		panel.add(button);

		button = new JButton("1");
		button.setPreferredSize(new Dimension(100, 40));
		button.setMaximumSize(new Dimension(100, 40));
		panel.add(button);

		getContentPane().add(panel);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new BoxLayoutFixedSizedElement();

	}

}

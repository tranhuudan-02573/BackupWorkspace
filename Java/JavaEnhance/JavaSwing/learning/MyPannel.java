package learning;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPannel {
	public static void main(String[] args) {

		ImageIcon icon = new ImageIcon("./src/learning/row.png");

		JLabel label = new JLabel();
		label.setText("hi");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.RIGHT);
		label.setBounds(100, 100, 75, 75);

		JPanel redPannel = new JPanel();
		redPannel.setBackground(Color.red);
		redPannel.setBounds(0, 0, 250, 250);
		redPannel.setLayout(null);

		JPanel bluePannel = new JPanel();
		bluePannel.setBackground(Color.blue);
		bluePannel.setBounds(0, 250, 500, 250);
		bluePannel.setLayout(null);

		JPanel greenPannel = new JPanel();
		greenPannel.setBackground(Color.green);
		greenPannel.setBounds(250, 0, 250, 250);
		greenPannel.setLayout(null);

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(750, 750);

		frame.setVisible(true);
		frame.setLayout(null);

		bluePannel.add(label);
		frame.add(redPannel);
		frame.add(greenPannel);
		frame.add(bluePannel);

	}

}

package learning;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class MyColorChooser extends JFrame implements ActionListener {
	JButton button;
	JLabel label;

	public MyColorChooser() {
		button = new JButton("pick a color");

		label = new JLabel();
		label.setBackground(Color.white);
		label.setOpaque(true);
		label.setText("this is some text");
		label.setFont(new Font("MV Boli", Font.PLAIN, 100));

		button.addActionListener(this);
		this.add(button);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.add(button);
		this.add(label);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.pack();
	}

	public static void main(String[] args) {
		new MyColorChooser();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			JColorChooser colorChooser = new JColorChooser();

			Color color = new JColorChooser().showDialog(null, "pick a color", Color.black);
			label.setForeground(color);
			label.setBackground(color);
		}
	}

}

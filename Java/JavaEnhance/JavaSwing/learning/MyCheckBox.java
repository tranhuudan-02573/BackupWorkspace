package learning;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyCheckBox extends JFrame implements ActionListener {
	JButton button;
	JCheckBox checkBox;

	MyCheckBox() {
		checkBox = new JCheckBox();
		checkBox.setText("im not is robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("consolas", Font.PLAIN, 35));
		button = new JButton();
		button.setText("submit");
		button.addActionListener(this);

		this.add(button);
		this.add(checkBox);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			System.out.println(checkBox.isSelected());

		}
	}

	public static void main(String[] args) {
		new MyCheckBox();

	}
}

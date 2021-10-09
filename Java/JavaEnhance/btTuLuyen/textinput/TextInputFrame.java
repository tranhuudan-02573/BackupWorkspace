package textinput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextInputFrame extends JFrame implements ActionListener {
	JLabel statusLabel;
	JTextField textField;

	public TextInputFrame(String title) {
		super(title);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		textField = new JTextField("Default input", 20);
		textField.addActionListener(this);
		// textField.setEditable(false);
		panel.add(textField, BorderLayout.NORTH);
		statusLabel = new JLabel("No Text");
		panel.add(statusLabel, BorderLayout.SOUTH);

		getContentPane().add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		show();
	}

	public void actionPerformed(ActionEvent e) {
		statusLabel.setText(textField.getText());
	}
}
package textinput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.text.*;

public class FormatTextFrame extends JFrame implements ActionListener {
	JLabel statusLabel;
	WholeNumberField textField;

	public FormatTextFrame(String title) {
		super(title);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 1));
		textField = new WholeNumberField(100, 8);
		textField.addActionListener(this);
		// textField.setEditable(false);
		panel.add(textField);

		MaskFormatter formatter;
		JFormattedTextField ssnField;
		try {
			formatter = new MaskFormatter("*");
			formatter.setValidCharacters("0123456789.");
//      formatter.setPlaceholderCharacter('0');
			ssnField = new JFormattedTextField(formatter);
			ssnField.setValue("078051120");
			panel.add(ssnField);
		} catch (Exception e) {
		}
		;

		statusLabel = new JLabel("No Text");
		panel.add(statusLabel);
		getContentPane().add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		show();
	}

	public void actionPerformed(ActionEvent e) {
		int v = textField.getValue();
		statusLabel.setText("" + v);
	}

	public static void main(String[] args) {
		new FormatTextFrame("Test");
	}
}

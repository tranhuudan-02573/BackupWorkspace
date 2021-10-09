package Calculator;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator extends JFrame implements java.awt.event.ActionListener {

	JButton buttons[] = new JButton[16];
	String buttonsName[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/", ".", "=" };
	String str = "";
	float a, b;
	JTextField text;
	GridBagLayout gb;
	GridBagConstraints gbc;

	Calculator(String title) {
		super(title);
		for (int i = 0; i < 16; i++) {
			buttons[i] = new JButton(buttonsName[i]);
			buttons[i].addActionListener(this);
		}

		setLayout(gb = new GridBagLayout());
		gbc = new GridBagConstraints();

		gbc.fill = GridBagConstraints.BOTH;
		text = new JTextField(32);
		addComponent(text, 0, 0, 4, 1);
		addComponent(buttons[7], 1, 0, 1, 1);
		addComponent(buttons[8], 1, 1, 1, 1);
		addComponent(buttons[9], 1, 2, 1, 1);
		addComponent(buttons[13], 1, 3, 1, 1);

		addComponent(buttons[4], 2, 0, 1, 1);
		addComponent(buttons[5], 2, 1, 1, 1);
		addComponent(buttons[6], 2, 2, 1, 1);
		addComponent(buttons[12], 2, 3, 1, 1);

		addComponent(buttons[1], 3, 0, 1, 1);
		addComponent(buttons[2], 3, 1, 1, 1);
		addComponent(buttons[3], 3, 2, 1, 1);
		addComponent(buttons[11], 3, 3, 1, 1);

		addComponent(buttons[0], 4, 0, 1, 1);
		addComponent(buttons[14], 4, 1, 1, 1);
		addComponent(buttons[15], 4, 2, 1, 1);
		addComponent(buttons[10], 4, 3, 1, 1);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		for (int i = 0; i < 15; i++) {
			if (e.getSource() == buttons[i])
				text.setText(str += buttonsName[i]);
		}
		if (e.getSource() == buttons[15]) { // Addition, Subtraction, Multiplication, Division
			if (str.indexOf("+") != -1) {
				a += Float.parseFloat(str.substring(0, str.indexOf("+")));
				b += Float.parseFloat(str.substring(str.indexOf("+") + 1, str.length()));
				text.setText(String.valueOf(a + b)); // Show result
				str = "";
				a = 0;
				b = 0; // Restart show & vaiable a, b
			}
			if (str.indexOf("-") != -1) {
				a += Float.parseFloat(str.substring(0, str.indexOf("-")));
				b += Float.parseFloat(str.substring(str.indexOf("-") + 1, str.length()));
				text.setText(String.valueOf(a - b)); // Show result
				str = "";
				a = 0;
				b = 0; // Restart show & vaiable a, b
			}
			if (str.indexOf("*") != -1) {
				a += Float.parseFloat(str.substring(0, str.indexOf("*")));
				b += Float.parseFloat(str.substring(str.indexOf("*") + 1, str.length()));
				text.setText(String.valueOf(a * b)); // Show result
				str = "";
				a = 0;
				b = 0; // Restart show & vaiable a, b
			}
			if (str.indexOf("/") != -1) {
				a += Float.parseFloat(str.substring(0, str.indexOf("/")));
				b += Float.parseFloat(str.substring(str.indexOf("/") + 1, str.length()));
				text.setText(String.valueOf(a / b)); // Show result
				str = "";
				a = 0;
				b = 0; // Restart show & vaiable a, b
			}
		}
	}

	private void addComponent(java.awt.Component c, int row, int col, int nrow, int ncol) {
		gbc.gridx = col;
		gbc.gridy = row;
		gbc.gridwidth = nrow;
		gbc.gridheight = ncol;
		gbc.insets = new java.awt.Insets(2, 2, 2, 2);
		gb.setConstraints(c, gbc);
		add(c);
	}

	public static void main(String args[]) {
		Calculator cal = new Calculator("Calculator");
		cal.setSize(200, 190);
		cal.dispose();
		cal.setVisible(true);
	}
}
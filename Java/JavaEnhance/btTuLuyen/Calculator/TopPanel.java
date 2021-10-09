package Calculator;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

class TopPanel extends JPanel {

	JLabel display;

	public TopPanel() {
		display = new JLabel("0");
		add(display);
		setBackground(Color.GREEN);
	}

}
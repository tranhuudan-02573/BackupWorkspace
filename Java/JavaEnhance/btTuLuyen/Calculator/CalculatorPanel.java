package Calculator;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class CalculatorPanel extends JPanel {

	public CalculatorPanel() {
		TopPanel topPanel;
		setLayout(new BorderLayout());
		add(topPanel = new TopPanel(), BorderLayout.NORTH);
		add(new CenterPanel(topPanel), BorderLayout.CENTER);
	}
}

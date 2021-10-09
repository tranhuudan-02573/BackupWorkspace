package Calculator;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CenterPanel extends JPanel {
	TopPanel topPanel;

	String value = "0";

	public CenterPanel(TopPanel topPanel) {
		this.topPanel = topPanel;
		ActionListener numAction = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				addNum(e.getActionCommand());
			}
		};
		setLayout(new GridLayout(4, 4, 5, 5));
		add(createNumButton("1", numAction));
		add(createNumButton("2", numAction));
		add(createNumButton("3", numAction));
		add(new JButton("+"));

		add(createNumButton("4", numAction));
		add(createNumButton("5", numAction));
		add(createNumButton("6", numAction));
		add(new JButton("-"));

		add(createNumButton("7", numAction));
		add(createNumButton("8", numAction));
		add(createNumButton("9", numAction));
		add(new JButton("x"));

		add(createNumButton("0", numAction));
		add(createNumButton(".", numAction));
		add(new JButton("="));
		add(new JButton("/"));

	}

	JButton createNumButton(String text, ActionListener numAction) {
		JButton button = new JButton(text);
		button.addActionListener(numAction);
		button.setActionCommand(text);
		return button;
	}

	public void addNum(String text) {
		if (text.equals(".")) {
			if (value.indexOf(".") > -1)
				return;
			if (value.isEmpty())
				return;
		}
		value += text;
		if (value.startsWith("0")) {
			if ((value.length() > 1) && (value.charAt(1) != '.'))
				value = value.substring(1);
		}
		topPanel.display.setText(value);
	}

}

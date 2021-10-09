package MimiAutoCAD;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.TextArea;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class StatusBarMiniAutoCAD extends JPanel {
	JTextField textfield;
	TextArea textArea;
	JScrollPane scroll;

	public StatusBarMiniAutoCAD() {

		setLayout(new BorderLayout());
		textfield = new JTextField("cmd.....");
		textArea = new TextArea(5, 10);
		textArea.setBackground(new Color(200, 200, 170));
		textArea.setEditable(false);
		textArea.setForeground(Color.black);
		textfield.setEditable(false);
		scroll = new JScrollPane(textArea);
		add(textfield, "South");
		add(textArea, "Center");
	}

	public JTextField getTextfield() {
		return textfield;
	}

	public void setTextfield(JTextField textfield) {
		this.textfield = textfield;
	}

	public TextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(String string) {
		this.textArea.append(string);
	}
}

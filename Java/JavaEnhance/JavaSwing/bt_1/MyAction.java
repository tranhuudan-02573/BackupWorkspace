package bt_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyAction implements ActionListener {
	JTextArea textArea;
	JTextField textField;
	int count;

	public MyAction(JTextArea a, JTextField f) {
		count = 0;
		textArea = a;
		textField = f;

		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		System.out.println(action);
		// TODO Auto-generated method stub
		if (action.equalsIgnoreCase("Enter")) {
			String text = textField.getText();
			count++;
			textArea.append(count + " " + text + "\n");
			textField.setText("");
		} else if (action.equalsIgnoreCase("Clear")) {
			textArea.setText("");
			textField.setText("");
			count = 0;
		}
	}
}

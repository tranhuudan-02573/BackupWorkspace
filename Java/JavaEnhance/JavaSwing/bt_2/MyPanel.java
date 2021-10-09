package bt_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.List;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	List list;
	JLabel label;
	MyAction myAction;

	public MyPanel() {
		list = new List();
		list.setFont(new Font("segoe ui", Font.BOLD, 21));
		list.add("monday");
		list.add("Tuesday");
		list.add("Wednesday");
		list.add("Thursday");
		list.add("Friday");
		list.add("Saturday");
		list.add("Sunday");
		label = new JLabel("double click a day", JLabel.CENTER);
		label.setFont(new Font("segoe ui", Font.BOLD, 21));
		setLayout(new BorderLayout());
		add(label, BorderLayout.NORTH);
		add(list, BorderLayout.CENTER);
		myAction = new MyAction(label);

		list.addActionListener(myAction);
	}

}

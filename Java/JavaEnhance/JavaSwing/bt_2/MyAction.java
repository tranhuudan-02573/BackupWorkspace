package bt_2;

import java.awt.Color;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class MyAction implements ActionListener {
	JLabel lb;

	public MyAction(JLabel label) {
		lb = label;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (!(e.getSource() instanceof List))
			return;
		lb.setForeground(Color.red);
		List li = (List) e.getSource();
		lb.setText(li.getSelectedItem());

	}
}

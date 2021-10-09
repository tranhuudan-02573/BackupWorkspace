package learning;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class OpenNewWindow implements ActionListener {
	JFrame frame = new JFrame();
	JButton myButton = new JButton("new Window");

	OpenNewWindow() {
		myButton.setBounds(100, 160, 200, 40);
		myButton.setFocusable(false);
		myButton.addActionListener(this);

		frame.add(myButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new OpenNewWindow();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == myButton) {
			frame.dispose();
			NewWindow myWindow = new NewWindow();
		}

	}
}

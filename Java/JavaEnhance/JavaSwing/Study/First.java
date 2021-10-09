package Study;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class First {
	First() {
		JFrame frame = new JFrame();
		JLabel label = new JLabel("<html>  Hello World "
				+ "<span style='font-size:18.0pt;color:rgb(255,55,255);background: #eab1bb;padding:100pt;margin:100pt;'>SWING </html>");
		frame.getContentPane().add(label);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new First();
	}
}
  
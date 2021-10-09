package Paint;

import javax.swing.*;

public class Paint extends JFrame {

	public Paint() {
		super("My Custom Painting");

		MyPanel panel = new MyPanel();
		getContentPane().add(panel);

		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Paint();
	}

}

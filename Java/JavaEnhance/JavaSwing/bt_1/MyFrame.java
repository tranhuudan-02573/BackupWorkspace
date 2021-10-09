package bt_1;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		super("bai tap 2");

		MyPanel myPanel = new MyPanel();
		add(myPanel);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

	}

	public static void main(String[] args) {
		new MyFrame();
	}
}

package bt_2;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		super("tran huu dan");
		MyPanel myPanel = new MyPanel();
		add(myPanel);
		setSize(400, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new MyFrame();
	}
}

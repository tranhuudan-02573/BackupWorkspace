package Layout;

import java.awt.Button;
import java.awt.HeadlessException;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyBoxLayout extends JFrame {
//	private static final int Y_AXYS = 0;

	public MyBoxLayout(String title) throws HeadlessException {
		super(title);
		initUI();
	}

	Button buttons[];

	private void initUI() {
		this.setSize(400, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pn = new JPanel();
		pn.setLayout(new BoxLayout(pn, BoxLayout.X_AXIS));
		buttons = new Button[10];

		for (int i = 0; i < 10; i++) {
			buttons[i] = new Button("Button " + (i + 1));
			pn.add(buttons[i]);
		}

		this.add(pn);

	}

	public static void main(String[] args) {
		MyBoxLayout test = new MyBoxLayout("KKK");
		test.setVisible(true);

	}
}
//
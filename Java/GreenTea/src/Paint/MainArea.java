package Paint;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class MainArea  extends JPanel{
	protected JFrame frame;
	protected Container content;
	public MainArea() {
		frame = new JFrame();
		content = frame.getContentPane();
		// TODO Auto-generated constructor stub
	}
}

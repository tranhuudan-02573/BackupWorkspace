package MimiAutoCAD;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

//import org.graalvm.compiler.nodes.Invoke;
public class MainFrame extends JFrame {

	private MenuBarAutoCAD menuBarAutoCAD;
	private Floor floor;

	public MainFrame() {
		super("MiniAutoCAD");
		floor = new Floor();
		menuBarAutoCAD = new MenuBarAutoCAD(floor);
		getContentPane().add(floor);
		setJMenuBar(menuBarAutoCAD);
		setSize(900, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MainFrame();
//		SwingUtilities.invokeLater(new Runnable() {
//
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//
//				new MainFrame();
//			}
//		});

	}

}

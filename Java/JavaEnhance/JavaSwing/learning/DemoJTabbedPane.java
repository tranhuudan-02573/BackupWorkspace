package learning;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class DemoJTabbedPane extends JFrame {

	public DemoJTabbedPane() {
		createGUI();
		setDisplay();
	}

	private void setDisplay() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void createGUI() {
		add(createTabbedPane());
	}

	private JTabbedPane createTabbedPane() {
		JTabbedPane tabbedPane = new JTabbedPane();

		/* create three JPanel, which is content of tabs */
		JPanel panel1 = createPane1();
		JPanel panel2 = createJPanel("content of panel 2");
		JPanel panel3 = createJPanel("content of panel 3");

		/* add three tab with three JPanel */
		tabbedPane.addTab("Tab 1", null, panel1, "click to show panel 1");
		tabbedPane.addTab("Tab 2", null, panel2, "click to show panel 2");
		tabbedPane.addTab("Tab 3", null, panel3, "click to show panel 3");

		return tabbedPane;
	}

	private JPanel createPane1() {
		JPanel panel = new JPanel();
		panel.add(new JScrollPane(createTextArea(10, 40)));
		return panel;
	}

	private JPanel createJPanel(String text) {
		JPanel panel = new JPanel(new GridLayout(1, 1));
		JLabel lb = new JLabel(text);
		lb.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lb);
		return panel;
	}

	private JTextArea createTextArea(int row, int col) {
		JTextArea ta = new JTextArea(row, col);
		ta.setWrapStyleWord(true);
		ta.setLineWrap(true);
		ta.setForeground(Color.BLUE);
		return ta;
	}

	public static void main(String[] args) {
		new DemoJTabbedPane();
	}
}

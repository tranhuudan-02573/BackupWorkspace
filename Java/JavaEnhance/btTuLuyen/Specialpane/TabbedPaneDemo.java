package Specialpane;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class TabbedPaneDemo extends JPanel {
	public TabbedPaneDemo() {
		ImageIcon icon = new ImageIcon("images/middle.gif");
		JTabbedPane tabbedPane = new JTabbedPane();
		JPanel panel ;
		panel = new JPanel();
		JButton button = new JButton("asdsad");
		panel.add(button);
		JLabel label = new JLabel("This is Tab one");
		label.setHorizontalAlignment(JLabel.CENTER);
		tabbedPane.addTab("One", icon, panel, "Does nothing");
		tabbedPane.setSelectedIndex(0);

		label = new JLabel("This is Tab Two");
		label.setHorizontalAlignment(JLabel.CENTER);
		tabbedPane.addTab("Two", icon, label, "This is Tab Two");

		JCheckBox checkBox = new JCheckBox("This is Tab Three");
		tabbedPane.addTab("Three", icon, checkBox, "Still does nothing");

		// Add the tabbed pane to this panel.
		setLayout(new GridLayout(1, 1));
		add(tabbedPane);

		tabbedPane.setBackgroundAt(1, Color.BLUE);
		tabbedPane.setForegroundAt(1, Color.red);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("TabbedPane Demo");
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		frame.getContentPane().add(new TabbedPaneDemo(), BorderLayout.CENTER);
		frame.setSize(400, 125);
		frame.setVisible(true);
	}
}

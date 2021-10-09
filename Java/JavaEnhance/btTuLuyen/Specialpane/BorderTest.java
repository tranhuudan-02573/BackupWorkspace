package Specialpane;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class BorderTest {

	public static void main(String[] args) {
		BorderFrame frame = new BorderFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show();
	}
}

class BorderFrame extends JFrame {
	public static final int DEFAULT_WIDTH = 600;
	public static final int DEFAULT_HEIGHT = 200;

	private JLabel demoPanel;
	private JPanel buttonPanel;
	private ButtonGroup group;

	public BorderFrame() {
		setTitle("BorderTest");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

//       demoPanel = new JPanel();
		demoPanel = new JLabel("Label Test");
		EmptyBorder empty = new EmptyBorder(15, 15, 15, 15);
		demoPanel.setBorder(empty);
		buttonPanel = new JPanel();
		group = new ButtonGroup();

		addRadioButton("Lowered bevel",
				BorderFactory.createCompoundBorder(empty, BorderFactory.createLoweredBevelBorder()));
		addRadioButton("Raised bevel", BorderFactory.createRaisedBevelBorder());
		addRadioButton("Etched", BorderFactory.createEtchedBorder());
		addRadioButton("Line", BorderFactory.createLineBorder(Color.BLUE));
		addRadioButton("Matte", BorderFactory.createMatteBorder(10, 10, 10, 10, Color.BLUE));
		addRadioButton("Empty", BorderFactory.createEmptyBorder());

		Border etched = BorderFactory.createEtchedBorder();
		Border titled = BorderFactory.createTitledBorder(etched, "Border types");
		buttonPanel.setBorder(titled);

		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(2, 1));
		contentPane.add(buttonPanel);
		contentPane.add(demoPanel);
	}

	public void addRadioButton(String buttonName, final Border b) {
		JRadioButton button = new JRadioButton(buttonName);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				demoPanel.setBorder(b);
				validate();
			}
		});
		group.add(button);
		buttonPanel.add(button);
	}
}

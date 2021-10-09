package Layout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyGridBagLayout extends JPanel {
	JButton b1, b2, b3, b4, b5;
	GridBagConstraints gbc = new GridBagConstraints();

	public MyGridBagLayout() {
		setLayout(new GridBagLayout());
		gbc.insets = new Insets(5, 5, 5, 5);
		b1 = new JButton("button1");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 5;
		gbc.fill = GridBagConstraints.VERTICAL;

		add(b1, gbc);

		b2 = new JButton("button2");
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridheight = 1;
	
		add(b2, gbc);

		b3 = new JButton("button3");
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		
		add(b3, gbc);

		b4 = new JButton("button4");
		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		
		add(b4, gbc);

		b5 = new JButton("button5");
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridheight = 1;
		gbc.gridwidth = 5;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		add(b5, gbc);

	}

	public static void main(String[] args) {
		MyGridBagLayout t = new MyGridBagLayout();
		JFrame jf = new JFrame();
		jf.setSize(500, 500);
		jf.setTitle("DemoGridBagLayout");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);

		jf.add(t);
		jf.setVisible(true);
	}
}

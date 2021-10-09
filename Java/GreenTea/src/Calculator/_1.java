package Calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class _1 extends JFrame {
	public _1(String title) throws HeadlessException {
		super(title);
		initUI();
	}

	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23;
	GridBagConstraints gbc = new GridBagConstraints();

	public void initUI() {
//		setLayout(null);
		JPanel panBot = new JPanel();
		JPanel panTop = new JPanel();
		JPanel panMain = new JPanel();
		panMain.setLayout(new BoxLayout(panMain, BoxLayout.Y_AXIS));
		panMain.add(panTop);
		panMain.add(panBot);

		this.add(panMain);
		panBot.setLayout(new GridBagLayout());

//		JTextField text = new JTextField(30);
		JTextArea text = new JTextArea(10, 40);

		panTop.setBorder(BorderFactory.createLineBorder(Color.black));

		panTop.add(text);
		
		gbc.insets = new Insets(20, 20, 20, 20);
		b1 = new JButton("1");
		gbc.gridx = 0;
		gbc.gridy = 11;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		
		panBot.add(b1, gbc);

		b2 = new JButton("2");
		gbc.gridx = 1;
		gbc.gridy = 11;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		panBot.add(b2, gbc);

		b3 = new JButton("3");
		gbc.gridx = 2;
		gbc.gridy = 11;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		panBot.add(b3, gbc);

		b4 = new JButton("4");
		gbc.gridx = 0;
		gbc.gridy = 10;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		panBot.add(b4, gbc);

		b5 = new JButton("5");
		gbc.gridx = 1;
		gbc.gridy = 10;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		panBot.add(b5, gbc);

		b6 = new JButton("6");
		gbc.gridx = 2;
		gbc.gridy = 10;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		panBot.add(b6, gbc);

		b6 = new JButton("7");
		gbc.gridx = 0;
		gbc.gridy = 9;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		panBot.add(b6, gbc);

		b7 = new JButton("8");
		gbc.gridx = 1;
		gbc.gridy = 9;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		panBot.add(b7, gbc);

		b8 = new JButton("9");
		gbc.gridx = 2;
		gbc.gridy = 9;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		panBot.add(b8, gbc);

		b9 = new JButton("=");
		gbc.gridx = 3;
		gbc.gridy = 12;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		b9.setBackground(Color.red);
		gbc.fill = GridBagConstraints.VERTICAL;
		panBot.add(b9, gbc);

		b10 = new JButton("+");
		gbc.gridx = 3;
		gbc.gridy = 11;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		b10.setBackground(Color.gray);
		panBot.add(b10, gbc);

		b11 = new JButton("-");
		gbc.gridx = 3;
		gbc.gridy = 10;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		b11.setBackground(Color.gray);
		panBot.add(b11, gbc);

		b12 = new JButton("x");
		gbc.gridx = 3;
		gbc.gridy = 9;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		b12.setBackground(Color.gray);
		panBot.add(b12, gbc);

		b13 = new JButton(".");
		gbc.gridx = 2;
		gbc.gridy = 12;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		panBot.add(b13, gbc);

		b14 = new JButton(",");
		gbc.gridx = 0;
		gbc.gridy = 12;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		panBot.add(b14, gbc);

		b15 = new JButton("0");
		gbc.gridx = 1;
		gbc.gridy = 12;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		panBot.add(b15, gbc);
//		panMain.add(panTop, panBot);

		b16 = new JButton("sqrt(x)");
		gbc.gridx = 2;
		gbc.gridy = 8;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		b16.setBackground(Color.gray);
		panBot.add(b16, gbc);

		b17 = new JButton("x^2");
		gbc.gridx = 1;
		gbc.gridy = 8;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		b17.setBackground(Color.gray);
		panBot.add(b17, gbc);

		b18 = new JButton("1/x");
		gbc.gridx = 0;
		gbc.gridy = 8;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		b18.setBackground(Color.gray);
		panBot.add(b18, gbc);

		b19 = new JButton("CE");
		gbc.gridx = 1;
		gbc.gridy = 7;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		b19.setBackground(Color.gray);
		panBot.add(b19, gbc);

		b20 = new JButton("C");
		gbc.gridx = 2;
		gbc.gridy = 7;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		b20.setBackground(Color.gray);
		panBot.add(b20, gbc);

		b21 = new JButton("%");
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		b21.setBackground(Color.gray);
		panBot.add(b21, gbc);

		b22 = new JButton("/");
		gbc.gridx = 3;
		gbc.gridy = 8;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		b22.setBackground(Color.gray);
		panBot.add(b22, gbc);

		b23 = new JButton("del");
		gbc.gridx = 3;
		gbc.gridy = 7;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		b23.setBackground(Color.gray);
		panBot.add(b23, gbc);
		
		ImageIcon image = new ImageIcon("mvc_diagram.png");
		this.setIconImage(image.getImage());

	}

	public static void main(String[] args) {
		_1 t = new _1("calculator");
		t.pack();
		
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t.setLocationRelativeTo(null);
		t.setVisible(true);
	}
}

package learning;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyButton extends JFrame implements ActionListener {
	JButton button;
	JLabel label;

	public MyButton() {
		ImageIcon icon = new ImageIcon("./src/learning/row.png");
		ImageIcon icon2 = new ImageIcon("./src/learning/mvc_diagram.png");
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150, 250, 150, 150);
		label.setVisible(false);

		button = new JButton();
		button.setBounds(100, 100, 250, 100);
		button.addActionListener(this);
//		button.addActionListener(e -> System.out.println("poo"));
		button.setText("i am a button");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalAlignment(JButton.CENTER);
		button.setVerticalAlignment(JButton.BOTTOM);

		button.setFont(new Font("Comic Sans", Font.BOLD, 25));
		button.setIconTextGap(-15);
		button.setForeground(Color.cyan);
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

//
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource().equals(button)) {
			System.out.println("poo");
//			button.setEnabled(false);
			label.setVisible(true);

		}
	}

	public static void main(String[] args) {
		new MyButton();
	}

}

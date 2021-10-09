package learning;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyFrame {
	public static void main(String[] args) {
		ImageIcon image = new ImageIcon("./src/learning/mvc_diagram.png");
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		JLabel label = new JLabel();
		label.setText("xin chao");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);// set text LEFT,CENTER,RIGHT of imageicon
		label.setVerticalTextPosition(label.TOP);// set text TOP,CENTER,BOTTOM of imageicon
		label.setForeground(Color.RED);// set font color of text
		label.setFont(new Font("MV Boli", Font.PLAIN, 20));// set font off text
		label.setIconTextGap(-25);// set gap of text to image
		label.setBackground(Color.black);// set background color
		label.setOpaque(true);// display background color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);// set vertical position of icon + text within label
		label.setHorizontalAlignment(JLabel.CENTER);// set horzontal position of icon + text within label
//		label.setBounds(100, 100, 350, 350);// set x,y position within frame as well as dimension

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
//		frame.setSize(500, 500);
//		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		frame.setTitle("huudan");
		frame.pack();
	}
}

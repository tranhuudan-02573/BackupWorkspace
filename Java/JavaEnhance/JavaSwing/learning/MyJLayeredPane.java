package learning;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class MyJLayeredPane {
	public static void main(String[] args) {
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.red);
		label1.setBounds(50, 50, 200, 200);

		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.green);
		label2.setBounds(100, 100, 200, 200);

		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.blue);
		label3.setBounds(150, 150, 200, 200);

		JLayeredPane layerPane = new JLayeredPane();
		layerPane.setBounds(0, 0, 500, 500);

		layerPane.add(label1, JLayeredPane.DEFAULT_LAYER);
		layerPane.add(label2, JLayeredPane.DEFAULT_LAYER);
		layerPane.add(label3, JLayeredPane.DRAG_LAYER);

//		layerPane.add(label1,Integer.valueOf(0));
//		layerPane.add(label2,Integer.valueOf(2));
//		layerPane.add(label3,Integer.valueOf(1));

		JFrame frame = new JFrame("JLayeredPane");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(layerPane);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}

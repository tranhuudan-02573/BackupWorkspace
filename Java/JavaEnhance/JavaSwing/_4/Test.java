package _4;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test {
	JComboBox comboBox;
	ImageIcon icon;
	JLabel label;
	JPanel panelImg, panelOpt, panelMain;
	JFrame frame;

	Test() {
		frame = new JFrame();
		String[] animals = { "dog", "cat", "bird" };
		comboBox = new JComboBox(animals);
		comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == comboBox) {
					label.setIcon(new ImageIcon(new ImageIcon("./JavaSwing/_4/" + comboBox.getSelectedItem() + ".png")
							.getImage().getScaledInstance(150, 150, 0)));
				}
			}
		});
		label = new JLabel();
		label.setIcon(new ImageIcon(new ImageIcon("./JavaSwing/_4/dog.png").getImage().getScaledInstance(150, 150, 0)));
		panelImg = new JPanel();
		panelOpt = new JPanel();
		panelMain = new JPanel();
		panelOpt.add(comboBox);
		panelImg.add(label);
		panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
		panelMain.add(panelOpt);
		panelMain.add(panelImg);
		frame.add(panelMain);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Test();
	}
}

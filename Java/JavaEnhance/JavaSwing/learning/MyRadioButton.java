package learning;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyRadioButton extends JFrame implements ActionListener {
	JRadioButton pizzaButton, hamburgerButton, hotdogButton;
	ImageIcon icon ;
	MyRadioButton() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		pizzaButton = new JRadioButton("pizza");
		hamburgerButton = new JRadioButton("hamburger");
		hotdogButton = new JRadioButton("hotdog");
		
		icon = new ImageIcon("./src/learning/row.png");
		pizzaButton.setIcon(icon);
		hamburgerButton.setIcon(icon);
		hotdogButton.setIcon(icon);

		pizzaButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		hotdogButton.addActionListener(this);

		ButtonGroup group = new ButtonGroup();
		group.add(hotdogButton);
		group.add(pizzaButton);
		group.add(hamburgerButton);

		this.add(hotdogButton);
		this.add(hamburgerButton);
		this.add(pizzaButton);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == pizzaButton) {
			System.out.println("you ordered pizza");
		} else if (e.getSource() == hotdogButton) {
			System.out.println("you ordered hotdog");
		} else if (e.getSource() == hamburgerButton) {
			System.out.println("you ordered hamburger");
		}
	}

	public static void main(String[] args) {
		new MyRadioButton();

	}
}

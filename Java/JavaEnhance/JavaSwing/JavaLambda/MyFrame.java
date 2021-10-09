package JavaLambda;

import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame {

	JButton myButton = new JButton("MY BUTTON 1");
	JButton myButton2 = new JButton("MY BUTTON 2");

	MyFrame() {

		myButton.setBounds(100, 100, 200, 100);
		myButton.addActionListener(

				(e) -> System.out.println("This is the first button")

		);

		myButton2.setBounds(100, 200, 200, 100);
		myButton2.addActionListener(

				(e) -> System.out.println("This is the second button")

		);

		this.add(myButton);
		this.add(myButton2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420, 420);
		this.setLayout(null);
		this.setVisible(true);
	}
	 public static void main(String[] args) {
		new MyFrame();
	}
}

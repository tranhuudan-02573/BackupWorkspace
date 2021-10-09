package Calculator;

import java.awt.FlowLayout;

import javax.swing.*;

public class Calculator extends JFrame {
	public Calculator() {
		super("My Calculator");

//		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(new CalculatorPanel());

		setSize(400, 300);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Calculator();
	}

}

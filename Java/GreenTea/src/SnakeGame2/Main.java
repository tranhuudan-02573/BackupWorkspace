package SnakeGame2;

import java.awt.Color;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		GamePlay gamePlay = new GamePlay();
		f.setTitle("snack game");
		f.setBounds(10, 10, 905, 700);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBackground(Color.DARK_GRAY);
		f.add(gamePlay);
		f.setVisible(true);
	}
}

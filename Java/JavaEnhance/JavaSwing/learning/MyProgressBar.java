package learning;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class MyProgressBar {
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0, 100);

	public MyProgressBar()  {
		
		bar.setBounds(0, 0, 420, 50);
		bar.setStringPainted(true);
		bar.setValue(0);
		bar.setFont(new Font("MV Boli", Font.BOLD, 25));
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		fill();

	}

	private void fill()  {
		int couter = 0;
		while (couter <= 100) {
			bar.setValue(couter);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			couter += 1;

		}
		bar.setString("Done! ");
	}

	public static void main(String[] args)  {
		new MyProgressBar();
	}
}

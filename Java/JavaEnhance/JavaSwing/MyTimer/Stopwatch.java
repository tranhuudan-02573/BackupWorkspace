package MyTimer;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Stopwatch extends JFrame {
	JLabel timeLabel = new JLabel();
	int seconds = 10;
	int tictac = 100;
	String seconds_string = String.format("%02d", seconds);
	String tictiac_string = String.format("%02d", tictac);
	Timer timer = new Timer(1, new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			tictac--;
			if (tictac == 0) {
				tictac += 100;
			}
			tictiac_string = String.format("%02d", tictac);
			timeLabel.setText(seconds_string + ":" + tictiac_string);
		}

	});
	Timer timer2 = new Timer(1000, new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			seconds--;
			if (seconds == 0) {
				timer.stop();
				timer2.stop();
			}

			seconds_string = String.format("%02d", seconds);
			timeLabel.setText(seconds_string + ":" + tictiac_string);
		}
	});

	Stopwatch() {

		timer.start();
		timer2.start();
		timeLabel.setText(seconds_string + ":" + tictiac_string);
		timeLabel.setBounds(100, 100, 200, 100);
		timeLabel.setFont(new Font("Verdana", Font.PLAIN, 35));
		timeLabel.setBorder(BorderFactory.createBevelBorder(1));
		timeLabel.setOpaque(true);
		timeLabel.setHorizontalAlignment(JTextField.CENTER);

		this.add(timeLabel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420, 420);
		this.setLayout(null);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Stopwatch();
	}
}

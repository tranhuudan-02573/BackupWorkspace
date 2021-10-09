package Test;

import java.awt.Color;
import javax.swing.JFrame;

public class MainTest extends JFrame {
	public MainTest() {
		add(new CollisionDetection());
		setTitle("Collision detection test");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MainTest();
	}
}

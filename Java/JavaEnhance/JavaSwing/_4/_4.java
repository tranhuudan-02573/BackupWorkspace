package _4;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;

public class _4 extends JFrame {
	public _4(String title) throws HeadlessException {
		super(title);
		initUI();
	}

	private void initUI() {
		// TODO Auto-generated method stub
		this.setSize(500, 300);
		this.setAlwaysOnTop(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		JPanel pnBoxLayout = new JPanel();

		pnBoxLayout.setLayout(new BoxLayout(pnBoxLayout, BoxLayout.Y_AXIS));

		JButton btn1 = new JButton("nut1");
		Font Fbtn1 = new Font("Tahoma", Font.BOLD, 24);
		btn1.setFont(Fbtn1);
		btn1.setForeground(Color.red);

		JButton btn2 = new JButton("nut2");

		JButton btn3 = new JButton("nut3");

		JPanel pn1 = new JPanel();
		pn1.add(btn1);
		pnBoxLayout.add(pn1);

		JPanel pn2 = new JPanel();
		pn2.add(btn2);
		pnBoxLayout.add(pn2);

		JPanel pn3 = new JPanel();
		pn3.add(btn3);
		pnBoxLayout.add(pn3);

		this.add(pnBoxLayout);
	}

	public static void main(String[] args) {
		new _4("vd").setVisible(true);
	}
}

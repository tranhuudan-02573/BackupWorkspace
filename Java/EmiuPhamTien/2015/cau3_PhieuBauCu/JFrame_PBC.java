package cau3_PhieuBauCu;

import javax.swing.JFrame;

public class JFrame_PBC extends JFrame {
	protected PhieuBauCu bauCu;

	public JFrame_PBC() {
		bauCu = new PhieuBauCu(this);
		setContentPane(bauCu);
		display();
	}

	public void display() {
		// for jframe
		setTitle("Phiếu Bầu Cử Các Cấp");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new JFrame_PBC();
	}
}

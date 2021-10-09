package mytext;

import javax.swing.*;

public class Test {
	public static void main(String[] args) {
		JFrame win = new JFrame("Test Filtered Text Field");
		win.setDefaultCloseOperation(win.EXIT_ON_CLOSE);
		FilteredTextField input = new FilteredTextField("Nhap toa do tam:", 50);
		win.getContentPane().add(input);
		win.setSize(200, 100);
		win.setVisible(true);
//     JOptionPane.showMessageDialog(win, "Numeric only",
//             "Input Text Demo!", JOptionPane.ERROR_MESSAGE);
	}
}

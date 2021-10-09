package Layout;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MyCardLayout extends JFrame implements ActionListener {

	CardLayout card;
	JButton b1, b2, b3;
	Container c;

	public MyCardLayout() {
	        c = getContentPane();
	        // tao doi tuong CardLayout
	        // khong gian chieu ngang la 60 va chieu doc la 50
	        card = new CardLayout(60, 50);
	        c.setLayout(card);
	 
	        b1 = new JButton("Apple");
	        b2 = new JButton("Mango");
	        b3 = new JButton("Orange");
	        b1.addActionListener(this);
	        b2.addActionListener(this);
	        b3.addActionListener(this);
	 
	        c.add("a", b1);
	        c.add("b", b2);
	        c.add("c", b3);
	 
	        this.setTitle("Ví dụ CardLayout trong Java Swing");
	        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    }

	public void actionPerformed(ActionEvent e) {
		card.next(c);
	}

	public static void main(String[] args) {
		MyCardLayout cl = new MyCardLayout();
		cl.setSize(400, 300);
		cl.setVisible(true);

	}
}

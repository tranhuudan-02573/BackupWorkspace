package Layout;



import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	
public class MyBorderLayout extends JFrame{
	public MyBorderLayout(String title) throws HeadlessException{
		super(title);
		initUI();
	
	    
	    }

	private void initUI() {
		// TODO Auto-generated method stub
		this.setSize(500,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		JPanel pn = new JPanel();
		JButton btn1 = new JButton("North");
		JButton btn2 = new JButton("West");
		JButton btn3 = new JButton("South");
		JButton btn4 = new JButton("center");
		JButton btn5 = new JButton("East");
		pn.add(btn1,BorderLayout.NORTH);
		pn.add(btn2,BorderLayout.WEST);
		pn.add(btn3,BorderLayout.SOUTH);
		pn.add(btn4,BorderLayout.CENTER);
		pn.add(btn5,BorderLayout.EAST);
		this.add(pn);
		
	}
	public static void main(String[] args) {
		MyBorderLayout my = new MyBorderLayout("vidu");
		my.setVisible(true);
	}
	
}
